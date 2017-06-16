package com.autism.timelibs.view.glide;

import android.content.Context;
import android.widget.ImageView;

import com.autism.timelibs.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

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
                .skipMemoryCache(false)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        e.printStackTrace();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        return false;
                    }
                })
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
                .centerCrop()
                .fitCenter()
                .bitmapTransform(new GlideRoundTransform(mContext))
                .placeholder(defaultImg)
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
    public static void withCircleImg(Context mContext, ImageView mImage, String uri, int defaultImg) {
        Glide.with(mContext)
                .load(uri)
                .centerCrop()
                .fitCenter()
                .bitmapTransform(new CropCircleTransformation(mContext))
                .placeholder(defaultImg)
                .into(mImage);
    }
}
