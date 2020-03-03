package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Activities extends AppCompatActivity {

    private Button monday_button;
    private Button tuesday_button;
    private Button wednesday_button;
    private Button thursday_button;
    private Button friday_button;
    private Button saturday_button;
    private Button sunday_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        monday_button = findViewById(R.id.monday_button);
        monday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonday();
            }
        });

        tuesday_button = findViewById(R.id.tuesday_button);
        tuesday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTuesday();
            }
        });

        wednesday_button = findViewById(R.id.wednesday_button);
        wednesday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWednesday();
            }
        });

        thursday_button = findViewById(R.id.thursday_button);
        thursday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThursday();
            }
        });

        friday_button = findViewById(R.id.friday_button);
        friday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFriday();
            }
        });

        saturday_button = findViewById(R.id.saturday_button);
        saturday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaturday();
            }
        });

        sunday_button = findViewById(R.id.sunday_button);
        sunday_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSunday();
            }
        });


    }

    private void openMonday(){
        Intent intent = new Intent(this, Monday.class);
        startActivity(intent);
    }

    private void openTuesday(){
        Intent intent = new Intent(this, Tuesday.class);
        startActivity(intent);
    }

    private void openWednesday(){
        Intent intent = new Intent(this, Wednesday.class);
        startActivity(intent);
    }

    private void openThursday(){
        Intent intent = new Intent(this, Thursday.class);
        startActivity(intent);
    }

    private void openFriday(){
        Intent intent = new Intent(this, Friday.class);
        startActivity(intent);
    }

    private void openSaturday(){
        Intent intent = new Intent(this, Saturday.class);
        startActivity(intent);
    }

    private void openSunday(){
        Intent intent = new Intent(this, Sunday.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dropdown_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item3:
            {
                Intent intent = new Intent(this, Parking.class);
                startActivity(intent);
                return true;
            }

            case R.id.item5:
            {
                Intent intent = new Intent(this, CampusMap.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem1:
            {
                Intent intent = new Intent(this, Courtyard.class);
                startActivity(intent);
                return true;
            }case R.id.subitem2:
            {
                Intent intent = new Intent(this, Westfield.class);
                startActivity(intent);
                return true;
            }case R.id.subitem3:
            {
                Intent intent = new Intent(this, TaylorCourt.class);
                startActivity(intent);
                return true;
            }case R.id.subitem4:
            {
                Intent intent = new Intent(this, Monday.class);
                startActivity(intent);
                return true;
            }case R.id.subitem5:
            {
                Intent intent = new Intent(this, Tuesday.class);
                startActivity(intent);
                return true;
            }case R.id.subitem6:
            {
                Intent intent = new Intent(this, Wednesday.class);
                startActivity(intent);
                return true;
            }case R.id.subitem7:
            {
                Intent intent = new Intent(this, Thursday.class);
                startActivity(intent);
                return true;
            }case R.id.subitem8:
            {
                Intent intent = new Intent(this, Friday.class);
                startActivity(intent);
                return true;
            }case R.id.subitem9:
            {
                Intent intent = new Intent(this, Saturday.class);
                startActivity(intent);
                return true;
            }case R.id.subitem10:
            {
                Intent intent = new Intent(this, Sunday.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem11:
            {
                Intent intent = new Intent(this, Chemistry.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem12:
            {
                Intent intent = new Intent(this, ComputerScience.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem13:
            {
                Intent intent = new Intent(this, Criminology.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem14:
            {
                Intent intent = new Intent(this, Geography.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem15:
            {
                Intent intent = new Intent(this, History.class);
                startActivity(intent);
                return true;
            }
            case R.id.subitem16:
            {
                Intent intent = new Intent(this, Maths.class);
                startActivity(intent);
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
