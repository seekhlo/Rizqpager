package com.example.rizqpager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
public class MyAdapter extends PagerAdapter {
    Context context;
    ArrayList<String> imageArray;
    ArrayList<Integer> arrayList;
    LayoutInflater layoutInflater;
    public MyAdapter(Context context, ArrayList<Integer> arrayList, ArrayList<String> imageArray) {
        this.arrayList = arrayList;
        this.context = context;
        this.imageArray = imageArray;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount()
    {
        return arrayList.size();
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View v = layoutInflater.inflate(R.layout.item_file, container, false);
        ImageView imageView = v.findViewById(R.id.img);
        imageView.setImageResource(arrayList.get(position));
        TextView textView= v.findViewById(R.id.txt);
        textView.setText(imageArray.get(position));
        container.addView(v);
        return v;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      container.removeView((View) object);
    }
}
