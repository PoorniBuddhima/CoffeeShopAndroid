package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrderConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        Button btn8 = findViewById(R.id.cancelOrderButton);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(OrderConfirmationActivity.this, MyOrderActivity.class);
                startActivity(intent);
            }

        });

        Button btn9 = findViewById(R.id.confirmOrderButton);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(OrderConfirmationActivity.this, ConfirmedActivity.class);
                startActivity(intent);
            }
        });


    }
}