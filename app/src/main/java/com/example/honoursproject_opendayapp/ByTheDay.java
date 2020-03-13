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

public class ByTheDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_the_day);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_black_24dp);

        TextView textView = findViewById(R.id.bytheday_text);



        String text = "Mondays: \nThe piper nightclub's busiest night of the week is a monday. Drinks a £1 and it is a very popular place for students to go and enjoy their monday nights. \n \nTuesdays: \nTuesday night is quiz night. Take your pick out of either the Gardeners Arms pub quiz or the Hull University Union pub quiz. Both are very popular and enjoyable. Hull City Football Club also occasionally play their matches on a tuesday evening, so if you are into sport that is another option.\n \nWednesdays:\nWednesdays are the busiest night of the week for the union as they host their weekly nightout in the asylum university nightclub 'Asylum'. This is very popular amongst students with the weekly event attracting hundreds of students each week. If you are interested in joining a society or sports team, then social gatherings for the teams take place on a wednesday and the sports teams play their matches on a wednesday.\n\nThursdays:\nThursday is karaoke night in the university union, another very enjoyable evening with plenty of people showing up and taking part. The Welly nightclub's most popular night is a thursday where they offer cheap drinks.\n\nFridays:\nAtik nightclub student night is on a friday, as they offer free entry to students before midnight with cheap drinks all night too.\n\nSaturdays:\nThe Hull City Football Club play most of their home matches on a saturday so this is an option for sport lovers, with lots of the Hull community in attendance as well. All nightclubs are open on a saturday so take your pick out of the nightclubs you have been to during the week.\n\nSundays: \nSundays are a bit of a slower day with not as much going on. You can take this time to spend time with your housemates or go to one of the tourist attractions in Hull. The Hull rugby teams do sometimes play on a sunday as well. ";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openPiper();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                openGardeners();

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
                openWelly();

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
                openAtik();

            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.BLUE);

            }
        };

        ss.setSpan(clickableSpan1, 10, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2, 240, 254, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan3, 1050, 1059, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan4, 1146, 1150, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void openPiper()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.thepiperhull.co.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openGardeners()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.thegardenersarmshull.co.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openWelly()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.giveitsomewelly.co.uk/"));
        startActivity(openImplicitIntent);


    }
    public void openAtik()
    {
        Intent openImplicitIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.atikclub.co.uk/hull"));
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
