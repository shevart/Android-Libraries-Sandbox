package com.shevart.android_libraries.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shevart.android_libraries.R;
import com.shevart.android_libraries.dagger2.di.component.DaggerActivityComponent;
import com.shevart.android_libraries.dagger2.di.module.ActivityModule;
import com.shevart.android_libraries.util.UiNotificationsUtils;

import javax.inject.Inject;

public class Dagger2SampleActivity extends AppCompatActivity {
    @Inject
    DataSourceManager dataSourceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2_sample);

        DaggerActivityComponent
                .builder()
                .activityModule(new ActivityModule(getApplicationContext()))
                .build()
                .inject(this);

        UiNotificationsUtils.showDevMessage(this, "DataSourceManager "
                + dataSourceManager.toString());

    }
}