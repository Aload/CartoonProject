package com.autism.timelibs.http;

/**
 * Author：autism on 2017/6/13 10:43
 * Used:Timeclub
 */
public interface IResultSuccessListener<T> {
    void getDataSuccess(T mData);

//    void getMetaSuccess(M mMate);

    void getError(String msg);
}
