package com.example.sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPunch;
    Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer punch = MediaPlayer.create(this, R.raw.punch);
        final MediaPlayer camera = MediaPlayer.create(this, R.raw.camera);

        btnPunch = findViewById(R.id.btnPunch);
        btnCamera = findViewById(R.id.btnCamera);

        btnPunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                punch.start();
            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camera.start();
            }
        });
    }
}
