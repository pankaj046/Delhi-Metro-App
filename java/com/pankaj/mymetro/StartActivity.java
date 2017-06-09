package com.pankaj.mymetro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class StartActivity extends AppCompatActivity {
    ProgressBar pgr;
    int progress = 0;
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        pgr = (ProgressBar)findViewById(R.id.progressBar3);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++)
                {
                    progress+=20;
                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            pgr.setProgress(progress);
                            if(progress==pgr.getMax())
                            {
                                Intent in = new Intent("com.pankaj.mymetro.MainActivity");
                                startActivity(in);
                                finish();
                            }
                        }
                    });
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){}
                }
            }
        }).start();
    }
}

