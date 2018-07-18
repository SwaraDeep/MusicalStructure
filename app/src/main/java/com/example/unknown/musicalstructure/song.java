package com.example.unknown.musicalstructure;

public class song {
    private String trackName;
    private String artistName;

    public song(String track, String artist) {
        trackName = track;
        artistName = artist;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getName() {
        return trackName;
    }
}
