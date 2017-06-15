package com.autism.timeclub.home.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class HotBottomHolder extends BaseRecyclerHolder<HotBean.SuggestUserBean> {
    private TextView mName;
    private TextView mDetail;
    private ImageView mUserAvater;
    private ImageView mPic;

    public HotBottomHolder(ViewGroup parent, int res) {
        super(parent, res);
        LinearLayout mContent = $(R.id.ll_content);
        measure(mContent, 400, 550);
        mPic = $(R.id.iv_pic);
        measure(mPic, 400, 300);
        mName = $(R.id.tv_name);
        mDetail = $(R.id.tv_detail);
        mUserAvater = $(R.id.iv_user);
        measure(mUserAvater, 100, 100);
        LinearLayout mAttention = $(R.id.ll_attention);
    }

    @Override
    public void setData(HotBean.SuggestUserBean mData) {
        GlideUtils.withNetDefaultImg(getContext(), mPic, mData.getOriginalPic(), 0);
        mName.setText(mData.getNick());
        GlideUtils.withNetDefaultImg(getContext(), mUserAvater, mData.getAvatar(), 0);
        String mDetails = new StringBuilder().append("作品/").append(mData.getSubjectCount()).toString();
        mDetail.setText(mDetails);
    }
}
