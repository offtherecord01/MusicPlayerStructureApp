package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TrackList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<TrackInfo> tracks = new ArrayList<>();

        tracks.add(new TrackInfo("The Greatest Show", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("A Million Dreams", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("A Million Dreams (Reprise)", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("Come Alive", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("The Other Side", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("Never Enough", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("This Is Me", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("Rewrite the Stars", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("Tightrope", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("Never Enough (Reprise)", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("From Now On", getString(R.string.mpcr), getString(R.string.tgs)));
        tracks.add(new TrackInfo("Pretty Shining People", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Don't Matter Now", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Get Away", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Shotgun", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Paradise", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("All My Love", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Sugarcoat", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Hold My Girl", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Saviour", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Only a Human", getString(R.string.ge), getString(R.string.sat)));
        tracks.add(new TrackInfo("Call Out My Name", getString(R.string.tw), getString(R.string.mdm)));
        tracks.add(new TrackInfo("Try Me", getString(R.string.tw), getString(R.string.mdm)));
        tracks.add(new TrackInfo("Wasted Times", getString(R.string.tw), getString(R.string.mdm)));
        tracks.add(new TrackInfo("I Was Never There", getString(R.string.tw), getString(R.string.mdm)));
        tracks.add(new TrackInfo("Hurt You", getString(R.string.tw), getString(R.string.mdm)));
        tracks.add(new TrackInfo("Privilege", getString(R.string.tw), getString(R.string.mdm)));
        TrackAdapter adapter =
                new TrackAdapter(this, tracks);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(TrackList.this, NowPlaying.class);
                i.putExtra("track", tracks.get(position));
                startActivity(i);
            }
        });
    }
}
