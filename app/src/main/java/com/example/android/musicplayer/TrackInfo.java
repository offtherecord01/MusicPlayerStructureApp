package com.example.android.musicplayer;

public class TrackInfo {

    private String mSongName;

    private String mArtistName;

    private String mAlbumName;


    public TrackInfo(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
}
    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }
}
