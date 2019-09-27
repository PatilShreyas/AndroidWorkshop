package com.shreyaspatil.firefast.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showButton;
    EditText editTextName;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link UI from resource
        editTextName = findViewById(R.id.editText_name);
        showButton = findViewById(R.id.button_show);
        textResult = findViewById(R.id.textView_result);

        // Handle button click
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get name entered by user and store it in variable name
                String name = editTextName.getText().toString();

                // Concatenate name with starting Welcome
                String message = "Welcome " + name;

                // Set text message to Result TextView
                textResult.setText(message);

                // Show Toast
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
