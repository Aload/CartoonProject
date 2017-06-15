package com.autism.timeclub.Foreign;

import android.app.Activity;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.base.api.TimeReq;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;

import java.sql.Time;

import rx.Subscriber;

/**
 * Author：autism on 2017/6/13 09:45
 * Used:Timeclub
 */
public class ForeignPre extends BasePresenter<IForeignView> {
    public ForeignPre(Activity activity, IForeignView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<RecommonBean> subscriber = new RxSubscriber<>(new IResultSuccessListener<RecommonBean>() {
            @Override
            public void getDataSuccess(RecommonBean mData) {
                mView.recommonResSuccess(mData);
            }

            @Override
            public void getError(String msg) {
                mView.getRecommonError(msg);
            }
        });
        TimeReq.getInstance().getRecommonRes(subscriber, "-1", "4.6.5", "-1");
        addSubscrebe(subscriber);
    }
}
