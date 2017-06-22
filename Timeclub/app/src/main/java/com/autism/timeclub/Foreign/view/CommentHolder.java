package com.autism.timeclub.Foreign.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/22 16:06
 * Used:Timeclub
 */
public class CommentHolder extends BaseRecyclerHolder<CommentBean.LikeUsersBean> {
    private ImageView mAvater;
    private TextView mName;
    private TextView mLevel;
    private LinearLayout mAttention;

    public CommentHolder(ViewGroup parent, int res) {
        super(parent, res);
        mName = $(R.id.tv_name);
        mAvater = $(R.id.iv_avater);
        mLevel = $(R.id.tv_level);
        mAttention = $(R.id.ll_attention);
    }

    @Override
    public void setData(CommentBean.LikeUsersBean mData) {
        GlideUtils.withCircleImg(getContext(), mAvater, mData.getAvatar(), 0);
        mName.setText(mData.getNick());
        mLevel.setText(new StringBuffer().append("LV").append(mData.getUserRank()));
    }
}
