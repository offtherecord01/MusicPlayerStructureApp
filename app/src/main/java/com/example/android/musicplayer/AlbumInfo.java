package com.example.android.musicplayer;

public class AlbumInfo {

    private String mArtistName;

    private String mAlbumName;


    public AlbumInfo(String artistName, int albumName) {
        mArtistName = artistName;
        mAlbumName = albumName;
}

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }
}
