package com.autism.timeclub.Foreign.pre;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.autism.timeclub.Foreign.model.DetailBean;
import com.autism.timeclub.base.BaseFra;

/**
 * Author：autism on 2017/6/20 16:45
 * Used:Timeclub
 */
public class DetailAdapter extends FragmentPagerAdapter {
    private final String[] mTitle;
    private int[] mNum;
    private String statusId;
    private String mstoryId;

    public DetailAdapter(FragmentManager fm, String[] mTitle, String statusId, String storyId) {
        super(fm);
        this.mTitle = mTitle;
        this.statusId = statusId;
        this.mstoryId = storyId;
    }

    @Override
    public Fragment getItem(int position) {
        BaseFra baseFragment = DetailFragmentManager.getInstance().getBaseFragment(position);
        Bundle mBundle = new Bundle();
        mBundle.putString("storyId", mstoryId);
        mBundle.putString("statusId", statusId);
        baseFragment.setArguments(mBundle);
        return baseFragment;
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
     * @param mInsertNum
     */
    public void notifyUi(int[] mInsertNum) {
        if (null == mInsertNum || mInsertNum.length == 0) return;
        this.mNum = mInsertNum;
        notifyDataSetChanged();
    }
}
