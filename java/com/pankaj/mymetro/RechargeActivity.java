package com.pankaj.mymetro;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RechargeActivity extends AppCompatActivity
{
    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recharge_activity);

        b1 = (Button) findViewById(R.id.app);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                Intent i;
                PackageManager manager = getPackageManager();
                try
                {
                    i = manager.getLaunchIntentForPackage("net.one97.paytm.AJRMetroCardRecharge");
                    if(i==null)
                    {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=net.one97.paytm&hl=en")));
                    }
                }
                catch(Exception e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=net.one97.paytm&hl=en")));
                }
            }
        });


        b2 = (Button) findViewById(R.id.web);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/metro-card-recharge")));
            }
        });


        b3 = (Button) findViewById(R.id.ofweb);
        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dmrcsmartcard.com/")));
            }
        });
    }
}
