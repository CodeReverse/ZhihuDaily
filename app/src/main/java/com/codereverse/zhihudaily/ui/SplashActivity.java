package com.codereverse.zhihudaily.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.codereverse.zhihudaily.R;
import com.codereverse.zhihudaily.databinding.ActivitySplashBinding;

/**
 * Created by dennis on 2017/1/9.
 */

public class SplashActivity extends BaseActivity {
    ActivitySplashBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
    }
}
