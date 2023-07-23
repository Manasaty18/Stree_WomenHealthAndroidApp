package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
    String EmailHolder;
    TextView Email;
    Button LogOUT ;
    ImageView exercisesButton, fetalButton, nutritionButton, yogaButton;
    ImageView mensturationTrackerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Email = (TextView)findViewById(R.id.welcomeTextView);
        LogOUT = (Button)findViewById(R.id.logOutButton);
        mensturationTrackerButton = (ImageView) findViewById(R.id.mensturationTrackerButton);
        exercisesButton = (ImageView) findViewById(R.id.exercisesButton);
        yogaButton = (ImageView) findViewById(R.id.yogaButton);
        nutritionButton = (ImageView) findViewById(R.id.nutritionButton);
        fetalButton = (ImageView) findViewById(R.id.babyGrowthButton);

        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(LoginActivity.UserEmail);
        Email.setText(Email.getText().toString()+ EmailHolder);
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(DashboardActivity.this,"Log Out Successful", Toast.LENGTH_LONG).show();
            }
        });

        mensturationTrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MensturationTrackerActivity.class);
                startActivity(intent);
            }
        });

        exercisesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, ExercisesActivity.class);
                startActivity(intent);
            }
        });

        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (DashboardActivity.this, YogaActivity.class);
                startActivity(intent);
            }
        });

        nutritionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (DashboardActivity.this, NutritionActivity.class);
                startActivity(intent);
            }
        });

        fetalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (DashboardActivity.this, FetalDevelopmentActivity.class);
                startActivity(intent);
            }
        });
    }
}