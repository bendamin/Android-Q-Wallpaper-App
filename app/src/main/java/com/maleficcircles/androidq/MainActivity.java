package com.maleficcircles.androidq;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static int clickedPic = R.drawable.pic1;

    ImageView image;
    int imageArray[] = {R.id.imageView1,R.id.imageView2,R.id.imageView3,R.id.imageView4,R.id.imageView5,R.id.imageView6,R.id.imageView7,R.id.imageView8,R.id.imageView9,R.id.imageView10,R.id.imageView11,R.id.imageView12,R.id.imageView13,R.id.imageView14,R.id.imageView15,R.id.imageView16,R.id.imageView17,R.id.imageView18,R.id.imageView19,R.id.imageView20,R.id.imageView21,R.id.imageView22,R.id.imageView23,R.id.imageView24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //loop through each imageView and display the picture
        int x = R.drawable.pic1;
        int counter = 1;
        for(int var : imageArray){
            switch (counter) {
                case 1: x = R.drawable.pic1;
                    break;
                case 2: x = R.drawable.pic2;
                    break;
                case 3: x = R.drawable.pic3;
                    break;
                case 4: x = R.drawable.pic4;
                    break;
                case 5: x = R.drawable.pic5;
                    break;
                case 6: x = R.drawable.pic6;
                    break;
                case 7: x = R.drawable.pic7;
                    break;
                case 8: x = R.drawable.pic8;
                    break;
                case 9: x = R.drawable.pic9;
                    break;
                case 10: x = R.drawable.pic10;
                    break;
                case 11: x = R.drawable.pic11;
                    break;
                case 12: x = R.drawable.pic12;
                    break;
                case 13: x = R.drawable.pic13;
                    break;
                case 14: x = R.drawable.pic14;
                    break;
                case 15: x = R.drawable.pic15;
                    break;
                case 16: x = R.drawable.pic16;
                    break;
                case 17: x = R.drawable.pic17;
                    break;
                case 18: x = R.drawable.pic18;
                    break;
                case 19: x = R.drawable.pic19;
                    break;
                case 20: x = R.drawable.pic20;
                    break;
                case 21: x = R.drawable.pic21;
                    break;
                case 22: x = R.drawable.pic22;
                    break;
                case 23: x = R.drawable.pic23;
                    break;
                case 24: x = R.drawable.pic24;
                    break;
                default: x = R.drawable.pic1;;
                    break;
            }

            image = (ImageView)findViewById(var);
            image.setImageResource(x);
            counter++;
        }

        //onClick Listeners for each image view

        /*






        Just adding white space for readability











         */

        ImageView pict1 = (ImageView)findViewById(R.id.imageView1);
        pict1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic1full;
                goWallpaper();
            }
        });

        ImageView pict2 = (ImageView)findViewById(R.id.imageView2);
        pict2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic2full;
                goWallpaper();
            }
        });

        ImageView pict3 = (ImageView)findViewById(R.id.imageView3);
        pict3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic3full;
                goWallpaper();
            }
        });

        ImageView pict4 = (ImageView)findViewById(R.id.imageView4);
        pict4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic4full;
                goWallpaper();
            }
        });

        ImageView pict5 = (ImageView)findViewById(R.id.imageView5);
        pict5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic5full;
                goWallpaper();
            }
        });

        ImageView pict6 = (ImageView)findViewById(R.id.imageView6);
        pict6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic6full;
                goWallpaper();
            }
        });

        ImageView pict7 = (ImageView)findViewById(R.id.imageView7);
        pict7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic7full;
                goWallpaper();
            }
        });

        ImageView pict8 = (ImageView)findViewById(R.id.imageView8);
        pict8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic8full;
                goWallpaper();
            }
        });

        ImageView pict9 = (ImageView)findViewById(R.id.imageView9);
        pict9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic9full;
                goWallpaper();
            }
        });

        ImageView pict10 = (ImageView)findViewById(R.id.imageView10);
        pict10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic10full;
                goWallpaper();
            }
        });

        ImageView pict11 = (ImageView)findViewById(R.id.imageView11);
        pict11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic11full;
                goWallpaper();
            }
        });

        ImageView pict12 = (ImageView)findViewById(R.id.imageView12);
        pict12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic12full;
                goWallpaper();
            }
        });

        ImageView pict13 = (ImageView)findViewById(R.id.imageView13);
        pict13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic13full;
                goWallpaper();
            }
        });

        ImageView pict14 = (ImageView)findViewById(R.id.imageView14);
        pict14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic14full;
                goWallpaper();
            }
        });

        ImageView pict15 = (ImageView)findViewById(R.id.imageView15);
        pict15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic15full;
                goWallpaper();
            }
        });

        ImageView pict16 = (ImageView)findViewById(R.id.imageView16);
        pict16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic16full;
                goWallpaper();
            }
        });

        ImageView pict17 = (ImageView)findViewById(R.id.imageView17);
        pict17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic17full;
                goWallpaper();
            }
        });

        ImageView pict18 = (ImageView)findViewById(R.id.imageView18);
        pict18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic18full;
                goWallpaper();
            }
        });

        ImageView pict19 = (ImageView)findViewById(R.id.imageView19);
        pict19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic19full;
                goWallpaper();
            }
        });

        ImageView pict20 = (ImageView)findViewById(R.id.imageView20);
        pict20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic20full;
                goWallpaper();
            }
        });

        ImageView pict21 = (ImageView)findViewById(R.id.imageView21);
        pict21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic21full;
                goWallpaper();
            }
        });

        ImageView pict22 = (ImageView)findViewById(R.id.imageView22);
        pict22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic22full;
                goWallpaper();
            }
        });

        ImageView pict23 = (ImageView)findViewById(R.id.imageView23);
        pict23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic23full;
                goWallpaper();
            }
        });

        ImageView pict24 = (ImageView)findViewById(R.id.imageView24);
        pict24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedPic = R.drawable.pic24full;
                goWallpaper();
            }
        });

        /*






        Just adding white space for readability










         */


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Random Wallpaper Set", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                randomWall();

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            randomWall();
            Context context = getApplicationContext();
            CharSequence text = "Random Wallpaper Set";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.maleficcircles.androidq")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.maleficcircles.androidq")));
            }
        } else if (id == R.id.nav_gallery) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Malefic+Circles")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Malefic+Circles")));
            }

        } else if (id == R.id.nav_slideshow) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/bendamin/Android-Q-Wallpaper-App/")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.maleficcircles.androidq")));
            }

        } else if (id == R.id.nav_manage) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.maleficcircles.androidq")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.maleficcircles.androidq")));
            }
        } else if (id == R.id.nav_share) {
            try {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Android Q Wallpaper App");
                String shareMessage= "Check out this app!\n\n";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=com.maleficcircles.androidq\n\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "Choose an app"));
            } catch(Exception e) {
                //e.toString();
            }


        } else if (id == R.id.nav_send) {
            try {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("image/png");
                Uri uri = Uri.parse("android.resource://com.maleficcircles.androidq/" + clickedPic);
                shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Full resolution available at:\nhttps://play.google.com/store/apps/details?id=com.maleficcircles.androidq\n");
                startActivity(Intent.createChooser(shareIntent, "Send your image"));
            }catch (Exception e){
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("image/jpeg");
                Uri uri = Uri.parse("android.resource://com.maleficcircles.androidq/" + clickedPic);
                shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Full resolution available at:\nhttps://play.google.com/store/apps/details?id=com.maleficcircles.androidq\n");
                startActivity(Intent.createChooser(shareIntent, "Send your image"));
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void goWallpaper() {
        Intent intent = new Intent(this, Wallpaper.class);
        startActivity(intent);
    }

    public void randomWall() {
        Random r = new Random();
        int randomNum = r.nextInt(24 - 1) + 1;

        switch(randomNum){
            case 1: clickedPic = R.drawable.pic1full;
                break;
            case 2: clickedPic = R.drawable.pic2full;
                break;
            case 3: clickedPic = R.drawable.pic3full;
                break;
            case 4: clickedPic = R.drawable.pic4full;
                break;
            case 5: clickedPic = R.drawable.pic5full;
                break;
            case 6: clickedPic = R.drawable.pic6full;
                break;
            case 7: clickedPic = R.drawable.pic7full;
                break;
            case 8: clickedPic = R.drawable.pic8full;
                break;
            case 9: clickedPic = R.drawable.pic9full;
                break;
            case 10: clickedPic = R.drawable.pic10full;
                break;
            case 11: clickedPic = R.drawable.pic11full;
                break;
            case 12: clickedPic = R.drawable.pic12full;
                break;
            case 13: clickedPic = R.drawable.pic13full;
                break;
            case 14: clickedPic = R.drawable.pic14full;
                break;
            case 15: clickedPic = R.drawable.pic15full;
                break;
            case 16: clickedPic = R.drawable.pic16full;
                break;
            case 17: clickedPic = R.drawable.pic17full;
                break;
            case 18: clickedPic = R.drawable.pic18full;
                break;
            case 19: clickedPic = R.drawable.pic19full;
                break;
            case 20: clickedPic = R.drawable.pic20full;
                break;
            case 21: clickedPic = R.drawable.pic21full;
                break;
            case 22: clickedPic = R.drawable.pic22full;
                break;
            case 23: clickedPic = R.drawable.pic23full;
                break;
            case 24: clickedPic = R.drawable.pic24full;
                break;
            default: clickedPic = R.drawable.pic1full;;
                break;
        }

        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(clickedPic);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
