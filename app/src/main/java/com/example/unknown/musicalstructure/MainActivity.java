package com.example.unknown.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tracks = (TextView) findViewById(R.id.tracks);
        final TextView artist = (TextView) findViewById(R.id.artist);
        final TextView album = (TextView) findViewById(R.id.albums);
        final TextView nowplaying = (TextView) findViewById(R.id.nowplaying);
        final RelativeLayout nowPlaying = (RelativeLayout) findViewById(R.id.now_playing_bar);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trackList = new Intent(MainActivity.this, track_list.class);
                startActivity(trackList);
            }
        });

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trackList = new Intent(MainActivity.this, album_list.class);
                startActivity(trackList);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MainActivity.this, now_playing.class);
                startActivity(nowPlaying);
            }
        });

        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MainActivity.this, now_playing.class);
                startActivity(nowPlaying);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MainActivity.this, artist_name.class);
                startActivity(nowPlaying);
            }
        });
    }
}
