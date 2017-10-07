package com.shevart.android_libraries;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shevart.android_libraries.databinding.DataBindingSampleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btDataBinding).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btDataBinding:
                startActivity(new Intent(MainActivity.this, DataBindingSampleActivity.class));
                break;
            default:
                throw new IllegalArgumentException("Check it!");
        }
    }
}