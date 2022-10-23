package com.example.videoplayerdemo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaController = new MediaController(this);
        videoView = findViewById(R.id.videoView);
        mediaController.setAnchorView(videoView);
        Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.myvideo);
        videoView.setVideoURI(localUri);
        videoView.setMediaController(mediaController);
        videoView.start();
        
    }
}