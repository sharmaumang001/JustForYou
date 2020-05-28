package com.example.justforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    public TextView mTextView;
    public String  mDateNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextView = findViewById(R.id.date_text);
        mDateNumber = getIntent().getStringExtra("mDateValue");
        Log.d("justForYou","DATE CHOSEN IS    "+mDateNumber);


//        if(mDateNumber == "1"){
//            mTextView.setText(R.string.date1);
//        }else if(mDateNumber=="2"){
//            mTextView.setText(R.string.date2);
//        }else if(mDateNumber=="3"){
//            mTextView.setText(R.string.date3);
//        }else if(mDateNumber=="4"){
//            mTextView.setText(R.string.date4);
//        }else if(mDateNumber=="5"){
//            mTextView.setText(R.string.date5);
//        }else if(mDateNumber=="6"){
//            mTextView.setText(R.string.date6);
//        }else if(mDateNumber=="7"){
//            mTextView.setText(R.string.date7);
//        }else if(mDateNumber=="8"){
//            mTextView.setText(R.string.date8);
//        }else if(mDateNumber=="9"){
//            mTextView.setText(R.string.date9);
//        }else{
//            mTextView.setText(R.string.date10);
//        }

    }

}

