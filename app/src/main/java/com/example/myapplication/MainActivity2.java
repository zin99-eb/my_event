package com.example.myapplication;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity2 extends AppCompatActivity {

    private static final int DELAY_MILLISECONDS = 3000; // 3 seconds delay

=======
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    private static final int DELAY_MILLISECONDS = 3000; // 3 seconds delay

    @SuppressLint("MissingInflatedId")
>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

<<<<<<< HEAD
=======


     /*   bottomNavigationView= findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                    moveToFragment();

                }

                return false;
            }

            private void moveToFragment() {
            }
        });*/

>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
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
<<<<<<< HEAD
=======


>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
    }
}