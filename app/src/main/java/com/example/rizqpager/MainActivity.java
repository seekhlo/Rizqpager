package com.example.rizqpager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private Button getStartedBtn;
    private ImageView[] dots;
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<String> stringArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager1);
        arrayList.add(R.drawable.first);
        arrayList.add(R.drawable.forth);
        arrayList.add(R.drawable.third);
        stringArrayList.add("Get yourself a loan with 30% Profit");
        stringArrayList.add("Imran Khan, the X Prime Minister of Pakistan");
        stringArrayList.add("There is nothing like Time travel in today's world. Can't say anything about future and past");
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, arrayList, stringArrayList);
        viewPager.setAdapter(myAdapter);
        sliderDotspanel = findViewById(R.id.sliderdots);
        dotscount = myAdapter.getCount();
        dots = new ImageView[dotscount];
        getStartedBtn = findViewById(R.id.getstarted);



        for(int i = 0; i < dotscount; i++){


            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.not_active_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDotspanel.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.not_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), phoneNumber.class );
                startActivity(i);
            }
        });
    }
}




