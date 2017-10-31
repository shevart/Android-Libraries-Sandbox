package com.shevart.android_libraries;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shevart.android_libraries.util.Launcher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btDataBinding).setOnClickListener(this);
        findViewById(R.id.btDagger2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btDataBinding:
                Launcher.ActivityComponent.dataBinding(MainActivity.this);
                break;
            case R.id.btDagger2:
                Launcher.ActivityComponent.dagger2(MainActivity.this);
                break;
            default:
                throw new IllegalArgumentException("Check it!");
        }
    }
}