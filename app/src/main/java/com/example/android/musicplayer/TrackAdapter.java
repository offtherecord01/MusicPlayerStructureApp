package com.example.android.musicplayer;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<TrackInfo> {

    public TrackAdapter(Activity context, ArrayList<TrackInfo> tracks) {
        super(context, 0, tracks);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_list_item, parent, false);
        }
        TrackInfo currentTrack= getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.Song);
        songTextView.setText(currentTrack.getSongName());

        TextView artistTextView = listItemView.findViewById(R.id.artist);
        artistTextView.setText(currentTrack.getArtistName());

        TextView albumTextView = listItemView.findViewById(R.id.album);

        albumTextView.setText(currentTrack.getAlbumName());

        return listItemView;
    }
}
