package com.autism.timelibs.view.refresh;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.autism.timelibs.R;
import com.autism.timelibs.utils.DensityUtil;

/**
 * Created by autism on 2016/3/21.
 */
public class TimeHeader extends BaseHeader {

    private AnimationDrawable animationPull;
    private AnimationDrawable animationPullFan;
    private AnimationDrawable animationRefresh;

    private Context context;
    private ImageView header_img;
    private int[] pullAnimSrcs = new int[]{R.mipmap.b_00000};
    private int[] refreshAnimSrcs = new int[]{R.mipmap.b_00000, R.mipmap.b_00002
            , R.mipmap.b_00004, R.mipmap.b_00006, R.mipmap.b_00008, R.mipmap.b_00010, R.mipmap.b_00012, R.mipmap.b_00014, R.mipmap.b_00016
            , R.mipmap.b_00018, R.mipmap.b_00020, R.mipmap.b_00022, R.mipmap.b_00024, R.mipmap.b_00026, R.mipmap.b_00028, R.mipmap.b_00030
            , R.mipmap.b_00032
    };

    public TimeHeader(Context context) {
        this(context, null, null);
    }

    public TimeHeader(Context context, int[] pullAnimSrcs, int[] refreshAnimSrcs) {
        this.context = context;
        if (pullAnimSrcs != null) this.pullAnimSrcs = pullAnimSrcs;
        if (refreshAnimSrcs != null) this.refreshAnimSrcs = refreshAnimSrcs;
        animationPull = new AnimationDrawable();
        animationPullFan = new AnimationDrawable();
        animationRefresh = new AnimationDrawable();
        for (int i = 1; i < this.pullAnimSrcs.length; i++) {
            animationPull.addFrame(ContextCompat.getDrawable(context, this.pullAnimSrcs[i]), 100);
            animationRefresh.setOneShot(true);
        }
        for (int i = this.pullAnimSrcs.length - 1; i >= 0; i--) {
            animationPullFan.addFrame(ContextCompat.getDrawable(context, this.pullAnimSrcs[i]), 100);
            animationRefresh.setOneShot(true);
        }
        for (int src : this.refreshAnimSrcs) {
            animationRefresh.addFrame(ContextCompat.getDrawable(context, src), 150);
            animationRefresh.setOneShot(false);
        }
    }

    @Override
    public View getView(LayoutInflater inflater, ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.time_header, viewGroup, true);
        header_img = (ImageView) view.findViewById(R.id.refresh_img);
        if (pullAnimSrcs != null && pullAnimSrcs.length > 0)
            header_img.setImageResource(pullAnimSrcs[0]);
        return view;
    }

    @Override
    public void onPreDrag(View rootView) {
    }

    @Override
    public void onDropAnim(View rootView, int dy) {
        int maxw = DensityUtil.dip2px(context, 45);
        float w = maxw * Math.abs(dy) / rootView.getMeasuredHeight();
        if (w > maxw) return;
        ViewGroup.LayoutParams layoutParams = header_img.getLayoutParams();
        layoutParams.width = (int) w;
        header_img.setLayoutParams(layoutParams);
    }

    @Override
    public void onLimitDes(View rootView, boolean upORdown) {
        if (!upORdown) {
            header_img.setImageDrawable(animationPull);
            animationPull.start();
        } else {
            header_img.setImageDrawable(animationPullFan);
            animationPullFan.start();
        }
    }

    @Override
    public void onStartAnim() {
        header_img.setImageDrawable(animationRefresh);
        animationRefresh.start();
    }

    @Override
    public void onFinishAnim() {
        if (pullAnimSrcs != null && pullAnimSrcs.length > 0)
            header_img.setImageResource(pullAnimSrcs[0]);
    }
}