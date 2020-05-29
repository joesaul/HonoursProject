package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //button variables
    private Button accommodation_button;
    private Button activities_button;
    private Button schedule_button;
    private Button parking_button;
    private Button campusmap_button;
    private Button uniofhullwebsite_button;
    private Button liveMap_button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liveMap_button = findViewById(R.id.liveMap_button);
        liveMap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaps();
            }
        });

        accommodation_button = findViewById(R.id.accommodation_button);
        accommodation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccommodation();
            }
        });
        //calling button methods
        activities_button = findViewById(R.id.activities_button);
        activities_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivities();
            }
        });

        schedule_button = findViewById(R.id.schedule_button);
        schedule_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSchedule();
            }
        });

        parking_button = findViewById(R.id.parking_button);
        parking_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParking();
            }
        });

        campusmap_button = findViewById(R.id.campusmap_button);
        campusmap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCampusMap();
            }
        });


        uniofhullwebsite_button = findViewById(R.id.uniofhullwebsite_button);
        uniofhullwebsite_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openURL();
            }
        });
    }
    //methods for when buttons are pressed
    private void openAccommodation(){
        Intent intent = new Intent(this, Accommodation.class);
        startActivity(intent);
    }

    private void openSchedule(){
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }

    private void openActivities(){
        Intent intent = new Intent(this, Activities.class);
        startActivity(intent);
    }

    private void openParking(){
        Intent intent = new Intent(this, Parking.class);
        startActivity(intent);
    }

    private void openCampusMap(){
        Intent intent = new Intent(this, CampusMap.class);
        startActivity(intent);
    }

    public void openURL()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://hull.ac.uk"));
        startActivity(openImplicitIntent);


    }
    private void openMaps(){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }





}
