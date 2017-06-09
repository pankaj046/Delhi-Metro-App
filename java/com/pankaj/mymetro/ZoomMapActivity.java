package com.pankaj.mymetro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ZoomMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_map);
        TouchImageView img = (TouchImageView)findViewById(R.id.zm);
        img.setImageResource(R.drawable.zmap);
    }
}
