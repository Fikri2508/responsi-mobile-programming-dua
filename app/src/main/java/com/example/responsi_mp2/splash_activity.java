package com.example.responsi_mp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            final Handler handler = new Handler();
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_activity);

            final SharedPrefManager sharedPrefManager = new SharedPrefManager(this);


            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (sharedPrefManager.getIsLogin()){
                        Intent i = new Intent(splash_activity.this, Profile_activity.class);
                        finishAffinity();
                        startActivity(i);
                    }else{
                        Intent i = new Intent(splash_activity.this, MainActivity.class);
                        finishAffinity();
                        startActivity(i);
                    }
                }
            }, 3000);
        }
    }
