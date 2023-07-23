package com.example.women;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

public class NeckWorkoutActivity extends AppCompatActivity {
    private SurfaceView N1sv,N2sv,N3sv,N4sv,N6N7sv,N8sv;
    private MediaPlayer m1,m2,m3,m4,m6m7,m8;
    private SurfaceHolder s1,s2,s3,s4,s6s7,s8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neck_workout);
        //1st video
        N1sv=findViewById(R.id.N1sv);
        m1=MediaPlayer.create(this,R.raw.n1);
        N1sv.setKeepScreenOn(true);
        s1 = N1sv.getHolder();
        s1.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                m1.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        });
        m1.start();

        N1sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m1.isPlaying())
                    m1.pause();
                else
                    m1.start();
            }
        });

        //2nd video
        N2sv=findViewById(R.id.N2sv);
        m2=MediaPlayer.create(this,R.raw.n2);
        N2sv.setKeepScreenOn(true);
        s2 = N2sv.getHolder();
        s2.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                m2.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        });
        m2.start();

        N2sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m2.isPlaying())
                    m2.pause();
                else
                    m2.start();
            }
        });

        //3rd video
        N3sv=findViewById(R.id.N3sv);
        m3=MediaPlayer.create(this,R.raw.n3);
        N3sv.setKeepScreenOn(true);
        s3 = N3sv.getHolder();
        s3.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                m3.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        });
        m3.start();
        N3sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m3.isPlaying())
                    m3.pause();
                else
                    m3.start();
            }
        });

        //4th video
        N4sv=findViewById(R.id.N4sv);
        m4=MediaPlayer.create(this,R.raw.n4);
        N4sv.setKeepScreenOn(true);
        s4 = N4sv.getHolder();
        s4.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                m4.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        });
        m4.start();

        N4sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m4.isPlaying())
                    m4.pause();
                else
                    m4.start();
            }
        });

        //5th video
        N6N7sv=findViewById(R.id.N6N7sv);
        m6m7=MediaPlayer.create(this,R.raw.n6n7);
        N6N7sv.setKeepScreenOn(true);
        s6s7 = N6N7sv.getHolder();
        s6s7.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                m6m7.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        });
        m6m7.start();

        N6N7sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m6m7.isPlaying())
                    m6m7.pause();
                else
                    m6m7.start();
            }
        });

        //6th video

        N8sv=findViewById(R.id.N8sv);
        m8=MediaPlayer.create(this,R.raw.n8);
        N8sv.setKeepScreenOn(true);
        s8 = N8sv.getHolder();
        s8.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                m8.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        });
        m8.start();

        N8sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m8.isPlaying())
                    m8.pause();
                else
                    m8.start();
            }
        });
    }
}