package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView allMusic = findViewById(R.id.allMusic);

        allMusic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent allIntent = new Intent(MainActivity.this, TrackList.class);
                startActivity(allIntent);
            }
        });
        TextView artistList = findViewById(R.id.artistList);


        artistList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistList.class);
                startActivity(artistIntent);
            }
        });
        TextView albumList = findViewById(R.id.albumList);


        albumList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumList.class);
                startActivity(albumIntent);
            }
        });
    }
}
