package com.shreyaspatil.firefast.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangePic = findViewById(R.id.button);
        final ImageView image = findViewById(R.id.imageView);

        btnChangePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x == 0) {
                    image.setImageResource(R.drawable.gdgx);
                    x = 1;
                } else {
                    image.setImageResource(R.drawable.google);
                    x = 0;
                }

                Toast.makeText(getApplicationContext(),
                        "Image Changed!",
                        Toast.LENGTH_SHORT).show();
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
