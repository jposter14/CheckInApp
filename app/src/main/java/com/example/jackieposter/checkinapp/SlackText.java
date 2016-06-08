package com.example.jackieposter.checkinapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jackieposter on 6/8/16.
 */
public class SlackText {
    @SerializedName("text")
    private String text;

    public SlackText(String text) {
        this.text = text;
    }
}
