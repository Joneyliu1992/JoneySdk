package com.joney.joneysdk.utils;

import android.content.Context;

public final class PixelUtil {
    private PixelUtil() {}

    public static int dp2Px(final Context context, final int dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int sp2px(final Context context, final float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}