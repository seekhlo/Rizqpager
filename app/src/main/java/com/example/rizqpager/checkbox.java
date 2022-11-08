package com.example.rizqpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {
ConstraintLayout buttontopass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        buttontopass = findViewById(R.id.buttonlast);

        buttontopass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), waitingscreenf.class);
                startActivity(intent);
                Toast.makeText(checkbox.this, "Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}