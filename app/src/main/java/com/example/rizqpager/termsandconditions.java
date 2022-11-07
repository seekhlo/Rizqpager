package com.example.rizqpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class termsandconditions extends AppCompatActivity {
     ConstraintLayout btncont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsandconditions);
        btncont = findViewById(R.id.usama1);
        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), waitingscreenf.class);
                startActivity(intent);
                Toast.makeText(termsandconditions.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}