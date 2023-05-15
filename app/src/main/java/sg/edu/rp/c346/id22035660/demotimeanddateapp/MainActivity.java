package sg.edu.rp.c346.id22035660.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.reset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnDisplayTime.isEnabled()){
                    int hour =tp.getHour();
                    int minute = tp.getMinute();
                    tvDisplay.setText("Time is " + hour + ":" + minute);
                }
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnDisplayDate.isEnabled()){
                    int dayMonth = dp.getDayOfMonth();
                    int month = dp.getMonth() + 1;
                    int year = dp.getYear();
                    tvDisplay.setText("Date is " + dayMonth + "/" + month + "/" + year);
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnReset.isEnabled()){
                    tp.setHour(0);
                    tp.setMinute(00);
                    dp.updateDate(2020,00,01);
                }
            }
        });



    }
}

