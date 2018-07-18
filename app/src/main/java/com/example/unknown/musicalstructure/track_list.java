package com.example.unknown.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class track_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<song> tracks = new ArrayList<>();
        tracks.add(new song("Track 1", "artist 1"));
        tracks.add(new song("Track 2", "artist 2"));
        tracks.add(new song("Track 3", "artist 3"));
        tracks.add(new song("Track 4", "artist 4"));
        tracks.add(new song("Track 5", "artist 5"));
        tracks.add(new song("Track 6", "artist 6"));
        tracks.add(new song("Track 7", "artist 7"));
        tracks.add(new song("Track 8", "artist 8"));
        tracks.add(new song("Track 9", "artist 9"));
        tracks.add(new song("Track 10", "artist 10"));
        customAdapter adapter = new customAdapter(this, tracks);
        ListView songList = (ListView) findViewById(R.id.list);
        songList.setAdapter(adapter);
    }
}