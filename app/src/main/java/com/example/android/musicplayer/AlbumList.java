package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<AlbumInfo> albums = new ArrayList<>();

        albums.add(new AlbumInfo(getString(R.string.mpcr), getString(R.string.tgs)));
        albums.add(new AlbumInfo(getString(R.string.ge), getString(R.string.sat)));
        albums.add(new AlbumInfo(getString(R.string.tw), getString(R.string.mdm)));

        AlbumAdapter adapter =
                new AlbumAdapter(this, albums);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
