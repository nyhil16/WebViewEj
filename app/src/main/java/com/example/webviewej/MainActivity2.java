package com.example.webviewej;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    MainActivity m;
    WebView wv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wv1 = findViewById(R.id.webview);
        wv1.setWebViewClient(new WebViewClient());
        String sentUrl = getIntent().getStringExtra("url");
        wv1.loadUrl("https://www." + sentUrl);

    }

    public void cerrar(View view) {
        finishAffinity();
        System.exit(0);
    }

}