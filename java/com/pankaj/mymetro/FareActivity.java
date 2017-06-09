package com.pankaj.mymetro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class FareActivity extends AppCompatActivity {
    AutoCompleteTextView actvSource;
    AutoCompleteTextView actvDestination;
    Button Click, r;
    String start,stop;
    String[][] a;
    int count=0;
    ArrayList<String> list = new ArrayList<String>();
    int change = 0;
    String[] b={"CENTRAL SECRETARIATE","RAJIV CHOWK","KASHMERE GATE","DWARKA SECTOR 21","NEW DELHI","KIRTI NAGAR","YAMUNA BANK","ASHOK PARK","INDER LOK "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);

        actvSource = (AutoCompleteTextView)findViewById(R.id.actv1);
        actvDestination = (AutoCompleteTextView)findViewById(R.id.actv2);
        Click = (Button)findViewById(R.id.btn);
        r = (Button)findViewById(R.id.reset);
        String[] stations = getResources().getStringArray(R.array.station_array);
        actvSource.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,stations));
        actvDestination.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,stations));
        a= new String[][]
        {
                {"ESCORTS MUJESAR","BATA CHOWK","NEELAM CHOWK AJRONDA","OLD FARIDABAD","BADKAL MOR","SECTOR-28","MEWALA MAHARAJPUR","NHPC CHOWK","SARAI","BADARPUR","TUGHLAKABAD","MOHAN ESTATE","SARITA VIHAR","JASOLA APOLLO","OKHLA","GOVIND PURI","KALKAJI MANDIR","NEHRU PLACE","KAILASH COLONY","MOOLCHAND","LAJPAT NAGAR","JANGPURA","JLN STADIUM","KHAN MARKET","CENTRAL SECRETARIAT","JANPATH","MANDI HOUSE","ITO"},

                {"HUDA CITY CENTRE","IFFCO CHOWK","M G ROAD","SIKANDARPUR","GURU DRONACHARYA","ARJANGARH","GHITORNI","SULTANPUR","CHHATTARPUR","QUTAB MINAR","SAKET","MALVIYA NAGAR","HAUZ KHAS","GREEN PARK","AIIMS","INA","JORBAGH","LOK KALYAN MARG","UDYOG BHAWAN","CENTRAL SECRETARIAT","PATEL CHOWK","RAJIV CHOWK","NEW DELHI","CHAWRI BAZAR","CHANDNI CHOWK","KASHMERE GATE","CIVIL LINES","VIDHAN SABHA","VISHWAVIDYALAYA","G.T.B. NAGAR","MODEL TOWN","AZADPUR","ADARSH NAGAR","JAHANGIRPURI","HAIDERPUR BADLI MOR","ROHINI SECTOR 18,19","SAMAYPUR BADLI"},

				{"DWARKA SECTOR 21","IGI AIRPORT","DELHI AERO CITY","DHAULA KUAN","SHIVAJI STADIUM","NEW DELHI"},

                {"DWARKA SEC 21","DWARKA SEC 8","DWARKA SEC 9","DWARKA SEC 10","DWARKA SEC 11","DWARKA SEC 12","DWARKA SEC 13","DWARKA SEC 14","DWARKA","DWARKA MOR","NAWADA","UTTAM NAGAR WEST","UTTAM NAGAR EAST","JANAK PURI WEST","JANAK PURI EAST","TILAK NAGAR","SUBHASH NAGAR","TAGORE GARDEN","RAJOURI GARDEN","RAMESH NAGAR","MOTI NAGAR","KIRTI NAGAR","SHADIPUR","PATEL NAGAR","RAJENDRA PLACE","KAROL BAGH","JHANDEWALAN","RK ASHRAM MARG","RAJIV CHOWK","BARAKHAMBA","MANDI HOUSE","PRAGATI MAIDAN","INDRAPRASTHA","YAMUNA BANK","AKSHARDHAM","MAYUR VIHAR-I","MAYUR VIHAR-I EXT","NEW ASHOK NAGAR","NOIDA SEC 15","NOIDA SEC 16","NOIDA SEC 18","BOTANICAL GARDEN","GOLF COURSE","NOIDA CITY CENTRE"},

                {"VAISHALI","KAUSHAMBI","ANAND VIHAR","KARKAR DUMA","PREET VIHAR","NIRMAN VIHAR","LAXMI NAGAR","YAMUNA BANK"},

                {"MUNDKA","RAJDHANI PARK","NANGLOI RLY. STATION","NANGLOI","SURAJMAL STADIUM","UDYOG NAGAR","PEERA GARHI","PASCHIM VIHAR (WEST)","PASCHIM VIHAR (EAST)","MADI PUR","SHIVAJI PARK","PUNJABI BAGH","ASHOK PARK MAIN","SATGURU RAM SINGH MARG","KIRTI NAGAR"},

                {"RITHALA","ROHINI WEST","ROHINI EAST","PITAM PURA","KOHAT ENCLAVE","NETAJI SUBHASH PLACE","KESHAV PURAM","KANHAIYA NAGAR","INDER LOK","SHASTRI NAGAR","PRATAP NAGAR","PUL BANGASH","TIS HAZARI","KASHMERE GATE","SHASTRI PARK","SEELAMPUR","WELCOME","SHAHDARA","MANSAROVAR PARK","JHIL MIL","DILSHAD GARDEN"}
        };
        //search();
        Fare();
        //ListOfRoute();
        Click.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {

                clearValue();
                Fare();
                ListOfRoute();
                actvSource.setText("");
                actvDestination.setText("");
            }
        });
        r.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {

                clearValue();
                Toast.makeText(FareActivity.this, "Reset Complete", Toast.LENGTH_LONG).show();
            }
        });
    }
    public int search(int k, int i, String b[], String a[][])
    {
        int j=0,col3=0;
        while(j < a[i].length)
        {
            if(a[i][j].equals(b[k]))
            {
                col3=j;
                break;
            }
            j++;
        }
        return col3 ;
    }
    public void Fare()
    {
        start = actvSource.getText().toString().trim();
        stop = actvDestination.getText().toString().trim();
        if(start.length()!=0)
        list.add("Source : "+start);
        else
        list.clear();

        int i=0,j,k=0,row1=0,row2=0,col1=0,col2=0,flag=0,flag1=0;
        for(i=0;i<7;i++)
        {
            j=0;
            while(j < a[i].length)
            {
                if(a[i][j].equals(start))
                {
                    flag=1;
                    row1=i;
                    col1=j;
                }
                if(a[i][j].equals(stop))
                {
                    flag1=1;
                    row2=i;
                    col2=j;
                }
                j++;
            }
        }

        if(flag==0 || flag1==0)
            Toast.makeText(FareActivity.this, "Please Insert start & end station", Toast.LENGTH_LONG).show();
        //main Algorithm
        if(row1 == row2)
        {
            if(col1 < col2)
            {       col1++;
                while(col1!=col2)
                {
                    list.add("  "+a[row1][col1]);
                    col1++;
                    count++;
                }

            }
            else if(col1>col2)
            {       col1--;
                while(col1!=col2)
                {
                    list.add("  "+a[row1][col1]);
                    col1--;
                    count++;
                }
            }
            else if(start.length()!=0&&start.equals(stop))
                Toast.makeText(FareActivity.this, "Start and End Station are Same", Toast.LENGTH_LONG).show();
        }
        else
        {
            if(row1==0)
                k=0;
            else if((row1==3&&row2==4) || (row1==4&&row2==3))
                k=6;
            else if((row1==3&&row2==1) || (row1==1&&row2==3))
                k=1;
            else if((row1==3&&row2==2) || (row1==2&&row2==3))
                k=3;
            else if((row1==3&&row2==5) || (row1==5&&row2==3))
                k=5;
            else if((row1==1&&row2==6) || (row1==6&&row2==1))
                k=2;




            //  col3=15;

            int col3=search(k,row1,b,a);
            //int col3=15;
            if(col1 < col3)
            {       col1++;
                while(col1!=col3)
                {
                    list.add("  "+a[row1][col1]);
                    col1++;
                    count++;
                }

            }
            else if(col1>col3)
            {       col1--;
                while(col1!=col3)
                {
                    list.add("  "+a[row1][col1]);
                    col1--;
                    count++;
                }

            }
            //if()
            count++;
            list.add("Change Here : "+a[row1][col3]);
            change++;
            col3=search(k,row2,b,a);
            //col3=19;
            if(col3 < col2)
            {       col3++;
                while(col3!=col2)
                {
                    list.add("  "+a[row2][col3]);
                    col3++;
                    count++;
                }

            }
            else if(col3>col2)
            {       col3--;
                while(col3!=col2)
                {
                    list.add("  "+a[row2][col3]);
                    col3--;
                    count++;
                }

            }
            count++;
            list.add("Destination : "+a[row2][col3]);
        }
        if(list.contains("Destination : "+actvDestination.getText()))
        {
            list.toArray(new String[list.size()]);
        }
        else
        {
            list.add("Destination : "+actvDestination.getText());
            list.toArray(new String[list.size()]);
        }
       // System.out.println("\n\n\n"+count);
       // System.out.println("Stations : "+change);

    }
    public void ListOfRoute()
    {
        String s1 = actvSource.getText().toString();
        String d1 = actvDestination.getText().toString();
        Intent intent =new Intent(this,FareAndRoutList.class);
        intent.putExtra("ARRAYLIST", list);
        intent.putExtra("COUNT", count);
        intent.putExtra("CHANGE", change);
        startActivity(intent);

    }
    public void clearValue()
    {
        list.clear();
        count = 0;
        change = 0;
    }

}
