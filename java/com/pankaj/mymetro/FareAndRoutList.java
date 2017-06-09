package com.pankaj.mymetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class FareAndRoutList extends AppCompatActivity {
    int count, change;
    ArrayAdapter<String> adapter;
    ListView lst;
    TextView s1, c1, f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare_and_rout_list);
        lst = (ListView)findViewById(R.id.listroute);
        s1 = (TextView) findViewById(R.id.sta);
        c1 = (TextView) findViewById(R.id.chan);
        f1 = (TextView) findViewById(R.id.f);
        ArrayList<String> list = (ArrayList<String>) getIntent().getSerializableExtra("ARRAYLIST");
        adapter=new ArrayAdapter<String>(FareAndRoutList.this,android.R.layout.simple_list_item_1,list);
        //list.clear();
        lst.setAdapter(adapter);

        //---------------------------------------------------------------
        count = (Integer)getIntent().getIntExtra("COUNT",0);
        change = (Integer)getIntent().getIntExtra("CHANGE",0);

        s1.setText(""+(count+2));
        c1.setText(""+change);

        int x= count+2;
        int fr=0;
        s1.setText(""+(count+2));
        c1.setText(""+change);
        if(x==2)
            fr=8;
        if(x==3)
            fr=10;
        if(x==4||x==5)
            fr=12;
        if(x==6||x==7||x==8)
            fr=15;
        if(x==9||x==10||x==11)
            fr=16;
        if(x==12||x==13||x==14)
            fr=18;
        if(x==15||x==16)
            fr=19;
        if(x==17||x==18||x==19)
            fr=21;
        if(x==20||x==21||x==22)
            fr=22;
        if(x==23||x==24||x==25)
            fr=23;
        if(x==26||x==27||x==28)
            fr=24;
        if(x==29||x==30||x==31)
            fr=25;
        if(x==32||x==33||x==34)
            fr=26;
        if(x==35||x==36||x==37)
            fr=27;
        if(x==38||x==39||x==40)
            fr=28;
        if(x==41||x==42||x==43)
            fr=29;
        if(x==44||x==45||x==46)
            fr=30;
        if(x>45)
            fr=31;
        f1.setText(""+fr);

    }
}
