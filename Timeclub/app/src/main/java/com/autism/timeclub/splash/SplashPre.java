package com.autism.timeclub.splash;

import android.app.Activity;

import com.autism.timeclub.base.api.TimeReq;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;
import com.autism.timelibs.utils.LineLog;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/14 17:55
 * Used:Timeclub
 */
public class SplashPre extends BasePresenter<ISplashView> {
    public SplashPre(Activity activity, ISplashView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<JsonObject> subscriber = new RxSubscriber<>(new IResultSuccessListener<JsonObject>() {
            @Override
            public void getDataSuccess(JsonObject mData) {
                Gson mGson = new Gson();
                LanchBean hotBean = mGson.fromJson(mData.toString(), LanchBean.class);
                LineLog.d(TAG, hotBean.toString());
            }

            @Override
            public void getError(String msg) {
            }
        });
        TimeReq.getInstance().getLanchRes(subscriber, -1);
        addSubscrebe(subscriber);
    }
}
