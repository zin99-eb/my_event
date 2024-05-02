package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
=======
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;



public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item))  {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

<<<<<<< HEAD
    @SuppressLint("MissingInflatedId")
=======
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

<<<<<<< HEAD

=======
            @SuppressLint("NonConstantResourceId")
>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.notification) {
                    Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.recherche) {
                    Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.calendrier) {
                    Toast.makeText(MainActivity.this, "calendrier Selected", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.invite) {
                    Toast.makeText(MainActivity.this, "invite Selected", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
<<<<<<< HEAD
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {

        super.onBackPressed();
    }

    }
=======





    }

>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
}