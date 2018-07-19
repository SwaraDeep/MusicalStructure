package com.example.unknown.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class now_playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
