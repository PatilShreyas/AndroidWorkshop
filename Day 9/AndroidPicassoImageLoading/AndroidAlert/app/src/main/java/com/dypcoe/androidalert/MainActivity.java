package com.dypcoe.androidalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    String imageUrl = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/nature-quote-1-1557339424.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link View from resources
        iv = findViewById(R.id.imageView);

        // Load image from imageUrl and set it into ImageView iv.
        Picasso.get().load(imageUrl).into(iv);
    }


}
