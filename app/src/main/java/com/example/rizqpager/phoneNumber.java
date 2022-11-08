package com.example.rizqpager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class phoneNumber extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnback;
    ConstraintLayout  cont;
    String a;
    EditText inputfield;
    private static final String TAG = "phoneNumber";
    ConstraintLayout continuebutton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
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
        cont = findViewById(R.id.cont_btn);
        inputfield = findViewById(R.id.textinput);
        continuebutton= findViewById( R.id.continuebutton);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = inputfield.getText().toString();
                inputfield.setText(a+"1");
                Log.d(TAG,"Value = "+inputfield.getText().toString());
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
        }
        );
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputfield.getText().toString().length() < 10 || inputfield.getText().toString().length()>10){
                    inputfield.setBackgroundResource(R.drawable.edittextred);
                    Toast.makeText(phoneNumber.this, "Enter a valid phone number", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(getApplicationContext(), otp.class);
                    startActivity(i);
                }
            }
        }
        );
    }
}