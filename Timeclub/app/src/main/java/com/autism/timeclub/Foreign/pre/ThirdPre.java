package com.autism.timeclub.Foreign.pre;

import android.app.Activity;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timeclub.Foreign.view.IThirdView;
import com.autism.timeclub.base.api.TimeReq;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IResultSuccessListener;
import com.autism.timelibs.http.RxSubscriber;

import rx.Subscriber;

/**
 * Author：i5 on 2017/6/20 16:57
 * Used:Timeclub
 */
public class ThirdPre extends BasePresenter<IThirdView> {
    private String mStatusId;
    private int mOffPage;
    private int mPageSize;

    public ThirdPre(Activity activity, IThirdView view,String mStatusId,int mOffPage,int mPageSize) {
        super(activity, view);
        this.mStatusId=mStatusId;
        this.mOffPage=mOffPage;
        this.mPageSize=mPageSize;
    }

    @Override
    public void attachView() {
        getCommentRes( mStatusId, mOffPage, mPageSize);
    }

    public void getCommentRes(String mStatusId,int mOffPage,int mPageSize) {
        Subscriber<CommentBean> subscriber = new RxSubscriber<>(new IResultSuccessListener<CommentBean>() {
            @Override
            public void getDataSuccess(CommentBean mData) {
                mView.getCommentSuccess(mData);
            }

            @Override
            public void getError(String msg) {
                mView.getCommentError(msg);

            }
        });
        TimeReq.getInstance().getCommentAttention(subscriber, mStatusId, mOffPage, mPageSize);
        addSubscrebe(subscriber);
    }
}
