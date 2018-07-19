package com.example.unknown.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class album_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_grid_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<song> tracks = new ArrayList<>();
        tracks.add(new song("Album 1", "6 tracks"));
        tracks.add(new song("Album 2", "4 tracks"));
        tracks.add(new song("Album 3", "2 tracks"));
        tracks.add(new song("Album 4", "5 tracks"));
        tracks.add(new song("Album 5", "6 tracks"));
        tracks.add(new song("Album 6", "8 tracks"));
        tracks.add(new song("Album 7", "12 tracks"));
        tracks.add(new song("Album 8", "5 tracks"));
        tracks.add(new song("Album 9", "6 tracks"));
        tracks.add(new song("Album 10", "7 tracks"));
        customAdapter adapter = new customAdapter(this, tracks);
        GridView songList = (GridView) findViewById(R.id.albumsGridView);
        songList.setAdapter(adapter);

        RelativeLayout nowplaying = (RelativeLayout) findViewById(R.id.now_playing_bar);

        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(album_list.this, now_playing.class);
                startActivity(nowPlaying);
            }
        });
    }
}