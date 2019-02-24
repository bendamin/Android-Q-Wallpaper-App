package com.maleficcircles.androidq;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;


public class Wallpaper extends AppCompatActivity {

    int currentPic = MainActivity.clickedPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView image;

        image = (ImageView)findViewById(R.id.wallpaperFull);
        image.setImageResource(currentPic);

        FloatingActionButton fab = findViewById(R.id.setWall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Wallpaper Set!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                setWall(currentPic);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setWall(int currentPic){
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(currentPic);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
