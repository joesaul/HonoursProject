package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class TouristAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attractions);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        TextView textView = findViewById(R.id.textView7);



        String text = "Tourist Attractions:\n • The Deep\n • Humber Bridge\n • Bonus Arena\n • Hull City Hall\n • Holy Trinity Church\n • East Park\n • Barton-Upon-Humber\n • Kcom Stadium \n • Ferens Art Gallery \n • Wilberforce House\n • Hull Maritime Museum\n • Hull Marina \n • Streetlife Museum ";

        SpannableString ss = new SpannableString(text);


        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openTheDeep();

            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);

            }
        };

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {

                openHumberBridge();

            }
            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openBonusArena();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openCityHall();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan5 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openTrinityChurch();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan6 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openEastPark();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan7 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openBartonUponHumber();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan8 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openKcomStadium();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan9 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openArtGallery();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan10 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openWilberforceHouse();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan11 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openMuseum();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan12 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openMarina();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan13 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openStreetlife();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };

        ss.setSpan(clickableSpan1, 24, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2, 35, 49, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan3, 52, 64, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan4, 67, 82, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan5, 86, 105, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan6, 109, 118, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan7, 121, 140, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan8, 144, 156, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan9, 161, 179, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan10, 183, 201, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan11, 204, 225, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan12, 228, 240, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan13, 245, 262, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


    }
    public void openTheDeep()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.thedeep.co.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openHumberBridge()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.humberbridge.co.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openBonusArena()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.bonusarenahull.com/"));
        startActivity(openImplicitIntent);


    }
    public void openCityHall()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.hulltheatres.co.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openTrinityChurch()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://hullminster.org/"));
        startActivity(openImplicitIntent);


    }
    public void openEastPark()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.hcandl.co.uk/sport-and-leisure-and-parks/your-local-park/east-park"));
        startActivity(openImplicitIntent);


    }
    public void openBartonUponHumber()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.barton-upon-humber.org.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openKcomStadium()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://kcomstadium.com/"));
        startActivity(openImplicitIntent);


    }
    public void openArtGallery()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.hcandl.co.uk/museums-and-galleries/ferens"));
        startActivity(openImplicitIntent);


    }
    public void openWilberforceHouse()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.hcandl.co.uk/museums-and-galleries/wilberforce-house/wilberforce-house"));
        startActivity(openImplicitIntent);


    }
    public void openMuseum()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.hcandl.co.uk/museums-and-galleries/hull-maritime-museum/maritime-museum"));
        startActivity(openImplicitIntent);


    }
    public void openMarina()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://bwml.co.uk/hull-marina/"));
        startActivity(openImplicitIntent);


    }
    public void openStreetlife()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.hcandl.co.uk/museums-and-galleries/streetlife-museum/streetlife-museum"));
        startActivity(openImplicitIntent);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
