package com.example.unknown.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter<song> {

    public customAdapter(Context context, ArrayList<song> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        song song = getItem(position);
        TextView track = (TextView) listItemView.findViewById(R.id.song_name);
        track.setText(song.getName());
        TextView artist = (TextView) listItemView.findViewById(R.id.artist_name);
        artist.setText(song.getArtistName());
        return listItemView;
    }
}
