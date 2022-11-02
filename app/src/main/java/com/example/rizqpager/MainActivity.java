package com.example.rizqpager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ArrayList<Integer> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager1);
        arrayList.add(R.drawable.first);
        arrayList.add(R.drawable.forth);
        arrayList.add(R.drawable.third);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, arrayList);
        viewPager.setAdapter(myAdapter);
    }
}




