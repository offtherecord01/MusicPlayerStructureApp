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

        ArrayList<ArtistInfo> artists = new ArrayList<>();

        artists.add(new ArtistInfo(getString(R.string.mpcr)));
        artists.add(new ArtistInfo(getString(R.string.ge)));
        artists.add(new ArtistInfo(getString(R.string.tw)));


        ArtistAdapter adapter =
                new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
