package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.github.chrisbanes.photoview.PhotoView;

public class CampusMap extends AppCompatActivity {
    //button variable declared
    private Button Map_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_map);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        Map_button = findViewById(R.id.Map_button);
        Map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaps();
            }
        });




    }
    //method for when live map button pressed
    private void openMaps(){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);

    }
    //creating three-dot menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dropdown_menu, menu);
        return true;
    }
    //methods for when item selected in three-dot menu

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item3:
            {
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
                Intent intent = new Intent(this, ByTheDay.class);
                startActivity(intent);
                return true;
            }case R.id.subitem5:
            {
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
