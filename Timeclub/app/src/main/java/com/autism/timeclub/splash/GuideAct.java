package com.autism.timeclub.splash;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseAct;
import com.autism.timeclub.base.common.GlobalCommon;
import com.autism.timeclub.main.MainActivity;
import com.autism.timelibs.TimeApp;
import com.autism.timelibs.http.IPresenter;
import com.autism.timelibs.utils.SpUtils;
import com.autism.timelibs.utils.ViewUtil;
import com.autism.timelibs.view.CircleFlowIndicator;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Author：autism on 2017/6/12 16:44
 * Used:Timeclub
 */
public class GuideAct extends BaseAct implements ViewPager.OnPageChangeListener {
    private List<Integer> mList = new ArrayList<>();
    private CircleFlowIndicator mFlow;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        super.initView();
        ViewPager mPager = (ViewPager) findViewById(R.id.guide_pager);

        mFlow = (CircleFlowIndicator) findViewById(R.id.view_indicator);
        mFlow.setCount(4);
        mPager.setOffscreenPageLimit(3);
        mPager.addOnPageChangeListener(this);
        mPager.setAdapter(new GuideAdapter());
    }

    @Override
    protected int getRlayoutId() {
        return R.layout.guide_act;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mFlow.setSelection(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private class GuideAdapter extends PagerAdapter {
        public GuideAdapter() {
            if (mList.isEmpty()) {
                mList.add(R.mipmap.welcom1);
                mList.add(R.mipmap.welcom2);
                mList.add(R.mipmap.welcom3);
                mList.add(R.mipmap.welcom4);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            final Integer integer = mList.get(position);
            View mView = LayoutInflater.from(TimeApp.getmContext()).inflate(R.layout.guide_layout, null);
            ImageView mImage = (ImageView) mView.findViewById(R.id.iv_guide);
            mImage.setImageResource(integer);
            if (position == 3) {
                View mEnterView = mView.findViewById(R.id.iv_enter);
                mEnterView.setVisibility(View.VISIBLE);
                mView.findViewById(R.id.iv_enter).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent mIntent = new Intent(GuideAct.this, MainActivity.class);
                        startActivity(mIntent);
                        ViewUtil.left2RightOut(GuideAct.this);
                    }
                });
            }
            container.addView(mView);
            return mView;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mList != null) mList.clear();
    }
}
