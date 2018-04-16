package com.example.a16022706.p01_dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.tvAct2);
        // Display the name and age on the TextView
        tv1.setText("Your Reflection: " + info[0] +
                "\n Response 1: "+ info[1]+
                "\n Response 2: " +info[2]+
                "\n Response 3: "+ info[3] );
    }
}
