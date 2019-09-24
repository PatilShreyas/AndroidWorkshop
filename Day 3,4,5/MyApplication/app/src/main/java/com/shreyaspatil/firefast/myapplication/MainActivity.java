package com.shreyaspatil.firefast.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int x;
    private int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangePic = findViewById(R.id.button);
        final ImageView image = findViewById(R.id.imageView);

        btnChangePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.gdgx);
            }
        });
    }
/*
    public void showToast(View view) {
        Toast.makeText(this,
                "Button is Clicked!",
                Toast.LENGTH_LONG).show();
    }

 */
}
