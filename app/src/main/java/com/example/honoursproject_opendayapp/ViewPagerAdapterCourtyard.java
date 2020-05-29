package com.example.honoursproject_opendayapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapterCourtyard extends PagerAdapter {

    //variables
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.courtyardimage1, R.drawable.courtyardimage2, R.drawable.courtyardimage3, R.drawable.courtyardimage4, R.drawable.courtyardimage5, R.drawable.courtyardimage6, R.drawable.courtyardimage7};

    public ViewPagerAdapterCourtyard(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    //seting new images from array to display in gallery once user swipes

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
         layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View view = layoutInflater.inflate(R.layout.image_slider_courtyard, null);
        ImageView imageView13 = (ImageView)view.findViewById(R.id.imageView13);
        imageView13.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);


    }
}
