package com.example.jackieposter.checkinapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Retrofit;


/**
 * Created by jackieposter on 6/7/16.
 */
public class slackReceiver extends BroadcastReceiver {

    public static final String TAG = LocationService.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {


        String url = "https://hooks.slack.com/services/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";


    }


        Toast.makeText(context, "Gonna post to slack.", Toast.LENGTH_LONG).show();

        Log.d(TAG, "In slack Activity");


    }


}
