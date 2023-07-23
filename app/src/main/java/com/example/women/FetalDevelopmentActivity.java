package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class FetalDevelopmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void first(View view) {
        setContentView(R.layout.activity_first);
    }

    public void second(View view) {
        setContentView(R.layout.activity_second);
    }

    public void third(View view) {
        setContentView(R.layout.activity_third);
    }
}