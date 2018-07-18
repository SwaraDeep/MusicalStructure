package com.example.unknown.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class album_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_grid_view);
        ArrayList<song> tracks = new ArrayList<>();
        tracks.add(new song("Album 1"));
        tracks.add(new song("Album 2"));
        tracks.add(new song("Album 3"));
        tracks.add(new song("Album 4"));
        tracks.add(new song("Album 5"));
        tracks.add(new song("Album 6"));
        tracks.add(new song("Album 7"));
        tracks.add(new song("Album 8"));
        tracks.add(new song("Album 9"));
        tracks.add(new song("Album 10"));
        customAdapter adapter = new customAdapter(this, tracks);
        GridView songList = (GridView) findViewById(R.id.albumsGridView);
        songList.setAdapter(adapter);
    }
}