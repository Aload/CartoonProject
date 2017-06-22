package com.autism.timeclub.Foreign.pre;

import android.app.Activity;

import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timeclub.Foreign.view.ISecondView;
import com.autism.timeclub.base.api.TimeReq;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/20 16:56
 * Used:Timeclub
 */
public class SecondPre extends BasePresenter<ISecondView> {

    private String mStatusId;
    private int mOffPage;
    private int mPageSize;

    public SecondPre(Activity activity, ISecondView view, String mStatusId, int mOffPage, int mPageSize) {
        super(activity, view);
        this.mStatusId = mStatusId;
        this.mOffPage = mOffPage;
        this.mPageSize = mPageSize;
    }

    @Override
    public void attachView() {
        getLikeNetRes(mStatusId, mOffPage, mPageSize);
    }

    public void getLikeNetRes(String mStatusId, int mOffPage, int mPageSize) {
        Subscriber<LikeBean> subscriber = new RxSubscriber<>(new IResultSuccessListener<LikeBean>() {
            @Override
            public void getDataSuccess(LikeBean mData) {
                mView.getSuccessLikeBean(mData);
            }

            @Override
            public void getError(String msg) {
                mView.getErrorLikeBean(msg);
            }
        });
        TimeReq.getInstance().getLikeRes(subscriber, mStatusId, mOffPage, mPageSize);
        addSubscrebe(subscriber);
    }
}
