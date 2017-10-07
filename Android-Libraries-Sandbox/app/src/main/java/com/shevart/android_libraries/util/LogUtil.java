package com.shevart.android_libraries.util;

import android.support.annotation.NonNull;
import android.util.Log;

@SuppressWarnings("WeakerAccess")
public class LogUtil {
    private static final String TAG = "<-- Android-Libs -->";

    public static void e(@NonNull String e) {
        Log.e(TAG, e);
    }

    public static void empty() {
        Log.e(TAG, "");
    }

    public static void e(@NonNull Throwable e) {
        e.printStackTrace();
    }

    public static void d(@NonNull String e) {
        Log.d(TAG, e);
    }
}