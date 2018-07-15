package com.example.unknown.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class album_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<song> tracks = new ArrayList<>();
        tracks.add(new song("Track 1"));
        tracks.add(new song("Track 2"));
        tracks.add(new song("Track 3"));
        tracks.add(new song("Track 4"));
        tracks.add(new song("Track 5"));
        tracks.add(new song("Track 6"));
        tracks.add(new song("Track 7"));
        tracks.add(new song("Track 8"));
        tracks.add(new song("Track 9"));
        tracks.add(new song("Track 10"));

        customAdapter adapter = new customAdapter(this, tracks);
        ListView songList = (ListView)findViewById(R.id.list);
        songList.setAdapter(adapter);
    }
}