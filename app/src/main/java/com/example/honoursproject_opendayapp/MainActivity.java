package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button accommodation_button;
    private Button activities_button;
    private Button schedule_button;
    private Button parking_button;
    private Button campusmap_button;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        accommodation_button = findViewById(R.id.accommodation_button);
        accommodation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccommodation();
            }
        });

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
                openSchedule();
            }
        });
    }

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

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu){
    //    MenuInflater inflater = getMenuInflater();
    //    inflater.inflate(R.menu.example_menu, menu);
    //    return true;
    //}


}
