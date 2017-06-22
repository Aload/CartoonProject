package com.autism.timeclub.Foreign.pre;

import android.util.SparseArray;

import com.autism.timeclub.Foreign.view.FirstFragment;
import com.autism.timeclub.Foreign.view.SecondFragment;
import com.autism.timeclub.Foreign.view.ThirdFragment;
import com.autism.timeclub.base.BaseFra;

/**
 * Author：autism on 2017/6/20 16:46
 * Used:Timeclub
 */
public class DetailFragmentManager {
    private static SparseArray<BaseFra> mBaseFragment = new SparseArray<>();

    private static DetailFragmentManager mDetailManager;

    /**
     * 单例,实例对象
     *
     * @return
     */
    public static DetailFragmentManager getInstance() {
        if (null == mDetailManager) {
            synchronized (DetailFragmentManager.class) {
                if (null == mDetailManager) {
                    mDetailManager = new DetailFragmentManager();
                }
            }
        }
        return mDetailManager;
    }

    public BaseFra getBaseFragment(int position) {
        BaseFra baseFra = mBaseFragment.get(position);
        if (null != baseFra) {
            return baseFra;
        }
        switch (position) {
            case 0:
                baseFra = new FirstFragment();
                break;

            case 1:
                baseFra = new SecondFragment();
                break;

            case 2:
                baseFra = new ThirdFragment();
                break;
        }
        mBaseFragment.put(position, baseFra);
        return baseFra;
    }

    /**
     * 清楚缓存
     */
    public void clearContainer() {
        if (mBaseFragment != null) mBaseFragment.clear();
    }
}
