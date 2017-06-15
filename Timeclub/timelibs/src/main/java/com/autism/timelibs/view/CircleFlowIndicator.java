package com.autism.timelibs.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import com.autism.timelibs.R;
import com.autism.timelibs.utils.ViewUtil;


/**
 * @author autism
 *         Description the class 自定义指示器
 */
public class CircleFlowIndicator extends View {
    private float mSpace;
    private float mRadius;
    private Paint mPaint;
    private Bitmap mNormalBitmap;
    private Bitmap mSelectedBitmap;
    private int mCount;
    private int mPointNormalColor;
    private int mPointSelectedColor;
    private int mSelectedIndex;

    public CircleFlowIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FlowIndicator);

        mCount = a.getInteger(R.styleable.FlowIndicator_count, 4);
        mSpace = a.getDimension(R.styleable.FlowIndicator_space, 9);
        mRadius = a.getDimension(R.styleable.FlowIndicator_point_radius, 9);

        mPointNormalColor = a.getColor(R.styleable.FlowIndicator_point_normal_color, 0x000000);
        mPointSelectedColor = a.getColor(R.styleable.FlowIndicator_point_selected_color, 0xffff07);
        Drawable normal_drawable = a.getDrawable(R.styleable.FlowIndicator_point_normal_drawable);
        Drawable selected_drawable = a.getDrawable(R.styleable.FlowIndicator_point_selected_drawable);
        if (null != normal_drawable) {
            mNormalBitmap = ImageUtil.drawable2Bitmap(normal_drawable);
            Matrix matrix = new Matrix();
            int width = mNormalBitmap.getWidth();
            int w = ViewUtil.getScreenW() * width / ViewUtil.screenWidth;
            int height = mNormalBitmap.getHeight();
            int h = ViewUtil.getScreenW() * height / ViewUtil.screenWidth;
            matrix.postScale((float) w / width, (float) h / height);
            mNormalBitmap = Bitmap.createBitmap(mNormalBitmap, 0, 0, mNormalBitmap.getWidth(), mNormalBitmap.getHeight(),
                    matrix, true);
        }
        if (null != selected_drawable) {
            mSelectedBitmap = ImageUtil.drawable2Bitmap(selected_drawable);
            Matrix matrix = new Matrix();
            int width = mSelectedBitmap.getWidth();
            int w = ViewUtil.getScreenW() * width / ViewUtil.screenWidth;
            int height = mSelectedBitmap.getHeight();
            int h = ViewUtil.getScreenW() * height / ViewUtil.screenWidth;
            matrix.postScale((float) w / width, (float) h / height);
            mSelectedBitmap = Bitmap.createBitmap(mSelectedBitmap, 0, 0, mSelectedBitmap.getWidth(), mSelectedBitmap.getHeight(),
                    matrix, true);
        }
        a.recycle();
        mPaint = new Paint();
    }

    public void setSelection(int index) {
        this.mSelectedIndex = index;
        invalidate();
    }

    public void setCount(int count) {
        this.mCount = count;
        requestLayout();
        invalidate();
    }

    public void next() {
        if (mSelectedIndex < mCount - 1) {
            mSelectedIndex++;
        } else {
            mSelectedIndex = 0;
        }
        invalidate();
    }

    public void previous() {
        if (mSelectedIndex > 0) {
            mSelectedIndex--;
        } else {
            mSelectedIndex = mCount - 1;
        }
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setAntiAlias(true);
        float width = (getWidth() - ((mRadius * 2 * mCount) + (mSpace * (mCount - 1)))) / 2.f;
        for (int i = 0; i < mCount; i++) {
            if (null != mNormalBitmap && null != mSelectedBitmap) {
                if (i == mSelectedIndex) {
                    canvas.drawBitmap(mSelectedBitmap, width + getPaddingLeft() + i * (mSpace + mRadius + mRadius), 0,
                            mPaint);
                } else {
                    canvas.drawBitmap(mNormalBitmap, width + getPaddingLeft() + i * (mSpace + mRadius + mRadius), 0,
                            mPaint);
                }
            } else {
                if (i == mSelectedIndex) {
                    mPaint.setColor(mPointSelectedColor);
                } else {
                    mPaint.setColor(mPointNormalColor);
                }
                canvas.drawCircle(width + getPaddingLeft() + mRadius + i * (mSpace + mRadius + mRadius),
                        getHeight() / 2f, mRadius, mPaint);
            }

        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    private int measureWidth(int measureSpec) {
        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            if (null != mNormalBitmap) {
                mRadius = mNormalBitmap.getWidth() / 2.0f;
            }
            result = (int) (getPaddingLeft() + getPaddingRight() + (mCount * 2 * mRadius) + (mCount - 1) * mSpace + 1);
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;
    }

    private int measureHeight(int measureSpec) {
        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            float height = mRadius;
            if (null != mNormalBitmap) {
                height = mNormalBitmap.getWidth() / 2.0f;
            }
            result = (int) (2 * height + getPaddingTop() + getPaddingBottom() + 1);
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;
    }

}
