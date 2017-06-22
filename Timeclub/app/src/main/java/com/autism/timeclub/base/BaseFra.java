package com.autism.timeclub.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.autism.timeclub.R;
import com.autism.timelibs.http.IPresenter;
import com.autism.timelibs.utils.ViewUtil;
import com.autism.timelibs.view.refresh.Footer.LoadingView;
import com.autism.timelibs.view.refresh.RefreshListenerAdapter;
import com.autism.timelibs.view.refresh.TwinklingRefreshLayout;
import com.autism.timelibs.view.refresh.header.SinaRefreshView;
import com.autism.timelibs.view.refresh.header.bezierlayout.BezierLayout;

/**
 * Author：autism on 2017/6/13 09:18
 * Used:Timeclub
 */
public abstract class BaseFra<T extends IPresenter> extends Fragment {
    protected T mPresenter;
    protected static final String TAG = BaseFra.class.getSimpleName();
   protected TwinklingRefreshLayout mRefresh;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(getFraRlayoutId(), null);
        initFraView(mView);
        mPresenter = getPresenter();
        if (null != mPresenter) mPresenter.attachView();
        return mView;
    }

    protected void initFraView(View mView) {

        mRefresh = (TwinklingRefreshLayout) mView.findViewById(R.id.sp_refresh);
        if (mRefresh != null) {
            SinaRefreshView headerView = new SinaRefreshView(getActivity());
            headerView.setArrowResource(R.drawable.arrow);
            headerView.setTextColor(0xff745D5C);
//        TextHeaderView headerView = (TextHeaderView) View.inflate(this,R.layout.header_tv,null);
            mRefresh.setHeaderView(headerView);

            LoadingView loadingView = new LoadingView(getActivity());
            mRefresh.setBottomView(loadingView);
            mRefresh.setOnRefreshListener(new RefreshListenerAdapter() {
                @Override
                public void onRefresh(TwinklingRefreshLayout refreshLayout) {
                    super.onRefresh(refreshLayout);
                    onRefreshs(refreshLayout);
                }

                @Override
                public void onLoadMore(TwinklingRefreshLayout refreshLayout) {
                    super.onLoadMore(refreshLayout);
                    onLoadMores(refreshLayout);
                }

                @Override
                public void onFinishRefresh() {
                    super.onFinishRefresh();
                }

                @Override
                public void onFinishLoadMore() {
                    super.onFinishLoadMore();
                }
            });
        }
    }

    /**
     * 测量控件位置
     *
     * @param view
     * @param width
     * @param height
     */
    protected void measure(View view, int width, int height) {
        ViewUtil.measure(view, width, height);
    }

    protected abstract T getPresenter();

    protected abstract int getFraRlayoutId();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public abstract void onRefreshs(TwinklingRefreshLayout refreshLayout);

    public abstract void onLoadMores(TwinklingRefreshLayout refreshLayout);

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) mPresenter.detachView();
    }
}
