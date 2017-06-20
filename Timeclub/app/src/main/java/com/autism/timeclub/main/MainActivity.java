package com.autism.timeclub.main;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.autism.timeclub.Foreign.view.ForeignFra;
import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseAct;
import com.autism.timeclub.home.view.HomeFra;
import com.autism.timeclub.login.LoginAct;
import com.autism.timeclub.mine.MineFra;
import com.autism.timelibs.utils.ViewUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseAct<IMainPre> implements View.OnClickListener {

    private String[] mTitle = new String[]{"热门", "推荐", "关注"};

    @Override
    protected IMainPre getPresenter() {
        return null;
    }

    @Override
    protected int getRlayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        PagerSlidingTabStrip mStrip = (PagerSlidingTabStrip) findViewById(R.id.tab_strip);
        mStrip.setTextColorResource(R.color.blue_bg);
        ViewPager mPager = (ViewPager) findViewById(R.id.vp_pager);
        findViewById(R.id.iv_make).setOnClickListener(this);
        TerminalAdapter mTerminalAdapter = new TerminalAdapter(getSupportFragmentManager());
        mPager.setCurrentItem(1);
        mPager.setAdapter(mTerminalAdapter);
        mStrip.setViewPager(mPager);
    }

    @Override
    public void onClick(View v) {
        Intent mIntent = new Intent(this, LoginAct.class);
        startActivity(mIntent);
        ViewUtil.left2RightOut(this);
    }

    private class TerminalAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragments = new ArrayList<>();

        public TerminalAdapter(FragmentManager fm) {
            super(fm);
            fragments.add(0, new HomeFra());
            fragments.add(1, new ForeignFra());
            fragments.add(2, new MineFra());
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle[position];
        }
    }
}
