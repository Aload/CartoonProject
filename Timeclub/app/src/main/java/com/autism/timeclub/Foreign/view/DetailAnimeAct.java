package com.autism.timeclub.Foreign.view;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.autism.timeclub.Foreign.model.DetailBean;
import com.autism.timeclub.Foreign.pre.DetailAdapter;
import com.autism.timeclub.Foreign.pre.DetailAnimePre;
import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseAct;
import com.autism.timelibs.utils.LineLog;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Author：autism on 2017/6/20 15:13
 * Used:Timeclub
 */
public class DetailAnimeAct extends BaseAct<DetailAnimePre> implements IDetailView, View.OnClickListener {
    private JCVideoPlayerStandard mJcPlayer;
    private static final String TAG = DetailAnimeAct.class.getSimpleName();
    private String[] mTitle = new String[]{"简介", "评论", "点赞"};
    private DetailAdapter mDetailAdapter;

    @Override
    protected DetailAnimePre getPresenter() {
        return new DetailAnimePre(this, this);
    }

    @Override
    protected int getRlayoutId() {
        return R.layout.detail_anime_layout;
    }

    @Override
    protected void initView() {
        super.initView();
        findViewById(R.id.iv_back).setOnClickListener(this);
        mJcPlayer = (JCVideoPlayerStandard) findViewById(R.id.jc_player);
        PagerSlidingTabStrip mTab = (PagerSlidingTabStrip) findViewById(R.id.ps_strip);
        ViewPager mPager = (ViewPager) findViewById(R.id.vp_pager);
        mDetailAdapter = new DetailAdapter(getSupportFragmentManager(), mTitle);
        mPager.setAdapter(mDetailAdapter);
        mTab.setViewPager(mPager);
    }

    @Override
    public void getDetailSuccess(DetailBean mData) {
        int[] mNum = new int[]{
                mData.getStatus().getCommentCount(), mData.getStatus().getData().getLikeSum()
        };
        mDetailAdapter.notifyUi(mNum);
        mJcPlayer.setUp(mData.getStatus().getData().getFileName(), mData.getStatus().getData().getLabel());
    }

    @Override
    public void getDetailError(String msg) {
        LineLog.d(TAG, msg);
    }

    @Override
    public void onClick(View v) {
        mJcPlayer.setStateAndUi(JCVideoPlayerStandard.CURRENT_STATE_ERROR);
        finish();
    }
}
