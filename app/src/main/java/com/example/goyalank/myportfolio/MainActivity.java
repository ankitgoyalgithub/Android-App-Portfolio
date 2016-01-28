package com.example.goyalank.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyStreamer = (Button) findViewById(R.id.but_spotify);
        Button scoresApp       = (Button) findViewById(R.id.but_score);
        Button libraryApp      = (Button) findViewById(R.id.but_lib);
        Button buildItBigger   = (Button) findViewById(R.id.but_bigger);
        Button xyzReader       = (Button) findViewById(R.id.but_reader);
        Button capstone        = (Button) findViewById(R.id.but_capstone);

        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View clickedView) {
        Button clickedButton = (Button)clickedView;
        Context context = getApplicationContext();
        int displayTime = Toast.LENGTH_LONG;
        String toastText = "This is link to " + clickedButton.getText().toString() +" App";
        Toast toast = Toast.makeText(context, toastText, displayTime);
        toast.show();
    }
}
