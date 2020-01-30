package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Parking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);
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
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
