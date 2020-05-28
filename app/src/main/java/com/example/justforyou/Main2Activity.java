package com.example.justforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public Button mDate1,mDate2,mDate3,mDate4,mDate5,mDate6,mDate7,mDate8,mDate9,mDate10;
    public int mDateNumber;

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
                mDateNumber=1 ;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);


            }
        });
        mDate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=2;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });
        mDate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=3;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });
        mDate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=4;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });
        mDate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=5;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });

        mDate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=6;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });

        mDate7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=7;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });

        mDate8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=8;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);

                startActivity(mIntent);

            }
        });

        mDate9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=9;
                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                finish();
                startActivity(mIntent);

            }
        });

        mDate10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDateNumber=10;

                Intent mIntent = new Intent(Main2Activity.this,Main3Activity.class);
                mIntent.putExtra("mDateValue",mDateNumber);
                startActivity(mIntent);

            }
        });


    }
}
