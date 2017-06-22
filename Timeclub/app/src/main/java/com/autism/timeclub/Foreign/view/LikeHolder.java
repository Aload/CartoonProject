package com.autism.timeclub.Foreign.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：i5 on 2017/6/22 17:39
 * Used:Timeclub
 */
public class LikeHolder extends BaseRecyclerHolder<LikeBean.OtherCommentsBean> {
    private ImageView mHeader;
    private TextView mLevel;
    private TextView mTitle;
    private TextView mTime;
    private TextView mNum;
    private ImageView mCommit;
    private TextView mDescription;

    public LikeHolder(ViewGroup parent, int res) {
        super(parent, res);
        mLevel = $(R.id.tv_level);
        mHeader = $(R.id.iv_header);
        mTitle = $(R.id.tv_name);
        mTime = $(R.id.tv_time);
        mDescription = $(R.id.tv_decription);
        mNum = $(R.id.tv_num);
        mCommit = $(R.id.iv_commit);
    }

    @Override
    public void setData(LikeBean.OtherCommentsBean mData) {
        GlideUtils.withCircleImg(getContext(), mHeader, mData.getUser().getAvatar(), 0);
        mLevel.setText(new StringBuffer().append("LV").append(mData.getUser().getUserRank()));
        mTitle.setText(mData.getUser().getNick());
        mTime.setText(mData.getCreateTime());
        mDescription.setText(mData.getContent());
        mNum.setText(String.valueOf(mData.getUser().getIsFollow()));
    }
}
