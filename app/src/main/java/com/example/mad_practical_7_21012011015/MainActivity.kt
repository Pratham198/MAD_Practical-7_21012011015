package com.example.mad_practical_7_21012011015

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.mad_practical_7_21012011015.R.id.video
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView: VideoView = findViewById(R.id.video)
        val mediaController = MediaController(this)
        val uri:Uri=Uri.parse("android.resource://" + packageName + "/" +R.raw.thestoryoflight)

        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton1)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply {startActivity(this)  }
        }
    }

}