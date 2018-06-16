package com.example.paras.cgpagpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CgpaCalculation extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] semCgpa = {"Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculation);

        ListView listViewCs= (ListView) findViewById(R.id.cgpaSemester);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,semCgpa);


        listViewCs.setAdapter(adapter);
        listViewCs.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            if (i==0) {
                Intent cgpaFirst = new Intent(CgpaCalculation.this, CgpaFirst.class);
                startActivity(cgpaFirst);
            }
            else if (i==1) {
                Intent cgpaSec = new Intent(CgpaCalculation.this, CgpaSecond.class);
                startActivity(cgpaSec);
            }
            else if (i==2) {
                Intent cgpaThird = new Intent(CgpaCalculation.this, CgpaThird.class);
                startActivity(cgpaThird);
            }
            else if (i==3) {
                Intent cgpaFourth = new Intent(CgpaCalculation.this, CgpaFourth.class);
                startActivity(cgpaFourth);
            }
            else if (i==4) {
                Intent cgpaFifth = new Intent(CgpaCalculation.this, CgpaFifth.class);
                startActivity(cgpaFifth);
            }
            else if (i==5) {
                Intent cgpaSixth = new Intent(CgpaCalculation.this, CgpaSixth.class);
                startActivity(cgpaSixth);
            }
            else if (i==6) {
                Intent cgpaSeven = new Intent(CgpaCalculation.this, CgpaSeven.class);
                startActivity(cgpaSeven);
            }
            else if (i==7){

                Intent cgpaEight = new Intent(CgpaCalculation.this,CgpaEight.class);
                startActivity(cgpaEight);

        }

    }
}
