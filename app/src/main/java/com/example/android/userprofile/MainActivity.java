package com.example.android.userprofile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.picture);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Eren");
        name.setTextColor(Color.WHITE);
        name.setTextSize(32);
        name.setTypeface(null, Typeface.BOLD);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("22.04.1987");
        birthday.setTextColor(Color.WHITE);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("TURKEY");
        country.setTextColor(Color.WHITE);
    }
}
