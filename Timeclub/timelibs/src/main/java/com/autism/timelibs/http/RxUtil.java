package com.autism.timelibs.http;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Rx 封装的工具
 */
public class RxUtil {

    /**
     * 统一线程切换方法
     *
     * @param <T> Observable
     * @return Transformer对象
     */
    public static <T> Observable.Transformer<T, T> ioMain() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> tObservable) {
                return tObservable.subscribeOn(Schedulers.io())
                        .unsubscribeOn(AndroidSchedulers.mainThread())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static void unsubscribe(Subscriber subscriber) {
        if (null != subscriber && !subscriber.isUnsubscribed()) {
            subscriber.unsubscribe();
        }
    }
}
