package com.vallkun.barista_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash_screen extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000; // 3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        // Delay 3 detik sebelum pindah ke HomePage
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk berpindah ke halaman HomePage
                Intent intent = new Intent(splash_screen.this, homepage.class);
                startActivity(intent);
                finish(); // Tutup splash screen agar tidak bisa kembali ke halaman ini
            }
        }, SPLASH_TIME_OUT);
    }
}