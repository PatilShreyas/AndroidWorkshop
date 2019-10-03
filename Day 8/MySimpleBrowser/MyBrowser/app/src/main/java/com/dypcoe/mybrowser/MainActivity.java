package com.dypcoe.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link WebView from resource
        wv = findViewById(R.id.webView);

        // Load URL into WebView
        wv.loadUrl("https://google.com");

        wv.setWebViewClient(new WebViewClient());
    }
}
