package com.wordpress.electron0zero.jokelib_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disply_joke_activity);

        TextView jokeview = (TextView) findViewById(R.id.joke_text);

        String joke = null;
        Intent intent = getIntent();
        joke = intent.getStringExtra(DisplayJokeActivity.JOKE_KEY);

        if (joke != null){
            jokeview.setText(joke);
        }else {
            jokeview.setText("your joke dealer failed to deliver a joke");
        }
    }
}
