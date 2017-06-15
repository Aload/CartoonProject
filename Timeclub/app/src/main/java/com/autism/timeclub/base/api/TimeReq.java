package com.autism.timeclub.base.api;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timelibs.http.RetrofitManager;
import com.autism.timelibs.http.RxUtil;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import retrofit2.Retrofit;
import rx.Subscriber;

/**
 * Author：autism on 2017/6/13 11:17
 * Used:Timeclub
 */
public class TimeReq {
    private static TimeReq INSTANCE;
    private TimeApi mTimeApi;

    public static TimeReq getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new TimeReq();
        }
        return INSTANCE;
    }

    private TimeReq() {
        Retrofit retrofit = RetrofitManager.getRetrofit();
        mTimeApi = retrofit.create(TimeApi.class);
    }

    /**
     * column数据
     *
     * @param subscriber
     * @param mUserId
     * @param mVersion
     * @param mLoginId
     */
    public void getHomeHot(Subscriber<JsonObject> subscriber, String mUserId, String mVersion, int mLoginId) {
        mTimeApi.getHomeHot("Status", "getNewIndexHot", mUserId, mVersion, mLoginId)
                .compose(RxUtil.<JsonObject>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取启动
     *
     * @param subscriber
     * @param loginId
     */
    public void getLanchRes(Subscriber<JsonObject> subscriber, int loginId) {
        mTimeApi.getLanchRes("Ad", "getAdByLoadingPage", "%E5%AE%89%E6%99%BA", loginId)
                .compose(RxUtil.<JsonObject>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 推荐页面
     *
     * @param subscriber
     * @param mUserId
     * @param mVersion
     * @param mLoginId
     */
    public void getRecommonRes(Subscriber<RecommonBean> subscriber, String mUserId, String mVersion, String mLoginId) {
        mTimeApi.getRecommonRes("Status", "getIndex", mUserId, "%E5%AE%89%E6%99%BA&ver", mVersion, mLoginId)
                .compose(RxUtil.<RecommonBean>ioMain())
                .subscribe(subscriber);
    }
}
