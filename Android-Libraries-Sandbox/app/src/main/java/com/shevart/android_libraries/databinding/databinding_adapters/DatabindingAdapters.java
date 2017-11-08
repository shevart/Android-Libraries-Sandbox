package com.shevart.android_libraries.databinding.databinding_adapters;

import android.annotation.SuppressLint;
import android.databinding.BindingAdapter;
import android.widget.EditText;

import com.shevart.android_libraries.models.User;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;

public class DatabindingAdapters {
    @SuppressLint("SetTextI18n")
    @BindingAdapter("userName")
    public static void userName(@NonNull EditText et, @Nullable User user) {
        if (user == null) {
            et.setText(null);
            return;
        }
        et.setText(user.getName() + " " + user.getSecondName());
    }
}
