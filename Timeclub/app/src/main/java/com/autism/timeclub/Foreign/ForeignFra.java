package com.autism.timeclub.Foreign;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.Foreign.pre.RecommonAdapter;
import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseFra;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.view.CircleFlowIndicator;
import com.autism.timelibs.view.banner.AutoScrollViewPager;
import com.autism.timelibs.view.glide.GlideUtils;
import com.kevin.wraprecyclerview.WrapAdapter;
import com.kevin.wraprecyclerview.WrapRecyclerView;

import java.util.List;

/**
 * Author：autism on 2017/6/13 09:45
 * Used:Timeclub
 */
public class ForeignFra extends BaseFra<ForeignPre> implements IForeignView, ViewPager.OnPageChangeListener {
    private RecommonAdapter mRecommonAdapter;
    private CircleFlowIndicator mIndicator;
    private BannerAdapter mBannerAdapter;
    private AutoScrollViewPager mBannerPager;
    private TextView mTextActive;

    @Override
    protected ForeignPre getPresenter() {
        return new ForeignPre(getActivity(), this);
    }

    @Override
    protected int getFraRlayoutId() {
        return R.layout.foreign_layout;
    }

    @Override
    protected void initFraView(View mView) {
        super.initFraView(mView);
        View mHeaderView = LayoutInflater.from(getActivity()).inflate(R.layout.header_layout, null);
        mBannerPager = (AutoScrollViewPager) mHeaderView.findViewById(R.id.vp_banner);
        mTextActive = (TextView) mHeaderView.findViewById(R.id.tv_active);
        mIndicator = (CircleFlowIndicator) mHeaderView.findViewById(R.id.indicator_banner);
        WrapRecyclerView mRecyclerView = (WrapRecyclerView) mView.findViewById(R.id.rv_recomment);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecommonAdapter = new RecommonAdapter();
        WrapAdapter<RecommonAdapter> mAdapter = new WrapAdapter<>(mRecommonAdapter);
        mAdapter.adjustSpanSize(mRecyclerView);
        mAdapter.addHeaderView(mHeaderView);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void recommonResSuccess(RecommonBean recommonBean) {
        List<RecommonBean.AdsBean> mAdsList = recommonBean.getAds();
        List<RecommonBean.GroupBean> mGroup = recommonBean.getGroup();
        mBannerAdapter = new BannerAdapter(mAdsList);
        mBannerPager.addOnPageChangeListener(this);
        mBannerPager.setOffscreenPageLimit(mAdsList.size());
        mBannerPager.setAdapter(mBannerAdapter);
        mBannerPager.startAutoScroll(1500);
        mRecommonAdapter.notifyUi(mGroup);
        mIndicator.setCount(mAdsList.size());
    }

    @Override
    public void getRecommonError(String msg) {
        LineLog.e(TAG, msg);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mIndicator.setSelection(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private class BannerAdapter extends PagerAdapter {
        private List<RecommonBean.AdsBean> mBannerData;

        public BannerAdapter(List<RecommonBean.AdsBean> mAdsList) {
            this.mBannerData = mAdsList;
        }

        @Override
        public int getCount() {
            return mBannerData == null ? 0 : mBannerData.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            RecommonBean.AdsBean adsBean = mBannerData.get(position);
            ImageView mImage = new ImageView(getActivity());
            mImage.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            GlideUtils.withNetDefaultImg(getActivity(), mImage, adsBean.getAdsImg(), 0);
            container.addView(mImage);
            return mImage;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return object == view;
        }

        @Override
        public void setPrimaryItem(View container, int position, Object object) {
            super.setPrimaryItem(container, position, object);
            String msg = mBannerData.get(position).getFlag().getMsg();
            mTextActive.setText(msg);
        }
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
    }

    @Override
    public void onLoadmore() {
        super.onLoadmore();
    }
}
