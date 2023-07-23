package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {
    TextView headingTextView, informationTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        headingTextView = (TextView) findViewById(R.id.headingTextView);
        informationTextView = (TextView) findViewById(R.id.informationTextView);
        String heading = getIntent().getStringExtra("heading");
        String information = getIntent().getStringExtra("information");
        headingTextView.setText(heading);
        informationTextView.setText(information);

    }
}