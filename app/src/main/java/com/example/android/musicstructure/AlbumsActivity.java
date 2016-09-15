package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity implements View.OnClickListener {
    Button mShowAlbums, mShowArtists, mShowSongs, mShowPlayLists, mShowHomeScreen;
    Intent intent;
    TextView mActivityDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        mActivityDescription = (TextView) findViewById(R.id.activity_description);
        mShowAlbums = (Button) findViewById(R.id.show_albums);
        mShowArtists = (Button) findViewById(R.id.show_artists);
        mShowSongs = (Button) findViewById(R.id.show_songs);
        mShowPlayLists = (Button) findViewById(R.id.show_play_lists);
        mShowHomeScreen = (Button) findViewById(R.id.main_screen);
        mActivityDescription.setText("This activity displays the different song Albums and requires the API described" +
                " in MediaStore class i.e. android.provider.MediaStore");
        mShowAlbums.setOnClickListener(this);
        mShowArtists.setOnClickListener(this);
        mShowSongs.setOnClickListener(this);
        mShowPlayLists.setOnClickListener(this);
        mShowHomeScreen.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_albums:
                intent = new Intent(AlbumsActivity.this, AlbumsActivity.class);
                break;
            case R.id.show_artists:
                intent = new Intent(AlbumsActivity.this, ArtistActivity.class);
                break;
            case R.id.show_songs:
                intent = new Intent(AlbumsActivity.this, SongActivity.class);
                break;
            case R.id.show_play_lists:
                intent = new Intent(AlbumsActivity.this, ActivityPlayList.class);
                break;
            case R.id.main_screen:
                intent = new Intent(AlbumsActivity.this, MainActivity.class);
        }
        startActivity(intent);
    }
}
