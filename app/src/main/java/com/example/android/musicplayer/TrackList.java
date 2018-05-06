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

        tracks.add(new TrackInfo("The Greatest Show", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("A Million Dreams", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("A Million Dreams (Reprise)", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("Come Alive","Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("The Other Side", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("Never Enough", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("This Is Me", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("Rewrite the Stars", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("Tightrope", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("Never Enough (Reprise)", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("From Now On", "Motion Picture Cast Recording", "The Greatest Showman"));
        tracks.add(new TrackInfo("Pretty Shining People", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Don't Matter Now", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Get Away", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Shotgun", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Paradise", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("All My Love", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Sugarcoat", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Hold My Girl", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Saviour", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Only a Human", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("The Beautiful Dream", "George Ezra", "Staying At Tamara's"));
        tracks.add(new TrackInfo("Call Out My Name", "The Weekend", "My Dear Melancholy"));
        tracks.add(new TrackInfo("Try Me", "The Weekend", "My Dear Melancholy"));
        tracks.add(new TrackInfo("Wasted Times", "The Weekend", "My Dear Melancholy"));
        tracks.add(new TrackInfo("I Was Never There", "The Weekend", "My Dear Melancholy"));
        tracks.add(new TrackInfo("Hurt You", "The Weekend", "My Dear Melancholy"));
        tracks.add(new TrackInfo("Privilege", "The Weekend", "My Dear Melancholy"));
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
