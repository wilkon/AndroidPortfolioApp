package com.example.android.myappportfolio;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    public void makeToast(View view) {
        switch (view.getId()) {
            case R.id.spotify_btn:
                Toast.makeText(getApplicationContext(),"This will execute my Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores_btn:
                Toast.makeText(getApplicationContext(),"This will execute my Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_app_btn:
                Toast.makeText(getApplicationContext(),"This will execute my Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_bigger_btn:
                Toast.makeText(getApplicationContext(),"This will execute my Build Bigger Aoo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz_btn:
                Toast.makeText(getApplicationContext(),"This will execute my XYZ Reader", Toast.LENGTH_SHORT).show();
            case R.id.capstone_btn:
                Toast.makeText(getApplicationContext(),"This will execute my Capstone App", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"Not Yet Programmed", Toast.LENGTH_SHORT).show();
        }
    }
}
