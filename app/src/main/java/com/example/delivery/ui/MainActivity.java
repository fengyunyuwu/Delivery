package com.example.delivery.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.delivery.R;
import com.example.delivery.base.BaseActivity;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends BaseActivity {
    private final String TAG = "RxJava";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_obtain);
        EventBus.getDefault().post(1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ObtainViewActivity.class));
            }
        });

//        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
//            @Override
//            public void subscribe(ObservableEmitter<String> emitter) {
//                emitter.onNext("nice to meet you");
//                emitter.onError(new Throwable("滚"));
//            }
//        });
////        observable.subscribe(new Observer<String>() {
////            @Override
////            public void onSubscribe(Disposable d) {
////                Log.d(TAG, "onSubscribe");
////            }
////
////            @Override
////            public void onNext(String s) {
////                Log.d(TAG, "onNext");
////            }
////
////            @Override
////            public void onError(Throwable e) {
////                Log.d(TAG, "onError");
////            }
////
////            @Override
////            public void onComplete() {
////                Log.d(TAG, "onComplete");
////            }
////        });
    }
}
