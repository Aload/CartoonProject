package com.autism.timelibs.view.glide;

import android.content.Context;

import com.autism.timelibs.TimeApp;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;

import java.io.InputStream;

/**
 * Author：autism on 2017/6/15 11:01
 * Used:Timeclub
 */
public class OkHttpGlideModule implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        // Do nothing.
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        //注意：new HTTPSUtils(context).getInstance()为已经通过认证的okhttpclient
        glide.register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(new SSLContextUtil(TimeApp.getmContext()).getInstance()));
    }
}
