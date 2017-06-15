package com.autism.timeclub.home.pre;

import android.app.Activity;

import com.autism.timeclub.base.api.TimeReq;
import com.autism.timeclub.home.view.IHomeView;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/13 09:27
 * Used:Timeclub
 */
public class HomePre extends BasePresenter<IHomeView> {
    public HomePre(Activity activity, IHomeView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<JsonObject> subscriber = new RxSubscriber<>(new IResultSuccessListener<JsonObject>() {
            @Override
            public void getDataSuccess(JsonObject mData) {
                Gson mGson = new Gson();
                HotBean hotBean = mGson.fromJson(mData.toString(), HotBean.class);
                mView.getHotList(hotBean);
            }

            @Override
            public void getError(String msg) {
                mView.getHotError(msg);
            }
        });
        TimeReq.getInstance().getHomeHot(subscriber, "-1", "4.6.5", -1);
        addSubscrebe(subscriber);
    }
}
