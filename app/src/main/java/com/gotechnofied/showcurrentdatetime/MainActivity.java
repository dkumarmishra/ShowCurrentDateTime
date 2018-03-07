package com.gotechnofied.showcurrentdatetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView textViewtime,textViewdate;
    SimpleDateFormat simpleDateFormat;
    String time;
    Calendar calander;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewdate = (TextView)findViewById(R.id.textViewDateValue);
        textViewtime = (TextView)findViewById(R.id.textViewTImeValue);


        /// For Show Date
        String currentDateString = DateFormat.getDateInstance().format(new Date());
        // textView is the TextView view that should display it
        textViewdate.setText(currentDateString);
        /// For Show Time
        String currentTimeString = DateFormat.getTimeInstance().format(new Date());
        // textView is the TextView view that should display it
        textViewtime.setText(currentTimeString);
    }
}
