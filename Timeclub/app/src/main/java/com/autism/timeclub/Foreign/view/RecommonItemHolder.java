package com.autism.timeclub.Foreign.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class RecommonItemHolder extends BaseRecyclerHolder<RecommonBean.GroupBean.StatussBean> {

    private ImageView mImg;
    private TextView mName;
    private TextView mViewNum;
    private TextView mCommentNum;

    public RecommonItemHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImg = $(R.id.iv_item_img);
        mName = $(R.id.tv_item_name);
        mCommentNum = $(R.id.tv_comment);
        mViewNum = $(R.id.tv_view);
        measure(mImg, 500, 350);
    }

    @Override
    public void setData(RecommonBean.GroupBean.StatussBean mData) {
        RecommonBean.GroupBean.StatussBean.StatusBean status = mData.getStatus();
        LineLog.d(TAG, status.getOriginalPic());
        GlideUtils.withNetRoundImg(getContext(), mImg, status.getOriginalPic(), 0);
        mName.setText(status.getContent());
        mViewNum.setText(String.valueOf(status.getStatusClick()));
        mCommentNum.setText(String.valueOf(status.getCommentCount()));
    }
}
