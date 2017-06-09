package com.pankaj.mymetro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static ImageButton im1;
    private static ImageButton im2;
    private static ImageButton im3;
    private static ImageButton im4;
    private static ImageButton im5;
    private static ImageButton im6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OpenMap();
        OpenFare();
        OpenRecharge();
        OpenZoomMap();
        Openss();
        OpenHelp();
    }
    public void OpenMap()
    {
        im1 = (ImageButton)findViewById(R.id.imbtn1);
        im1.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent gmap = new Intent(MainActivity.this, MapsActivity.class);
                        startActivity(gmap);
                    }
                }
        );
    }
    public void OpenFare(){
        im2 = (ImageButton)findViewById(R.id.imbtn2);
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent pankaj = new Intent("com.pankaj.mymetro.FareActivity");
                startActivity(pankaj);
            }
        });
    }

    public void OpenZoomMap()
    {
        im3 = (ImageButton)findViewById(R.id.imbtn3);
        im3.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent in4 = new Intent("com.pankaj.mymetro.ZoomMapActivity");
                        startActivity(in4);
                    }
                }
        );
    }
    public void OpenRecharge()
    {
        im4 = (ImageButton)findViewById(R.id.imbtn4);
        im4.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent in1 = new Intent("com.pankaj.mymetro.RechargeActivity");
                        startActivity(in1);
                    }
                }
        );
    }

    public void Openss()
    {
        im5 = (ImageButton)findViewById(R.id.imbtn5);
        im5.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent about = new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(about);
                    }
                }
        );
    }
    public void OpenHelp()
    {
        im6 = (ImageButton)findViewById(R.id.imbtn6);
        im6.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent in1 = new Intent("com.pankaj.mymetro.HelpActivity");
                        startActivity(in1);
                    }
                }
        );
    }

}
