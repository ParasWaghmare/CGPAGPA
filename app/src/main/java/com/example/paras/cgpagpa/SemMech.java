package com.example.paras.cgpagpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SemMech extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] sem = {"Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_mech);

        ListView listViewMe = (ListView) findViewById(R.id.meSem);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,sem);


        listViewMe.setAdapter(adapter);
        listViewMe.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if (i==0){
            Intent semFirst = new Intent(SemMech.this,MechFirstSem.class);
            startActivity(semFirst);

        }
        else if (i==1){
            Intent semSecond = new Intent(SemMech.this,MechSecondSem.class);
            startActivity(semSecond);

        }
        else if (i==2){
            Intent semThird = new Intent(SemMech.this,MechThirdSem.class);
            startActivity(semThird);

        }
        else if (i==3){
            Intent semFourth = new Intent(SemMech.this,MechFourthSem.class);
            startActivity(semFourth);

        }
        else if (i==4){
            Intent semFifth = new Intent(SemMech.this,MechFifthSem.class);
            startActivity(semFifth);

        }
        else if (i==5){
            Intent semSix = new Intent(SemMech.this,MechSixSem.class);
            startActivity(semSix);

        }
        else if (i==6){
            Intent semSeven  = new Intent(SemMech.this,MechSevenSem.class);
            startActivity(semSeven);

        }
        else if (i==7){
            Intent semEight = new Intent(SemMech.this,MechEightSem.class);
            startActivity(semEight);
        }

    }
}
