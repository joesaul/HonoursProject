package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class CourtyardGallery extends AppCompatActivity {
    ViewPager courtyardgallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courtyard_gallery);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        courtyardgallery = (ViewPager)findViewById(R.id.courtyardgallery);
    }
}
