package com.gerarje.MercadoBursatilRA.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

import com.gerarje.MercadoBursatilRA.R;
import com.gerarje.MercadoBursatilRA.model.YouTubeVideos;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        WebView videoWebViewLogin = findViewById(R.id.videoWebView_login);

        YouTubeVideos youTubeVideos = new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bwfjWNKL-78\" frameborder=\"0\" allowfullscreen></iframe>",
                "Tutorial Aplicación");

        videoWebViewLogin.loadData(youTubeVideos.getVideoUrl(),"text/html", "utf-8");

        videoWebViewLogin.getSettings().setJavaScriptEnabled(true);
        videoWebViewLogin.setWebChromeClient(new WebChromeClient() {

        });
    }

    public void goToMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
