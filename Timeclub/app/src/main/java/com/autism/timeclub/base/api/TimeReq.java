package com.autism.timeclub.base.api;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timeclub.Foreign.model.DetailBean;
import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.http.RetrofitManager;
import com.autism.timelibs.http.RxUtil;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import retrofit2.Retrofit;
import rx.Subscriber;

/**
 * Author：autism on 2017/6/13 11:17
 * Used:Timeclub
 */
public class TimeReq {
    private static TimeReq INSTANCE;
    private TimeApi mTimeApi;

    public static TimeReq getInstance() {
        if (null == INSTANCE) {
            synchronized (TimeReq.class) {
                if (INSTANCE == null)
                    INSTANCE = new TimeReq();
            }
        }
        return INSTANCE;
    }

    private TimeReq() {
        Retrofit retrofit = RetrofitManager.getRetrofit();
        mTimeApi = retrofit.create(TimeApi.class);
    }

    /**
     * column数据
     *
     * @param subscriber
     * @param mUserId
     * @param mVersion
     * @param mLoginId
     */
    public void getHomeHot(Subscriber<JsonObject> subscriber, String mUserId, String mVersion, int mLoginId) {
        mTimeApi.getHomeHot("Status", "getNewIndexHot", mUserId, mVersion, mLoginId)
                .compose(RxUtil.<JsonObject>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取启动
     *
     * @param subscriber
     * @param loginId
     */
    public void getLanchRes(Subscriber<JsonObject> subscriber, int loginId) {
        mTimeApi.getLanchRes("Ad", "getAdByLoadingPage", "%E5%AE%89%E6%99%BA", loginId)
                .compose(RxUtil.<JsonObject>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 推荐页面
     *
     * @param subscriber
     * @param mUserId
     * @param mVersion
     * @param mLoginId
     */
    public void getRecommonRes(Subscriber<RecommonBean> subscriber, String mUserId, String mVersion, String mLoginId) {
        mTimeApi.getRecommonRes("Status", "getIndex", mUserId, "%E5%AE%89%E6%99%BA&ver", mVersion, mLoginId)
                .compose(RxUtil.<RecommonBean>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取关注列表数据
     *
     * @param subscriber
     * @param page
     * @param pageSize
     * @param mLoginId
     */
    public void getAttentionRes(Subscriber<InfoBean> subscriber, int page, int pageSize, String mLoginId) {
        mTimeApi.getAttentionRes("Status", "getIndexNoLogin", page, pageSize, mLoginId)
                .compose(RxUtil.<InfoBean>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取详情列表
     *
     * @param subscriber
     */
    public void getDetailRes(Subscriber<DetailBean> subscriber, String statusId) {
        mTimeApi.getDetailRes(statusId).compose(RxUtil.<DetailBean>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取content数据
     *
     * @param subscriber
     */
    public void getFirstRes(Subscriber<FirstBean> subscriber, String storyId, String statusId) {
        mTimeApi.getFirstRes(storyId, statusId).compose(RxUtil.<FirstBean>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取关注数据
     *
     * @param subscriber
     * @param mStatusId
     * @param mOffPage
     * @param mPageSize
     */
    public void getCommentAttention(Subscriber<CommentBean> subscriber, String mStatusId, int mOffPage, int mPageSize) {
        mTimeApi.getCommentAttention(mStatusId, mOffPage, mPageSize).compose(RxUtil.<CommentBean>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取评论
     * @param subscriber
     * @param mStatusId
     * @param mOffPage
     * @param mPageSize
     */
    public void getLikeRes(Subscriber<LikeBean> subscriber, String mStatusId, int mOffPage, int mPageSize) {
        mTimeApi.getLikeRes(mStatusId, mOffPage, mPageSize).compose(RxUtil.<LikeBean>ioMain())
                .subscribe(subscriber);
    }
}
