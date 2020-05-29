package com.example.honoursproject_opendayapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapterWestfield extends PagerAdapter {

    //variables
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.westfieldimage1, R.drawable.westfieldimage2, R.drawable.westfieldimage3, R.drawable.westfieldimage4, R.drawable.westfieldimage5, R.drawable.westfieldimage6, R.drawable.westfieldimage7};

    public ViewPagerAdapterWestfield(Context context) {
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
        View view = layoutInflater.inflate(R.layout.image_slider_westfield, null);
        ImageView imageView15 = (ImageView)view.findViewById(R.id.imageView15);
        imageView15.setImageResource(images[position]);

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
