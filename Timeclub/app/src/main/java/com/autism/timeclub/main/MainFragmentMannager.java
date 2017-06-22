package com.autism.timeclub.main;

import android.util.SparseArray;

import com.autism.timeclub.Foreign.view.ForeignFra;
import com.autism.timeclub.base.BaseFra;
import com.autism.timeclub.home.view.HomeFra;
import com.autism.timeclub.mine.MineFra;

/**
 * Author：autism on 2017/6/21 17:26
 * Used:Timeclub
 */
public class MainFragmentMannager {
    private SparseArray<BaseFra> mSparseArray = new SparseArray<>();
    private static MainFragmentMannager mManager;

    private MainFragmentMannager() {
    }

    /**
     * 获取单例对象
     *
     * @return
     */
    public static MainFragmentMannager getInstance() {
        if (null == mManager) {
            synchronized (MainFragmentMannager.class) {
                if (null == mManager) {
                    mManager = new MainFragmentMannager();
                }
            }
        }
        return mManager;
    }

    public BaseFra getFraInstance(int position) {
        BaseFra baseFra = mSparseArray.get(position);
        if (null != baseFra) return baseFra;
        switch (position) {
            case 0:
                baseFra = new HomeFra();
                break;
            case 1:
                baseFra = new ForeignFra();
                break;
            case 2:
                baseFra = new MineFra();
                break;
        }
        mSparseArray.put(position, baseFra);
        return baseFra;

    }
}
