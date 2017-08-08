package com.example.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String ARGUMENT_JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getExtras().getString(ARGUMENT_JOKE_KEY);

        ((TextView) findViewById(R.id.tv_joke)).setText(joke);
    }
}
