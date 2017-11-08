package com.shevart.android_libraries.util;

import android.support.annotation.NonNull;
import android.text.format.DateFormat;

import java.util.Date;

public class DateUtil {
    public static String dateToStr(@NonNull Date date) {
        return DateFormat.format("yyyy-MM-dd", date).toString();
    }
}
