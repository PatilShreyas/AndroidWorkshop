package com.dypcoe.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textViewResult);

        // Get Intent
        Intent i = getIntent();

        // Obtain string name from intent
        String name = i.getStringExtra("name");

        // Set name to TextView
        textView.setText("Welcome " + name);
    }
}
