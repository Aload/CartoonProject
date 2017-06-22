package com.autism.timeclub.Foreign.pre;

import android.app.Activity;

import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timeclub.Foreign.view.IFirstView;
import com.autism.timeclub.base.api.TimeReq;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/20 16:54
 * Used:Timeclub
 */
public class FirstPre extends BasePresenter<IFirstView> {
    private String mStoryId, mStatusId;

    public FirstPre(Activity activity, IFirstView view, String mStoryId, String mStatusId) {
        super(activity, view);
        this.mStatusId = mStatusId;
        this.mStoryId = mStoryId;
    }

    @Override
    public void attachView() {
        Subscriber<FirstBean> subscriber = new RxSubscriber<>(new IResultSuccessListener<FirstBean>() {
            @Override
            public void getDataSuccess(FirstBean mData) {
                mView.getContentSuccess(mData);
            }

            @Override
            public void getError(String msg) {
                mView.getContentError(msg);
            }
        });

        TimeReq.getInstance().getFirstRes(subscriber, mStoryId, mStatusId);
        addSubscrebe(subscriber);
    }
}
