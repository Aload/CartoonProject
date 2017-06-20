package com.autism.timeclub.Foreign.pre;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Author：autism on 2017/6/20 16:45
 * Used:Timeclub
 */
public class DetailAdapter extends FragmentPagerAdapter {
    private final String[] mTitle;
    private int[] mNum;

    public DetailAdapter(FragmentManager fm, String[] mTitle) {
        super(fm);
        this.mTitle = mTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return DetailFragmentManager.getInstance().getBaseFragment(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return new StringBuffer().append(mTitle[position]).toString();
    }

    /**
     * 刷新数量
     *
     * @param mInsertNum
     */
    public void notifyUi(int[] mInsertNum) {
        if (null == mInsertNum || mInsertNum.length == 0) return;
        this.mNum = mInsertNum;
        notifyDataSetChanged();
    }
}
