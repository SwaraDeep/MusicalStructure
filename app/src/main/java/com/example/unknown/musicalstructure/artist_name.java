package com.example.unknown.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class artist_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<song> tracks = new ArrayList<>();
        tracks.add(new song("Artist 1", "4 tracks"));
        tracks.add(new song("Artist 2", "5 tracks"));
        tracks.add(new song("Artist 3", "3 tracks"));
        tracks.add(new song("Artist 4", "8 tracks"));
        tracks.add(new song("Artist 5", "10 tracks"));
        tracks.add(new song("Artist 6", "1 track"));
        tracks.add(new song("Artist 7", "4 tracks"));
        tracks.add(new song("Artist 8", "5 tracks"));
        tracks.add(new song("Artist 9", "8 tracks"));
        tracks.add(new song("Artist 10", "9 tracks"));
        customAdapter adapter = new customAdapter(this, tracks);
        ListView songList = (ListView) findViewById(R.id.list);
        songList.setAdapter(adapter);
    }
}