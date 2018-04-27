package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<AlbumInfo> artists = new ArrayList<>();

        artists.add(new AlbumInfo("Motion Picture Cast Recording", "The Greatest Showman"));
        artists.add(new AlbumInfo("George Ezra", "Staying At Tamara's"));
        artists.add(new AlbumInfo("The Weekend", "My Dear Melancholy"));


        ArtistAdapter adapter =
                new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
