package com.example.delivery.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import com.example.delivery.R;


/**
 * author:Ken
 * time:2019/3/11
 */
public class ObtainViewActivity extends AppCompatActivity {
    private final  String TAG =  "Ken";
    View view;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtain_view);
        Log.d(TAG,"onCreate");
        view = findViewById(R.id.obtain_view);
        Log.d(TAG,"create------ height:"+view.getHeight());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Log.d(TAG,"create---layoutParm---height:"+layoutParams.height);
        view.post(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG,"run------height:"+view.getHeight());
            }
        });
//        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
////        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
////            @Override
////            public void onGlobalLayout() {
////                if(viewTreeObserver.isAlive()){
////                    Log.d(TAG,"onGlobalLayout------ height:"+view.getHeight());
////                   Log.d(TAG,"onGlobalLayout---layoutParm---height:"+view.getMeasuredHeight());
////                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
////                    Log.d(TAG,"onGlobalLayout---layoutParm---height:"+layoutParams.height);
////
////                }
////            }
////        });
        //获得ViewTreeObserver
        final ViewTreeObserver observer=view.getViewTreeObserver();
//注册观察者，监听变化
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                //判断ViewTreeObserver 是否alive，如果存活的话移除这个观察者
                if(observer.isAlive()){
                    observer.removeGlobalOnLayoutListener(this);
                    //获得宽高
                    int viewWidth=view.getMeasuredWidth();
                    int viewHeight=view.getMeasuredHeight();
                    Log.d(TAG,"onGlobalLayout---layoutParm---height:"+viewHeight);

                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.d(TAG,"onWindowFocusChanged");
        view = findViewById(R.id.obtain_view);
        Log.d(TAG,"onWindowFocusChanged------ height:"+view.getHeight());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Log.d(TAG,"onWindowFocusChanged---layoutParm---height:"+layoutParams.height);

    }
}
