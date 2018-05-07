package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Intent intent = getIntent();
        TrackInfo trackinfo = intent.getParcelableExtra("track");

        String line1 = trackinfo.getSongName();
        String line2 = trackinfo.getArtistName();
        String line3 = trackinfo.getAlbumName();

        TextView textView1 = findViewById(R.id.trackName);
        textView1.setText(line1);
        TextView textView2 = findViewById(R.id.artistName);
        textView2.setText(line2);
        TextView textView3 = findViewById(R.id.albumName);
        textView3.setText(line3);

    }
}
