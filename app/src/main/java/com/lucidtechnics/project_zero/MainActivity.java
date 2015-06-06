package com.lucidtechnics.project_zero;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    private Toast startToast(String message) {

        System.out.println("Toast Start");

        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        return toast;


    }

    public void startSpotifyStreamer(View view) {
        // Do something in response to button click
        System.out.println("Spotify");
        Toast toast = startToast("Starting Spotify Streamer");

        toast.show();
    }

    public void startScores(View view) {
        // Do something in response to button click
        System.out.println("Scores App");

        Toast toast = startToast("Starting Scores App");
        toast.show();

    }

    public void startLibrary(View view) {
        // Do something in response to button click
        System.out.println("Start Library");

        Toast toast = startToast("Starting Library App");

        toast.show();

    }

    public void startBuilder(View view) {
        // Do something in response to button click
        System.out.println("Start Builder");

        Toast toast = startToast("Starting Builder");

        toast.show();

    }

    public void startReader(View view) {
        // Do something in response to button click
        System.out.println("Start Reader");

        Toast toast = startToast("Starting Reader App");

        toast.show();

    }

    public void startCapstone(View view) {
        // Do something in response to button click
        System.out.println("Start Capstone");

        Toast toast = startToast("Starting Capstone");

        toast.show();

    }
}
