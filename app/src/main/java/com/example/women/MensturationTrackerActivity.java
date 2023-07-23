package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MensturationTrackerActivity extends AppCompatActivity {
    EditText dateEditText;
    EditText monthEditText;
    EditText yearEditText;
    Button calculateButton;
    TextView ovulationDateTextView;
    TextView mensturationDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensturation_tracker);
        dateEditText = (EditText) findViewById(R.id.dateEditText);
        monthEditText = (EditText) findViewById(R.id.monthEditText);
        yearEditText = (EditText) findViewById(R.id.yearEditText);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        ovulationDateTextView =(TextView) findViewById(R.id.ovulationDateTextView);
        mensturationDateTextView = (TextView) findViewById(R.id.mensturationDateTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean valid = ValidDate();
                if (valid==false)
                    Toast.makeText(MensturationTrackerActivity.this, "Enter valid date", Toast.LENGTH_SHORT).show();
                else{
                    Ovulation();
                    Mensturation();
                }
            }
        });
    }

    private void Mensturation() {
        int y = Integer.parseInt(yearEditText.getText().toString());
        int m = Integer.parseInt(monthEditText.getText().toString());
        int d = Integer.parseInt(dateEditText.getText().toString());

        d=d+28;

        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            if (d > 31) {
                d=d-31;
                if (m==12){
                    m=1;
                    y++;
                }
                else
                    m++;
            }
        }
        else if (m==2){
            if (y%4==0 && y%100!=0 || y%400==0) {
                if (d > 29) {
                    d = d - 29;
                    m++;
                }
            }
            else{
                if (d>28){
                    d=d-28;
                    m++;
                }
            }
        }
        else if (m==4 || m==6 || m==9 || m==11){
            if (d>30){
                d = d-30;
                m++;
            }
        }

        String date = String.valueOf(d);
        String month = String.valueOf(m);
        String year = String.valueOf(y);

        mensturationDateTextView.setText(""+date+"/"+month+"/"+year);

    }

    private void Ovulation() {
        int y = Integer.parseInt(yearEditText.getText().toString());
        int m = Integer.parseInt(monthEditText.getText().toString());
        int d = Integer.parseInt(dateEditText.getText().toString());

        d=d+14;

        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            if (d > 31) {
                d=d-31;
                if (m==12){
                    m=1;
                    y++;
                }
                else
                    m++;
            }
        }
        else if (m==2){
            if (y%4==0 && y%100!=0 || y%400==0) {
                if (d > 29) {
                    d = d - 29;
                    m++;
                }
            }
            else{
                if (d>28){
                    d=d-28;
                    m++;
                }
            }
        }
        else if (m==4 || m==6 || m==9 || m==11){
            if (d>30){
                d = d-30;
                m++;
            }
        }

        String date = String.valueOf(d);
        String month = String.valueOf(m);
        String year = String.valueOf(y);

        ovulationDateTextView.setText(""+date+"/"+month+"/"+year);
    }

    public boolean ValidDate(){
        String yr = yearEditText.getText().toString();
        int y = Integer.parseInt(yr);
        int m = Integer.parseInt(monthEditText.getText().toString());
        int d = Integer.parseInt(dateEditText.getText().toString());

        if(yr.length()!=4)
            return false;

        if (m<1 || m>12)
            return false;

        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            if (d<1 || d>31)
                return false;
        }

        if (m==2){
            if (y%4==0 && y%100!=0 || y%400==0){
                if (d<1 || d>29)
                    return false;
            }
            else
            if (d<1 || d>28)
                return false;
        }

        if (m==4 || m==6 || m==9 || m==11)
            if (d<1 || d>30)
                return false;

        return true;
    }
}