package com.shevart.android_libraries.databinding.databinding_adapters;

import android.annotation.SuppressLint;
import android.databinding.BindingAdapter;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shevart.android_libraries.models.User;
import com.shevart.android_libraries.util.DateUtil;

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

    @BindingAdapter("userAvatar")
    public static void userAvatar(@NonNull ImageView iv, @Nullable User user) {
        if (user == null) {
            iv.setImageDrawable(null);
            return;
        }
        Glide.with(iv.getContext())
                .load(user.getAvatarUrl())
                .into(iv);
    }

    @BindingAdapter("userBirthday")
    public static void userBirthday(@NonNull EditText et, @Nullable User user) {
        if (user == null) {
            et.setText(null);
            return;
        }
        et.setText(DateUtil.dateToStr(user.getBirthday()));
    }
}
