package com.example.honoursproject_opendayapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapterTaylorCourt extends PagerAdapter {

    //variables
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.taylorcourtimage1, R.drawable.taylorcourtimage2, R.drawable.taylorcourtimage3, R.drawable.taylorcourtimage4, R.drawable.taylorcourtimage5, R.drawable.taylorcourtimage6, R.drawable.taylorcourtimage7};

    public ViewPagerAdapterTaylorCourt(Context context) {
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
        View view = layoutInflater.inflate(R.layout.image_slider_taylor_court, null);
        ImageView imageView14 = (ImageView)view.findViewById(R.id.imageView14);
        imageView14.setImageResource(images[position]);

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
