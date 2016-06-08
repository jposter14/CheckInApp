package com.example.jackieposter.checkinapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * Created by jackieposter on 6/7/16.
 */
public class SlackReceiver extends BroadcastReceiver {

    public static final String TAG =SlackReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    URL url = new URL("https://hooks.slack.com/services/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");
                    final MediaType formType = MediaType.parse("application/json");

                    OkHttpClient client = new OkHttpClient();
                    SlackText text = new SlackText("I'm here!");
                    Gson gson = new Gson();
                    String textJson = gson.toJson(text, SlackText.class);
                    RequestBody body = RequestBody.create(formType, textJson.getBytes());

                    Request request = new Request.Builder()
                            .url(url)
                            .post(body)
                            .build();

                    Response response = client.newCall(request).execute();

                    Log.d(TAG, response.body().string());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        );
        thread.start();
        Toast.makeText(context, "Posted to Slack", Toast.LENGTH_LONG).show();

    }


}
