package com.example.delivery.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * time:2019/3/15
 *
 * @author Ken
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    /**
     * 设置字体不随用户系统改变而改变
     */
    @Override
    protected void attachBaseContext(Context newBase) {
        Context newContext;
        Resources resources = newBase.getResources();
        if (resources.getConfiguration().fontScale == 1) {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            newContext = newBase.createConfigurationContext(configuration);
        } else {
            newContext = newBase;
        }
        super.attachBaseContext(newContext);
    }
}
