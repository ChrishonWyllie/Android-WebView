package com.chrishonwyllie.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to Webview in activity_main.xml

        WebView webview = (WebView) findViewById(R.id.webview);


        // IMPORTANT:
        // Before we begin, don't forget to add this to your AndroidManifest.xml file
        // This enables Internet access
        // <uses-permission android:name="android.permission.INTERNET"/>

        // Most websites these days uses JavaScript to customize the look of the webpage.
        // For example, animations that may occur, etc
        // This method does exactly what its signature implies and enables JavaScript for the WebView
        // This is not enable by default
        webview.getSettings().setJavaScriptEnabled(true);

        // You can activate a variety of settings with: webView.getSettings()...



        // IMPORTANT
        // By default opening a url with the webview will open the default web browser, Google Chrome
        // This will open the url INSIDE the webview instead
        webview.setWebViewClient(new WebViewClient());

        // Now simply load any url you wish to display into the webview
        webview.loadUrl("http://chrishonwyllie.com/");




        // Additionally, you can load your own HTML content into the webview
        //webview.loadData("<html><body><h1>This is my custom webview content!</h1><br/><p>Perhaps there should be more here...</p></body></html>", "text/html", "UTF-8");



    }
}
