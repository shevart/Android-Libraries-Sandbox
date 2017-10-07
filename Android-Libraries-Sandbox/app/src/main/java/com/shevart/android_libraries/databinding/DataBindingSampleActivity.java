package com.shevart.android_libraries.databinding;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;

import com.shevart.android_libraries.R;
import com.shevart.android_libraries.models.User;
import com.shevart.android_libraries.util.MockUtil;

import java.lang.ref.WeakReference;

public class DataBindingSampleActivity extends BaseActivity<ActivityDataBindingSampleBinding> {
    private LoadUserHandler loadUserHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadUserHandler = new LoadUserHandler(this);
        loadUserHandler.loadUser();
    }

    @Override
    protected void onBound(@NonNull ActivityDataBindingSampleBinding binding) {
        binding.setIsLoading(true);
    }

    @Override
    protected int provideLayoutRes() {
        return R.layout.activity_data_binding_sample;
    }

    private void onUserLoaded(@NonNull User user) {
        getBinding().setUser(user);
        getBinding().setIsLoading(false);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loadUserHandler.removeCallbacksAndMessages(null);
    }

    private static class LoadUserHandler extends Handler {
        static final int USER_LOADED_WHAT = 1;
        private WeakReference<DataBindingSampleActivity> activityWeakReference;

        private LoadUserHandler(@NonNull DataBindingSampleActivity activity) {
            activityWeakReference = new WeakReference<>(activity);
        }

        private void loadUser() {
            final Message msg = obtainMessage(USER_LOADED_WHAT);
            sendMessageDelayed(msg, 2500);
        }

        @Override
        public void handleMessage(Message msg) {
            if (msg.what == USER_LOADED_WHAT) {
                if (activityWeakReference.get() != null) {
                    activityWeakReference.get().onUserLoaded(MockUtil.Users.nextUser());
                }
            }
        }
    }
}