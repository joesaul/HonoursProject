package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Schedule extends AppCompatActivity {

    private Button computerscience;
    private Button chemistry;
    private Button criminology;
    private Button geography;
    private Button history;
    private Button maths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_schedule);


        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        Spinner mySpinner = (Spinner) findViewById(R.id.timetables_spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Schedule.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.timetables));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (i == 1) {
                    startActivity(new Intent(Schedule.this, Chemistry.class));
                } else if (i == 2) {
                    startActivity(new Intent(Schedule.this, ComputerScience.class));
                } else if (i == 3) {
                    startActivity(new Intent(Schedule.this, Criminology.class));
                } else if (i == 4) {
                    startActivity(new Intent(Schedule.this, Geography.class));
                } else if (i == 5) {
                    startActivity(new Intent(Schedule.this, History.class));
                } else if (i == 6) {
                    startActivity(new Intent(Schedule.this, Maths.class));
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dropdown_menu, menu);
        return true;
    }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.item3: {
                    Intent intent = new Intent(this, Parking.class);
                    startActivity(intent);
                    return true;
                }
                case R.id.item6:
                {
                    Intent intent = new Intent(this, MapActivity.class);
                    startActivity(intent);
                    return true;
                }

                case R.id.item5: {
                    Intent intent = new Intent(this, CampusMap.class);
                    startActivity(intent);
                    return true;
                }
                case R.id.subitem1: {
                    Intent intent = new Intent(this, Courtyard.class);
                    startActivity(intent);
                    return true;
                }
                case R.id.subitem2: {
                    Intent intent = new Intent(this, Westfield.class);
                    startActivity(intent);
                    return true;
                }
                case R.id.subitem3: {
                    Intent intent = new Intent(this, TaylorCourt.class);
                    startActivity(intent);
                    return true;
                }
                case R.id.subitem4: {
                    Intent intent = new Intent(this, ByTheDay.class);
                    startActivity(intent);
                    return true;
                }
                case R.id.subitem5: {
                    Intent intent = new Intent(this, TouristAttractions.class);
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

