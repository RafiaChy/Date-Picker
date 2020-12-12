package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    DatePicker myDate;
    TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDate = findViewById(R.id.datePicker);
        myText = findViewById(R.id.textView);


        Calendar myCalendar = Calendar.getInstance();

    myDate.init(myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH),
            new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                             myText.setText("Selected: "+dayOfMonth+"-"+(monthOfYear+1)+"-"+year);
                }
            }
    );
            







    }
}