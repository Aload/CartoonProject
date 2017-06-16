package com.autism.timeclub.mine.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/16 11:04
 * Used:Timeclub
 */
public class InfoHolder extends BaseRecyclerHolder<InfoBean.StatussBean> {

    private ImageView mHeaderImg;
    private TextView mLevel;
    private TextView mName;
    private ImageView mImageLevel;
    private TextView mTimeCurrent;
    private RelativeLayout mPicLayout;
    private ImageView mPicContent;
    private ImageView mTagImg;
    private RelativeLayout mVideoContent;
    private ImageView mVideoPic;
    private TextView mLength;
    private TextView mDetail;

    private TextView mViewNum;
    private TextView mComment;

    public InfoHolder(ViewGroup parent, int res) {
        super(parent, res);
        mHeaderImg = $(R.id.iv_user_header);
        measure(mHeaderImg, 100, 100);
        mLevel = $(R.id.tv_level);
        mName = $(R.id.tv_username);
        mImageLevel = $(R.id.iv_level_img);
        measure(mImageLevel, 70, 70);
        mTimeCurrent = $(R.id.tv_time);

        mPicLayout = $(R.id.rl_pic);
        measure(mPicLayout, 0, 500);
        mPicContent = $(R.id.iv_img_pic);
        measure(mPicContent, 0, 500);
        mTagImg = $(R.id.iv_tag_pic);

        mVideoContent = $(R.id.rl_video);
        mVideoPic = $(R.id.iv_video);
        measure(mVideoContent, 0, 500);
        measure(mVideoPic, 0, 500);
        mLength = $(R.id.tv_length);
        mDetail = $(R.id.tv_detail);

        mViewNum = $(R.id.tv_view);
        mComment = $(R.id.tv_comment);

    }

    @Override
    public void setData(InfoBean.StatussBean mDatas) {
        InfoBean.StatussBean.StatusBean mData = mDatas.getStatus();
        GlideUtils.withCircleImg(getContext(), mHeaderImg, mData.getUser().getAvatar(), 0);
        mLevel.setText(new StringBuffer().append("LV.").append(mData.getUser().getUserRank()));
        mName.setText(mData.getUser().getNick());
        boolean showType = mData.getData().getType() == 1;
        if (showType) {
            mPicLayout.setVisibility(View.VISIBLE);
            mVideoContent.setVisibility(View.GONE);
            GlideUtils.withNetDefaultImg(getContext(), mImageLevel, mData.getUser().getUserRankIcon(), 0);
            GlideUtils.withNetRoundImg(getContext(), mPicContent, mData.getOriginalPic(), 0);
            mTagImg.setVisibility(mData.getTargetType() == 2 ? View.VISIBLE : View.GONE);
        } else {
            mPicLayout.setVisibility(View.GONE);
            mVideoContent.setVisibility(View.VISIBLE);
            GlideUtils.withNetDefaultImg(getContext(), mVideoPic, mData.getOriginalPic(), 0);
            mLength.setText(mData.getData().getVideoLength());
        }
        mTimeCurrent.setText(mData.getCreateTime());
        mDetail.setText(mData.getContent());
        mViewNum.setText(String.valueOf(mData.getLikeCount()));
        mComment.setText(String.valueOf(mData.getCommentCount()));
    }
}
