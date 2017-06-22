package com.autism.timeclub.Foreign.view;

import android.view.ViewGroup;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;

/**
 * Author：autism on 2017/6/21 14:08
 * Used:Timeclub
 */
public class FirstHolder extends BaseRecyclerHolder<FirstBean.StatussBean> {
    private TextView mTvText;

    public FirstHolder(ViewGroup parent, int res) {
        super(parent, res);
        mTvText = $(R.id.tv_story);
    }

    @Override
    public void setData(FirstBean.StatussBean mData) {
        mTvText.setText(mData.getStatus().getContent());
    }
}
