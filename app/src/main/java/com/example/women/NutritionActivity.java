package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class NutritionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
    }

    public void breakfast(View view) {
        setContentView(R.layout.activity_breakfast);
    }

    public void lunch(View view) {
        setContentView(R.layout.activity_lunch);
    }

    public void dinner(View view) {
        setContentView(R.layout.activity_dinner);
    }
}