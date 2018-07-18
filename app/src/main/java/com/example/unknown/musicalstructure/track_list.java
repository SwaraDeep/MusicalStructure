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
        tracks.add(new song("Track 1", "artist"));
        tracks.add(new song("Track 2", "artist"));
        tracks.add(new song("Track 3", "artist"));
        tracks.add(new song("Track 4", "artist"));
        tracks.add(new song("Track 5", "artist"));
        tracks.add(new song("Track 6", "artist"));
        tracks.add(new song("Track 7", "artist"));
        tracks.add(new song("Track 8", "artist"));
        tracks.add(new song("Track 9", "artist"));
        tracks.add(new song("Track 10", "artist"));
        customAdapter adapter = new customAdapter(this, tracks);
        ListView songList = (ListView) findViewById(R.id.list);
        songList.setAdapter(adapter);
    }
}