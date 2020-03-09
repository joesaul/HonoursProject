package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class TaylorCourtGallery extends AppCompatActivity {
    ViewPager taylorcourtgallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taylor_court_gallery);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        taylorcourtgallery = (ViewPager)findViewById(R.id.taylorcourtgallery);
        ViewPagerAdapterTaylorCourt viewPagerAdapter = new ViewPagerAdapterTaylorCourt(this);
        taylorcourtgallery.setAdapter(viewPagerAdapter);
    }
}
