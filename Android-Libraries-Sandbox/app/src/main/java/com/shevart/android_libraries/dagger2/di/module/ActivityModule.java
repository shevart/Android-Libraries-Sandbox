package com.shevart.android_libraries.dagger2.di.module;

import android.content.Context;
import android.support.annotation.NonNull;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private Context context;

    public ActivityModule(@NonNull Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }
}
