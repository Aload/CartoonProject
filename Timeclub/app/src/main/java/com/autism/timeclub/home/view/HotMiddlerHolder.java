package com.autism.timeclub.home.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class HotMiddlerHolder extends BaseRecyclerHolder<HotBean.DramaStorysBean.StatussBeanX> {

    private ImageView mImge;
    private TextView mName;
    private TextView mDetail;

    public HotMiddlerHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImge = $(R.id.iv_img);
        mDetail = $(R.id.tv_detail);
        mName = $(R.id.tv_name);
        measure(mImge, 500, 300);
    }

    @Override
    public void setData(HotBean.DramaStorysBean.StatussBeanX mData) {
        HotBean.DramaStorysBean.StatussBeanX.StatusBeanX status = mData.getStatus();
        GlideUtils.withNetRoundImg(getContext(), mImge, status.getOriginalPic(), 0);
        String toString = new StringBuilder().append("更新至").append(mData.getStoryVideoNum()).append("集").toString();
        mDetail.setText(toString);
        mName.setText(mData.getStoryName());
    }

}
