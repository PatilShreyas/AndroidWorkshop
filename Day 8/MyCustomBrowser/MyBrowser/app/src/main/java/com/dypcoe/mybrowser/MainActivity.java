package com.dypcoe.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link WebView from resource
        wv = findViewById(R.id.webView);
        etUrl = findViewById(R.id.editTextUrl);

        wv.setWebViewClient(new WebViewClient());
    }

    public void openUrl(View view) {
        String url = etUrl.getText().toString();

        // Load URL into WebView
        wv.loadUrl("http://"+url);
    }
}
