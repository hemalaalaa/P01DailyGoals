package com.example.a16022706.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk =  (Button)findViewById(R.id.okBtn);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText etReflection =  (EditText) findViewById(R.id.editTextLast);


                RadioGroup rg1 =  (RadioGroup)findViewById(R.id.radioGroup1);
                RadioGroup rg2 =  (RadioGroup)findViewById(R.id.radioGroup2);
                RadioGroup rg3 =  (RadioGroup)findViewById(R.id.radioGroup3);


                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton)findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton)findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton)findViewById(selectedButtonId3);
                String[] info = {etReflection.getText().toString(),rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString()};

                Intent i = new Intent(MainActivity.this,SecondActivity.class);

                i.putExtra("info",info);

                startActivity(i);

            }
        });

    }
}
