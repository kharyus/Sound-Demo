package com.example.sounddemo

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val punch = MediaPlayer.create(this, R.raw.punch)
        val camera = MediaPlayer.create(this, R.raw.camera)

        val btnPunch: Button = findViewById(R.id.btnPunch)
        val btnCamera: Button = findViewById(R.id.btnCamera)

        btnPunch.setOnClickListener { punch.start() }

        btnCamera.setOnClickListener { camera.start() }
    }
}
