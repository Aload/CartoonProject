package com.autism.timeclub.home.view;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseFra;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.home.pre.HomePre;
import com.autism.timeclub.home.pre.HotBottomAdapter;
import com.autism.timeclub.home.pre.HotHeaderAdapter;
import com.autism.timeclub.home.pre.HotMiddlerAdapter;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.utils.LogicUtils;
import com.autism.timelibs.view.glide.GlideUtils;
import com.autism.timelibs.view.refresh.TwinklingRefreshLayout;

import java.util.List;

/**
 * Author：autism on 2017/6/13 09:18
 * Used:Timeclub
 */
public class HomeFra extends BaseFra<HomePre> implements View.OnClickListener, IHomeView {
    private HotHeaderAdapter mHeaderAdapter;
    private ImageView mSortImg;
    private TextView mSortName;

    private ImageView mNewsImg;
    private TextView mNewsName;
    private HotMiddlerAdapter mMiddlerAdapter;

    private HotBottomAdapter mBottomAdapter;

    @Override
    protected HomePre getPresenter() {
        return new HomePre(getActivity(), this);
    }

    @Override
    protected int getFraRlayoutId() {
        return R.layout.homefra_layout;
    }

    @Override
    public void onRefreshs(final TwinklingRefreshLayout refreshLayout) {
        LogicUtils.getHandler(getActivity()).postDelayed(new Runnable() {
            @Override
            public void run() {
                refreshLayout.onFinishRefresh();
            }
        }, 5000);
    }

    @Override
    public void onLoadMores(TwinklingRefreshLayout refreshLayout) {

    }

    @Override
    protected void initFraView(View mView) {
        super.initFraView(mView);
        mSortImg = (ImageView) mView.findViewById(R.id.iv_sort);
        mSortName = (TextView) mView.findViewById(R.id.tv_name);
        RecyclerView mHeaderRecy = (RecyclerView) mView.findViewById(R.id.rv_view_header);
        mHeaderRecy.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mHeaderAdapter = new HotHeaderAdapter();
        mHeaderRecy.setAdapter(mHeaderAdapter);

        mNewsImg = (ImageView) mView.findViewById(R.id.iv_news);
        mNewsName = (TextView) mView.findViewById(R.id.tv_news);
        RecyclerView mMiddleView = (RecyclerView) mView.findViewById(R.id.rv_view_middle);
        mMiddleView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mMiddlerAdapter = new HotMiddlerAdapter();
        mMiddleView.setAdapter(mMiddlerAdapter);

        RecyclerView mBottomRecycle = (RecyclerView) mView.findViewById(R.id.rv_view_bottom);
        mBottomRecycle.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mBottomAdapter = new HotBottomAdapter();
        mBottomRecycle.setAdapter(mBottomAdapter);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void getHotList(HotBean mList) {
        refreshHeader(mList.getRankList());
        refreshMiddler(mList.getDramaStorys());
        refreshBottom(mList.getSuggestUser());
    }

    private void refreshHeader(HotBean.RankListBean rankList) {
        GlideUtils.withNetDefaultImg(getActivity(), mSortImg, rankList.getIcon(), 0);
        mSortName.setText(rankList.getName());
        mHeaderAdapter.updateUi(rankList.getStatuss());
    }

    private void refreshMiddler(HotBean.DramaStorysBean dramaStorys) {
        GlideUtils.withNetDefaultImg(getActivity(), mNewsImg, dramaStorys.getIcon(), 0);
        mNewsName.setText(dramaStorys.getName());
        List<HotBean.DramaStorysBean.StatussBeanX> statuss = dramaStorys.getStatuss();
        mMiddlerAdapter.updateUi(statuss);
    }

    private void refreshBottom(List<HotBean.SuggestUserBean> suggestUser) {
        mBottomAdapter.updateUi(suggestUser);
    }

    @Override
    public void getHotError(String msg) {
        LineLog.e(TAG, msg);
    }

}
