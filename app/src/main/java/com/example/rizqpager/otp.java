package com.example.rizqpager;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.poovam.pinedittextfield.LinePinField;

public class otp extends AppCompatActivity {
    ImageView back;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnback;
    String a;
    LinePinField inputfield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        back= findViewById(R.id.arrow);
        btn1= findViewById(R.id.button1);
        btn2= findViewById(R.id.button2);
        btn3= findViewById(R.id.button3);
        btn4= findViewById(R.id.button4);
        btn5= findViewById(R.id.button5);
        btn6= findViewById(R.id.button6);
        btn7= findViewById(R.id.button7);
        btn8= findViewById(R.id.button8);
        btn9= findViewById(R.id.button9);
        btn0= findViewById(R.id.button0);
        btnback = findViewById(R.id.buttonback);
        inputfield = findViewById(R.id.otp);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"0");
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                if(a.equals("")){

                    inputfield.setText("");

                }
                else {
                    a = a.substring(0, a.length()-1);
                    inputfield.setText(a);
                }
            }
        });
        inputfield.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(inputfield.length() == 4){
                    Intent intent = new Intent(getApplicationContext(), checkbox.class);
                    startActivity(intent);
            }}
        });

    }
}






















