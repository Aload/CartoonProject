package com.autism.timeclub.home.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class HotHeaderHolder extends BaseRecyclerHolder<HotBean.RankListBean.StatussBean> {

    private ImageView mImg;
    private TextView mName;
    private TextView mViewNum;
    private TextView mCommentNum;

    public HotHeaderHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImg = $(R.id.iv_item_img);
        mName = $(R.id.tv_item_name);
        mCommentNum = $(R.id.tv_comment);
        mViewNum = $(R.id.tv_view);
        measure(mImg, 500, 350);
    }

    @Override
    public void setData(HotBean.RankListBean.StatussBean mData) {
        HotBean.RankListBean.StatussBean.StatusBean status = mData.getStatus();
        LineLog.d(TAG, status.getOriginalPic());
        GlideUtils.withNetRoundImg(getContext(), mImg, status.getOriginalPic(), 0);
        mName.setText(status.getContent());
        mViewNum.setText(String.valueOf(status.getStatusClick()));
        mCommentNum.setText(String.valueOf(status.getCommentCount()));
    }
}
