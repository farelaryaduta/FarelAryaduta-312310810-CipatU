package com.example.cipatu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomepageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_cipatu);

        getSupportActionBar().hide();

        ImageButton pickupButton = findViewById(R.id.imageButton_pickup);
        ImageButton orderButton = findViewById(R.id.imageButton_delivery);

// Set onClickListener for the pickup button
        pickupButton.setOnClickListener(v -> {
            // Create an intent to navigate to HomepageActivity for pickup
            Intent intent = new Intent(HomepageActivity.this, OrderActivity.class);
            intent.putExtra("orderType", "pickup");
            startActivity(intent);
        });

// Set onClickListener for the Delivery button
        orderButton.setOnClickListener(v -> {
            // Create an intent to navigate to HomepageActivity for delivery
            Intent intent = new Intent(HomepageActivity.this, OrderActivity.class);
            intent.putExtra("orderType", "delivery");
            startActivity(intent);
        });



    }
}