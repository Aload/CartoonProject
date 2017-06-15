package com.autism.timelibs.view.glide;

import android.content.Context;
import android.widget.ImageView;

import com.autism.timelibs.R;
import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Author：autism on 2017/6/12 14:51
 * Used:Timeclub
 */
public class GlideUtils {

    /**
     * 加载网络图片
     *
     * @param mContext
     * @param mImage
     * @param uri
     * @param defaultImg
     */
    public static void withNetDefaultImg(Context mContext, ImageView mImage, String uri, int defaultImg) {
        Glide.with(mContext)
                .load(uri)
                .placeholder(defaultImg)
                .fitCenter()
                .error(defaultImg)
                .into(mImage);
    }

    /**
     * 圆角图片
     *
     * @param mContext
     * @param mImage
     * @param uri
     * @param defaultImg
     */
    public static void withNetRoundImg(Context mContext, ImageView mImage, String uri, int defaultImg) {
        Glide.with(mContext)
                .load(uri)
                .bitmapTransform(new GlideRoundTransform(mContext))
                .placeholder(defaultImg)
                .fitCenter()
                .error(defaultImg)
                .into(mImage);
    }
}
