package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class CampusMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_map);
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
            case R.id.item4:
            {
                Intent intent = new Intent(this, Schedule.class);
                startActivity(intent);
                return true;
            }
            case R.id.item5:
            {
                Intent intent = new Intent(this, CampusMap.class);
                startActivity(intent);
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
