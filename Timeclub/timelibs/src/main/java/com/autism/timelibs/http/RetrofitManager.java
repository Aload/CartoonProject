package com.autism.timelibs.http;

import com.autism.timelibs.TimeApp;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.utils.NetStatusUtil;
import com.autism.timelibs.utils.SpUtils;
import com.autism.timelibs.utils.ViewUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author autism
 *         <p>
 *         网络请求类
 */
public class RetrofitManager {
    public static String PLAYERBASE = "http://videoapi.ifenghui.com";
    private static Retrofit mRetrofit;

    public static Retrofit getRetrofit() {
        return getRetrofit(getHost());
    }

    private static String getHost() {
        return PLAYERBASE;
    }

    /**
     * 设缓存有效期为两天
     */
    private static final long CACHE_STALE_SEC = 60 * 60 * 24 * 2;
    private static volatile OkHttpClient sOkHttpClient;

    private static Retrofit getRetrofit(String url) {
        if (null == mRetrofit || !url.equals(mRetrofit.baseUrl().toString())) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            mRetrofit = new Retrofit.Builder()
                    .client(getOkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.createAsync())
                    .baseUrl(url)
                    .build();
        }
        return mRetrofit;
    }

    private static OkHttpClient getOkHttpClient() {
        if (sOkHttpClient == null) {
            synchronized (RetrofitManager.class) {
                Cache cache = new Cache(new File(TimeApp.getmContext().getCacheDir(), "HttpCache"),
                        1024 * 1024 * 100);
                if (sOkHttpClient == null) {
                    sOkHttpClient = new OkHttpClient.Builder().cache(cache)
                            .connectTimeout(10, TimeUnit.SECONDS)
                            .readTimeout(10, TimeUnit.SECONDS)
                            .writeTimeout(10, TimeUnit.SECONDS)
                            .addInterceptor(mRewriteCacheControlInterceptor)
                            .addNetworkInterceptor(mRewriteCacheControlInterceptor)
                            .addInterceptor(mLoggingInterceptor)
                            .build();
                }
            }
        }
        return sOkHttpClient;
    }

    /**
     * 云端响应头拦截器，用来配置缓存策略
     * Dangerous interceptor that rewrites the server's cache-control header.
     */
    private static final Interceptor mRewriteCacheControlInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {

            Request request = chain.request();
            if (!NetStatusUtil.isConnectToNet(TimeApp.getmContext())) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }
            Response originalResponse = chain.proceed(request);
            if (NetStatusUtil.isConnectToNet(TimeApp.getmContext())) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
                String cacheControl = request.cacheControl().toString();
                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .removeHeader("Pragma")
                        .build();
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + CACHE_STALE_SEC)
                        .removeHeader("Pragma")
                        .build();
            }
        }
    };

    private static final Interceptor mLoggingInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            String cookies = SpUtils.getInstance().readString("cookies");
            Request newRequest = request.newBuilder()
                    .addHeader("Cookie", ViewUtil.isNullOrEmpty(cookies) ? "" : cookies)
                    .addHeader("User-Agent", "Android_4.6.5")
                    .build();
            Response response = chain.proceed(newRequest);
            String header = response.header("Set-Cookie");
            LineLog.d("Cookies", header);
            SpUtils.getInstance().writeString("cookies", header);
            return response;
        }
    };
}
