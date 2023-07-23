package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExercisesActivity extends AppCompatActivity {
    Button periodReliefButton;
    Button neckAndShoulderButton;
    Button lowerBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        periodReliefButton = (Button) findViewById(R.id.periodReliefButton);
        neckAndShoulderButton = (Button) findViewById(R.id.neckAndShoulderButton);
        lowerBackButton = (Button) findViewById(R.id.lowerBackButton);

        periodReliefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExercisesActivity.this, PeriodWorkoutActivity.class );
                startActivity(intent);
            }
        });

        neckAndShoulderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExercisesActivity.this, NeckWorkoutActivity.class );
                startActivity(intent);
            }
        });

        lowerBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExercisesActivity.this, LowerBackWorkoutActivity.class );
                startActivity(intent);
            }
        });
    }
}