package com.example.sans.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button streamer,scores,library,build,xyz,capstone;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        streamer=(Button)findViewById(R.id.streamer);
        scores= (Button)findViewById(R.id.scores);
        library= (Button)findViewById(R.id.library);
        build= (Button)findViewById(R.id.build);
        xyz= (Button)findViewById(R.id.xyz);
        capstone= (Button)findViewById(R.id.capstone);
        txt= (TextView)findViewById(R.id.txt);
    }

    public void displayToastStreamer(View v){
        Toast.makeText(getApplicationContext(), "This button launches the Spotify Streamer APP", Toast.LENGTH_LONG).show();

    }
    public void displayToastScores(View v){
        Toast.makeText(getApplicationContext(), "This button launches the Scores APP", Toast.LENGTH_LONG).show();
    }
    public void displayToastLibrary(View v){
        Toast.makeText(getApplicationContext(), "This button launches the Library APP", Toast.LENGTH_LONG).show();
    }
    public void displayToastBuild(View v){
        Toast.makeText(getApplicationContext(), "This button launches the Build It Bigger APP", Toast.LENGTH_LONG).show();
    }
    public void displayToastXYZ(View v){
        Toast.makeText(getApplicationContext(), "This button launches the XYZ APP", Toast.LENGTH_LONG).show();
    }
    public void displayToastCapstone(View v){
        Toast.makeText(getApplicationContext(), "This button launches the Capstone APP", Toast.LENGTH_LONG).show();
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
}
