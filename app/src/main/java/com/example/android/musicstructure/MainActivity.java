package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mAlbums, mArtists, mSongs, mPlayLists;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAlbums = (Button) findViewById(R.id.albums);
        mArtists = (Button) findViewById(R.id.artists);
        mSongs = (Button) findViewById(R.id.songs);
        mPlayLists = (Button) findViewById(R.id.play_lists);
        mAlbums.setOnClickListener(this);
        mArtists.setOnClickListener(this);
        mSongs.setOnClickListener(this);
        mPlayLists.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.albums:
                intent = new Intent(MainActivity.this, AlbumsActivity.class);
                break;
            case R.id.artists:
                intent = new Intent(MainActivity.this, ArtistActivity.class);
                break;
            case R.id.songs:
                intent = new Intent(MainActivity.this, SongActivity.class);
                break;
            case R.id.play_lists:
                intent = new Intent(MainActivity.this, ActivityPlayList.class);
        }
        startActivity(intent);
    }
}
