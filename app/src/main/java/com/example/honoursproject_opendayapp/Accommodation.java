package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Accommodation extends AppCompatActivity {

    private Button courtyard_button;
    private Button westfield_button;
    private Button taylorcourt_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        courtyard_button = findViewById(R.id.courtyard_button);
        courtyard_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCourtyard();
            }
        });

        westfield_button = findViewById(R.id.westfield_button);
        westfield_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWestfield();
            }
        });

        taylorcourt_button = findViewById(R.id.taylorcourt_button);
        taylorcourt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTaylorCourt();
            }
        });
    }

    private void openCourtyard(){
        Intent intent = new Intent(this, Courtyard.class);
        startActivity(intent);

    }

    private void openWestfield(){
        Intent intent = new Intent(this, Westfield.class);
        startActivity(intent);

    }

    private void openTaylorCourt(){
        Intent intent = new Intent(this, TaylorCourt.class);
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
