package com.autism.timelibs.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import com.autism.timelibs.R;

/**
 * @author autism
 */
public class ViewUtil {
    public static int screenWidth = 1080;

    /**
     * @param view   需要适配的view
     * @param width  高保真UI上的像素值，传0为不测量
     * @param height 高保真UI上的像素值，传0为不测量
     */
    public static void measure(View view, int width, int height) {
        if (0 != width) {
            setViewWidth(view, getScreenW() * width / screenWidth);
        }
        if (0 != height) {
            setViewHeight(view, getScreenW() * height / screenWidth);
        }
    }

    /**
     * 获取屏幕宽度
     *
     * @return 屏幕宽度
     */
    public static int getScreenW() {
        DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 设置view的高度
     *
     * @param view   指定的view
     * @param height 指定的高度，以像素为单位
     */
    public static void setViewHeight(View view, int height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = height;
        view.setLayoutParams(params);
    }

    /**
     * 设置view的宽度
     *
     * @param view  指定的view
     * @param width 指定的宽度，以像素为单位
     */
    public static void setViewWidth(View view, int width) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = width;
        view.setLayoutParams(params);
    }

    /**
     * 判断字符串是否为null或者空字符串
     *
     * @param input 输入的字符串
     * @return 如果为null或者空字符串，返回true；否则返回false
     */
    public static boolean isNullOrEmpty(String input) {
        return TextUtils.isEmpty(input) || 0 == input.trim().length();
    }

    /**
     * 进入 从下往上动画
     *
     * @param activity 上下文对象
     */
    public static void bottom2TopIn(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.no_anim);
    }

    /**
     * 出去 从下往上动画
     *
     * @param activity 上下文对象
     */
    public static void bottom2TopOut(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.no_anim, R.anim.abc_slide_out_top);
    }

    /**
     * 出去 从上往下动画
     *
     * @param activity 上下文对象
     */
    public static void top2BottomOut(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.no_anim, R.anim.abc_slide_out_bottom);
    }

    /**
     * 出去 从上往下动画
     *
     * @param activity 上下文对象
     */
    public static void top2BottomIn(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.abc_slide_in_top, R.anim.no_anim);
    }

    public static void right2LeftIn(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.slide_in_from_right, R.anim.no_anim);
    }

    public static void left2RightOut(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.no_anim, R.anim.slide_out_to_right);
    }

    public static void statusBarTranslucent(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = activity.getWindow();
            // Translucent status bar
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    /**
     * 移动光标到最后
     *
     * @param editText 输入框
     */
    public static void moveCursorToEnd(EditText editText) {
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
    }
}
