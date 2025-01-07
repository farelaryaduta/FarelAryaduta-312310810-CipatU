package com.example.cipatu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        getSupportActionBar().hide();

        ImageButton loginButton = findViewById(R.id.imageButton_login);

        // Set an OnClickListener
        loginButton.setOnClickListener(v -> {
            // Create an intent to navigate to the LoginActivity
            Intent intent = new Intent(LoginActivity.this, HomepageActivity.class);
            startActivity(intent);
        });
    }
}