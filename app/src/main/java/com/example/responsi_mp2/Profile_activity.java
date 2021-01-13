package com.example.responsi_mp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activity);
        setContentView(R.layout.activity_profile_activity);
        final SharedPrefManager sharedPrefManager = new SharedPrefManager(this);

        TextView username = findViewById(R.id.tvUsername);
        TextView password = findViewById(R.id.tvPassword);
        TextView logout = findViewById(R.id.tvLogout);

        username.setText(sharedPrefManager.getUsername());
        password.setText(sharedPrefManager.getPassword());

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile_activity.this, MainActivity.class);
                sharedPrefManager.saveIsLogin(false);
                finishAffinity();
                startActivity(i);
            }
        });
    }
}