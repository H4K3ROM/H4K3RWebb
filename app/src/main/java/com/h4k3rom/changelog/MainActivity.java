package com.h4k3rom.changelog;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View view) {
        Intent browserIntent= new Intent (Intent.ACTION_VIEW, Uri.parse("https://raw.githubusercontent.com/H4K3ROM/changelog/master/Changelog.txt"));
        startActivity(browserIntent);
    }
    public void open2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.androidfilehost.com/?w=files&flid=285971"));
        startActivity(browserIntent);
    }
    public void open3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-3/oneplus-3--3t-cross-device-development/h4k3rom-android-pie-oneplus3-gzosp-t3870594"));
        startActivity(browserIntent);

    }
}
