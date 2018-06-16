package com.example.paras.cgpagpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SemEntc extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] sem = {"Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_entc);

        ListView listViewCs= (ListView) findViewById(R.id.entcSem);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,sem);


        listViewCs.setAdapter(adapter);
        listViewCs.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (i==0){
            Intent semFirst = new Intent(SemEntc.this,EntcFirstSem.class);
            startActivity(semFirst);

        }
        else if (i==1){
            Intent semSecond = new Intent(SemEntc.this,EntcSecondSem.class);
            startActivity(semSecond);

        }
        else if (i==2){
            Intent semThird = new Intent(SemEntc.this,EntcThirdSem.class);
            startActivity(semThird);

        }
        else if (i==3){
            Intent semFourth = new Intent(SemEntc.this,EntcFourthSem.class);
            startActivity(semFourth);

        }
        else if (i==4){
            Intent semFifth = new Intent(SemEntc.this,EntcFifthSem.class);
            startActivity(semFifth);

        }
        else if (i==5){
            Intent semSix = new Intent(SemEntc.this,EntcSixthSem.class);
            startActivity(semSix);

        }
        else if (i==6){
            Intent semSeven  = new Intent(SemEntc.this,EntcSevenSem.class);
            startActivity(semSeven);

        }
        else if (i==7){
            Intent semEight = new Intent(SemEntc.this,EntcEightSem.class);
            startActivity(semEight);
        }

    }
}
