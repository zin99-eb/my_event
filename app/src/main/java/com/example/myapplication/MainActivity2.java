package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity2 extends AppCompatActivity {

    private static final int DELAY_MILLISECONDS = 3000; // 3 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Create a Handler to delay the navigation
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to navigate to the other activity
                Intent intent = new Intent(MainActivity2.this, LoginActivity.class);

                // Start the new activity
                startActivity(intent);

                // Finish the current activity if needed
                finish();
            }
        }, DELAY_MILLISECONDS);
    }
}