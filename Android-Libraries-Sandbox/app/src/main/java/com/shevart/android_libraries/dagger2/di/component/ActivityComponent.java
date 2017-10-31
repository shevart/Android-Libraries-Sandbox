package com.shevart.android_libraries.dagger2.di.component;

import android.support.annotation.NonNull;

import com.shevart.android_libraries.dagger2.Dagger2SampleActivity;
import com.shevart.android_libraries.dagger2.DataSourceManager;
import com.shevart.android_libraries.dagger2.di.module.ActivityModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(@NonNull Dagger2SampleActivity activity);

    DataSourceManager getDataSourceManager();
}