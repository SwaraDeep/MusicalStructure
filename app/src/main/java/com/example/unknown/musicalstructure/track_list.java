package com.example.unknown.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class track_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

        RelativeLayout playbar = (RelativeLayout) findViewById(R.id.now_playing_bar);
        playbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(track_list.this, now_playing.class);
                startActivity(i);
            }
        });
    }
}