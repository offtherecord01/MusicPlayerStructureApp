package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<AlbumInfo> albums = new ArrayList<>();

        albums.add(new AlbumInfo("Motion Picture Cast Recording", "The Greatest Showman"));
        albums.add(new AlbumInfo("George Ezra", "Staying At Tamara's"));
        albums.add(new AlbumInfo("The Weekend", "My Dear Melancholy"));

        AlbumAdapter adapter =
                new AlbumAdapter(this, albums);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AlbumList.this, ArtistList.class);
                startActivity(i);
            }
        });
    }
}