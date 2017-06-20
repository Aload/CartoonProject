package com.autism.timeclub.Foreign.pre;

import android.app.Activity;

import com.autism.timeclub.Foreign.model.DetailBean;
import com.autism.timeclub.Foreign.view.IDetailView;
import com.autism.timeclub.base.api.TimeReq;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/20 15:14
 * Used:Timeclub
 */
public class DetailAnimePre extends BasePresenter<IDetailView> {
    public DetailAnimePre(Activity activity, IDetailView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<DetailBean> subscriber = new RxSubscriber<>(new IResultSuccessListener<DetailBean>() {
            @Override
            public void getDataSuccess(DetailBean mData) {
                mView.getDetailSuccess(mData);
            }

            @Override
            public void getError(String msg) {
                mView.getDetailError(msg);
            }
        });
        TimeReq.getInstance().getDetailRes(subscriber);
        addSubscrebe(subscriber);
    }
}
