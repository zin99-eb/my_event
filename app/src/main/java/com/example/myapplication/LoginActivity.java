package com.example.myapplication;


import android.annotation.SuppressLint;
<<<<<<< HEAD
import android.os.Bundle;
=======
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
>>>>>>> 43a156d8168b8a6f9aedf29e1772d240b2f96287
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Set a click listener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve entered username and password
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Implement authentication logic here
                if (username.equals("Admin") && password.equals("123")) {
                    // Successful login
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    // Failed login
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}