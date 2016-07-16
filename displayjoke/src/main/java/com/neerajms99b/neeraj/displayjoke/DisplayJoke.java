package com.neerajms99b.neeraj.displayjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();
        mJoke = intent.getExtras().getString(getString(R.string.key_joke));
        TextView jokeTextView = (TextView) findViewById(R.id.joke_textview);
        jokeTextView.setText(mJoke);
    }
}
