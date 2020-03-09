package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class WestfieldGallery extends AppCompatActivity {
    ViewPager westfieldgallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westfield_gallery);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        westfieldgallery = (ViewPager)findViewById(R.id.westfieldgallery);
        ViewPagerAdapterWestfield viewPagerAdapter = new ViewPagerAdapterWestfield(this);
        westfieldgallery.setAdapter(viewPagerAdapter);
    }
}
