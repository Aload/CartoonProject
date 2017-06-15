package com.autism.timelibs.http;

import com.autism.timelibs.utils.LineLog;

import rx.Subscriber;

/**
 * 封装Subscriber
 */
public class RxSubscriber<T> extends Subscriber<T> {

    private IResultSuccessListener<T> mListener;
    private static final String TAG = RxSubscriber.class.getSimpleName();

    public RxSubscriber(IResultSuccessListener<T> mListener) {
        super();
        this.mListener = mListener;
    }

    @Override
    public void onCompleted() {
        LineLog.d(TAG, "load data success");
    }

    @Override
    public void onError(Throwable e) {
        mListener.getError(e.getMessage());
        e.printStackTrace();
        LineLog.e(TAG, e.getMessage());
    }

    @Override
    public void onNext(T t) {
        mListener.getDataSuccess(t);
    }
}