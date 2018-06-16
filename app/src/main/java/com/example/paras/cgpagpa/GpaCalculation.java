package com.example.paras.cgpagpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class GpaCalculation extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] arrayList = {"Computer Engineering","Mechanical Engineering","Instrumentation","E&TC","Electrical Engineering","Civil"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calculation);
        ListView listView = (ListView) findViewById(R.id.department_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,arrayList);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if (i==0){
            Intent csIntent =  new Intent(GpaCalculation.this,SemCs.class);
            startActivity(csIntent);
        }
        else if(i==1){
            Intent csMech = new Intent(GpaCalculation.this,SemMech.class);
            startActivity(csMech);
        }
        else if (i==2){
            Intent insIntent =  new Intent(GpaCalculation.this,SemInst.class);
            startActivity(insIntent);
        }
        else if (i==3){
            Intent enInent = new Intent(GpaCalculation.this,SemEntc.class);
            startActivity(enInent);
        }
        else if (i==4){
            Intent eleIntent = new Intent(GpaCalculation.this,SemEle.class);
            startActivity(eleIntent);
        }
        else if(i==5){
            Intent cvIntent = new Intent(GpaCalculation.this,SemCiv.class);
            startActivity(cvIntent);
        }
    }
}
