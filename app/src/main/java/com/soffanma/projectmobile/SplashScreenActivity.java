package com.soffanma.projectmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import com.haseebazeem.sampleGif.GifImageView;

public class SplashScreenActivity extends AppCompatActivity {

    private int waktu_loading = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        GifImageView gifImageView;

        gifImageView = (GifImageView) findViewById(R.id.gifimageview);
        gifImageView.setGifImageResource(R.drawable.animation_500_khvetvsr);

        initSplash();

    }

    private void initSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Check if we're running on Android 5.0 or higher
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // Apply activity transition
                } else {
                    // Swap without transition
                }

                Intent intro = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intro);
                finish();
                overridePendingTransition(0, 0);
                getIntent().addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            }
        }, waktu_loading);
    }

}