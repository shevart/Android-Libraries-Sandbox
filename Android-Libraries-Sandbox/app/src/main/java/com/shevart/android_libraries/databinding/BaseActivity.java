package com.shevart.android_libraries.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

abstract class BaseActivity<DB extends ViewDataBinding> extends AppCompatActivity {
    private DB binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, provideLayoutRes());
        onBound(binding);
    }

    protected abstract void onBound(@NonNull DB binding);

    @Override
    public final void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }

    @LayoutRes
    protected abstract int provideLayoutRes();

    protected DB getBinding() {
        return binding;
    }
}