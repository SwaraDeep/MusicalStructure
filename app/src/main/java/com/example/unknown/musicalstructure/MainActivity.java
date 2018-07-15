package com.example.unknown.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tracks = (TextView)findViewById(R.id.tracks);
        final TextView artist = (TextView)findViewById(R.id.artist);
        final TextView album = (TextView)findViewById(R.id.albums);
        final TextView playList = (TextView)findViewById(R.id.playList);

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
    }
}
