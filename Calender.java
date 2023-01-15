package com.example.lovet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

public class Calender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        Button backButton = findViewById(R.id.backbuttonC);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        CalendarView calendarView = findViewById(R.id.calendarView);
        final TextView Event1 = findViewById(R.id.Event1);
        final TextView Event2 = findViewById(R.id.Event2);
        final TextView Event3 = findViewById(R.id.Event3);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int event1, int event2, int event3) {
                Event1.setText("Event Name : " + "Event Website : ");
                Event2.setText("Event Name : " + "Event Website : ");
                Event3.setText("Event Name : " + "Event Website : ");

            }
        });

    }
}