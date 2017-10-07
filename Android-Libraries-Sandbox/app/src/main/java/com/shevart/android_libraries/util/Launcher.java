package com.shevart.android_libraries.util;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.shevart.android_libraries.databinding.DataBindingSampleActivity;

public class Launcher {
    public static class ActivityComponent {
        public static void dataBinding(@NonNull Activity activity) {
            activity.startActivity(new Intent(activity, DataBindingSampleActivity.class));
        }
    }
}
