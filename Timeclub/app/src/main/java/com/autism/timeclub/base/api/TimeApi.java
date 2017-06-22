package com.autism.timeclub.base.api;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timeclub.Foreign.model.DetailBean;
import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.mine.model.InfoBean;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Author：autism on 2017/6/13 11:15
 * Used:Timeclub
 */
public interface TimeApi {
    //推荐的api
    @GET("v2/interface.php")
    Observable<JsonObject> getHomeHot(@Query("m") String m, @Query("a") String a,
                                      @Query("userId") String userId, @Query("ver") String version, @Query("loginId") int loginId);

    //进入app请求api
    @GET("v2/interface.php")
    Observable<JsonObject> getLanchRes(@Query("m") String ad, @Query("a") String status, @Query("channel") String channel, @Query("loginId") int login);

    @GET("v2/interface.php")
    Observable<RecommonBean> getRecommonRes(@Query("m") String status, @Query("a") String getIndex,
                                            @Query("userId") String mUserId, @Query("channel") String s,
                                            @Query("ver") String mVersion, @Query("loginId") String mLoginId);

    @GET("v2/interface.php")
    Observable<InfoBean> getAttentionRes(@Query("m") String status, @Query("a") String getIndexNoLogin,
                                         @Query("pageNo") int page, @Query("pageSize") int pageSize, @Query("loginId") String mLoginId);

    @GET("v2/interface.php?m=Status&a=getStatusDetail&userId=-1&ver=4.6.5&paintVer=3&loginId=-1")
    Observable<DetailBean> getDetailRes(@Query("statusId") String statusId);

    @GET("v2/interface.php?m=Status&a=getStatusMoreAtStory&ver=4.6.5&loginId=-1")
    Observable<FirstBean> getFirstRes(@Query("storyId") String storyId, @Query("statudId") String statudId);

    @GET("v2/interface.php?m=LikeOther&a=getLikeOtherUser&targetType=6&userId=-1&loginId=-1")
    Observable<CommentBean> getCommentAttention(@Query("targetValue") String mStatusId, @Query("pageNo") int mOffPage, @Query("pageSize") int mPageSize);

    @GET("v2/interface.php?m=CommentOther&a=getOtherComments&visitorId=-1&targetType=6&loginId=-1")
    Observable<LikeBean> getLikeRes(@Query("targetValue") String mStatusId, @Query("pageNo") int mOffPage, @Query("pageSize") int mPageSize);
}
