package com.example.android.musicplayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<ArtistInfo> {

    public ArtistAdapter(Activity context, ArrayList<ArtistInfo> tracks) {
        super(context, 0, tracks);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list_item, parent, false);
        }
        ArtistInfo currentTrack = getItem(position);

        TextView albumTextView = listItemView.findViewById(R.id.artist);

        albumTextView.setText(currentTrack.getArtistName());

        return listItemView;
    }
}
