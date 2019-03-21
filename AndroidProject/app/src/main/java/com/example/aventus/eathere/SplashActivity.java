package com.example.aventus.eathere;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
    Handler handler = new Handler();
    Runnable r = new Runnable(){

        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }
    protected void onResume(){
        super.onResume();
        handler.postDelayed(r, 4000);
    }
    protected  void onPause(){
        super.onPause();
        handler.removeCallbacks(r);
    }

}