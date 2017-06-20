package com.autism.timeclub.Foreign.view;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.RecommonAdBean;
import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.Foreign.pre.DetailAnimePre;
import com.autism.timeclub.Foreign.pre.RecommonItemAdapter;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timeclub.base.holder.IOnItemClickListener;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/15 17:01
 * Used:Timeclub
 */
public class RecommonHolder extends BaseRecyclerHolder<RecommonBean.GroupBean> {
    private ImageView mImage, mAdImg;
    private TextView mName;
    private RecyclerView mRecycler;
    private LinearLayout mContent;

    public RecommonHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImage = $(R.id.iv_sort);
        mName = $(R.id.tv_name);
        mRecycler = $(R.id.rv_view_header);
        mAdImg = $(R.id.iv_add_img);
        mContent = $(R.id.ll_content);
    }

    @Override
    public void setData(final RecommonBean.GroupBean mData) {
        if (mData.getAds().isEmpty()) {
            mContent.setVisibility(View.VISIBLE);
            mAdImg.setVisibility(View.GONE);
            GlideUtils.withNetDefaultImg(getContext(), mImage, mData.getIcon(), 0);
            mName.setText(mData.getName());
            mRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
            RecommonItemAdapter mItemAdapter = new RecommonItemAdapter();
            mRecycler.setAdapter(mItemAdapter);
            mItemAdapter.setOnclickItem(new IOnItemClickListener() {
                @Override
                public void onClickListener(int position) {
                    Intent mIntent = new Intent(getContext(), DetailAnimeAct.class);
                    mIntent.putExtra("statusId", mData.getStatuss().get(position).getStatus().getData().getStoryId());
                    getContext().startActivity(mIntent);
                }
            });
            mItemAdapter.updateUi(mData.getStatuss());
        } else {
            mContent.setVisibility(View.GONE);
            mAdImg.setVisibility(View.VISIBLE);
            RecommonAdBean recommonAdBean = mData.getAds().get(0);
            GlideUtils.withNetRoundImg(getContext(), mAdImg, recommonAdBean.getAdsImg(), 0);
            measure(mAdImg, 0, 250);
        }
    }


}
