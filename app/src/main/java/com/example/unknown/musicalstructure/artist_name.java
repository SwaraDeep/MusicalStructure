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
        tracks.add(new song("Artist 1"));
        tracks.add(new song("Artist 2"));
        tracks.add(new song("Artist 3"));
        tracks.add(new song("Artist 4"));
        tracks.add(new song("Artist 5"));
        tracks.add(new song("Artist 6"));
        tracks.add(new song("Artist 7"));
        tracks.add(new song("Artist 8"));
        tracks.add(new song("Artist 9"));
        tracks.add(new song("Artist 10"));

        customAdapter adapter = new customAdapter(this, tracks);
        ListView songList = (ListView) findViewById(R.id.list);
        songList.setAdapter(adapter);
    }
}