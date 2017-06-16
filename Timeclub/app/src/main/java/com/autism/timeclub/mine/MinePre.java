package com.autism.timeclub.mine;

import android.app.Activity;

import com.autism.timeclub.base.api.TimeReq;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/13 10:03
 * Used:Timeclub
 */
public class MinePre extends BasePresenter<IMineView> {
    private int mPage;
    private int mSize;

    public MinePre(Activity activity, IMineView view, int page, int size) {
        super(activity, view);
        this.mPage = page;
        this.mSize = size;
    }

    @Override
    public void attachView() {

        Subscriber<InfoBean> subscriber = new RxSubscriber<>(new IResultSuccessListener<InfoBean>() {
            @Override
            public void getDataSuccess(InfoBean mData) {
                mView.getAttentionSuccess(mData);
            }

            @Override
            public void getError(String msg) {
                mView.getAttentionError(msg);
            }
        });

        TimeReq.getInstance().getAttentionRes(subscriber, mPage, mSize, "-1");
        addSubscrebe(subscriber);
    }
}
