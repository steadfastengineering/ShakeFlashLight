package com.github.shakeflashlight;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent serviceIntent = new Intent(this, ShakeService.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Toast.makeText(this, "Starting shake flashlight service", Toast.LENGTH_SHORT).show();
            startForegroundService(serviceIntent);
        }
    }
}
