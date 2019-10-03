package com.dypcoe.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link from resource
        etName = findViewById(R.id.editTextName);
    }

    public void goToAnotherActivity(View view) {
        // Obtain text written in EditText
        String name = etName.getText().toString();

        // Create Intent
        Intent i = new Intent(MainActivity.this, SecondActivity.class);

        // Set Parameter to intent
        i.putExtra("name", name);
        startActivity(i);
    }
}
