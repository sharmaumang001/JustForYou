package com.example.justforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    public TextView mTextView;
    public int mDateNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent mIntent = getIntent();
        mDateNumber = mIntent.getIntExtra("mDateValue", 0);
        mTextView = findViewById(R.id.date_text);

        Log.d("justForYou", "DATE CHOSEN IS    " + mDateNumber);



            if (mDateNumber == 1) {
                mTextView.setText(R.string.date1);
            }

            if (mDateNumber == 2) {
                mTextView.setText(R.string.date2);
            }

            if (mDateNumber == 3) {
                mTextView.setText(R.string.date3);
            }

            if (mDateNumber == 4) {
                mTextView.setText(R.string.date4);
            }

            if (mDateNumber == 5) {
                mTextView.setText(R.string.date5);
            }

            if (mDateNumber == 6) {
                mTextView.setText(R.string.date6);
            }

            if (mDateNumber == 7) {
                mTextView.setText(R.string.date7);
            }

            if (mDateNumber == 8) {
                mTextView.setText(R.string.date8);
            }

            if (mDateNumber == 9) {
                mTextView.setText(R.string.date9);
            }

            if (mDateNumber == 10) {
                mTextView.setText(R.string.date10);
            }
    }

}

