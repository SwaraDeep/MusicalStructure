package com.example.unknown.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class artist_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
        RelativeLayout playbar = (RelativeLayout) findViewById(R.id.now_playing_bar);
        playbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(artist_name.this, now_playing.class);
                startActivity(i);
            }
        });
    }
}