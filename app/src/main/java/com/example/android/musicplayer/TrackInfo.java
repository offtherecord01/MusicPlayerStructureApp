package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

public class TrackInfo implements Parcelable {

    private String mSongName;

    private String mArtistName;

    private String mAlbumName;


    public TrackInfo(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
}

    protected TrackInfo(Parcel in) {
        mSongName = in.readString();
        mArtistName = in.readString();
        mAlbumName = in.readString();
    }

    public static final Creator<TrackInfo> CREATOR = new Creator<TrackInfo>() {
        @Override
        public TrackInfo createFromParcel(Parcel in) {
            return new TrackInfo(in);
        }

        @Override
        public TrackInfo[] newArray(int size) {
            return new TrackInfo[size];
        }
    };

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mSongName);
        parcel.writeString(mArtistName);
        parcel.writeString(mAlbumName);
    }

}
