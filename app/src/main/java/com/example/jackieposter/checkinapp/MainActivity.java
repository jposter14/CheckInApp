package com.example.jackieposter.checkinapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Intent locationIntent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startServ(View view){
        locationIntent = new Intent(this, LocationService.class);
        startService(locationIntent);
        Toast.makeText(this, "Service Started.", Toast.LENGTH_LONG).show();

    }

    public void stopServ(View view) {
        stopService(locationIntent);
        Toast.makeText(this, "Service Stopped.", Toast.LENGTH_LONG).show();
    }

}
