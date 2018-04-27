package com.example.android.musicplayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<AlbumInfo> {

    public AlbumAdapter(Activity context, ArrayList<AlbumInfo> tracks) {
        super(context, 0, tracks);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list_item, parent, false);
        }
        AlbumInfo currentTrack= getItem(position);

        TextView artistTextView = listItemView.findViewById(R.id.artist);
        artistTextView.setText(currentTrack.getArtistName());

        TextView albumTextView = listItemView.findViewById(R.id.album);

        albumTextView.setText(currentTrack.getAlbumName());

        return listItemView;
    }
}
