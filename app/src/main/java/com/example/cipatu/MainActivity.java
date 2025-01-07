package com.example.cipatu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.HandlerCompat;
import android.content.Intent;
import android.widget.ImageButton;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_page);

        getSupportActionBar().hide();

        ImageButton registerButton = findViewById(R.id.imageButton_register);

        // Set an OnClickListener
        registerButton.setOnClickListener(v -> {
            // Create an intent to navigate to the LoginActivity
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

    }
}