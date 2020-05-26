package com.example.justforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public Button mDate1,mDate2,mDate3,mDate4,mDate5,mDate6,mDate7,mDate8,mDate9,mDate10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mDate1 = findViewById(R.id.Date1);
        mDate2 = findViewById(R.id.Date2);
        mDate3 = findViewById(R.id.Date3);
        mDate4 = findViewById(R.id.Date4);
        mDate5 = findViewById(R.id.Date5);
        mDate6 = findViewById(R.id.Date6);
        mDate7 = findViewById(R.id.Date7);
        mDate8 = findViewById(R.id.Date8);
        mDate9 = findViewById(R.id.Date9);
        mDate10 = findViewById(R.id.Date10);

        mDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mDate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mDate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mDate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mDate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDate7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDate8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDate9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDate10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
