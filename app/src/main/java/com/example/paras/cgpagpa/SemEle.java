package com.example.paras.cgpagpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SemEle extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] sem = {"Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_ele);

        ListView listViewCs= (ListView) findViewById(R.id.eleSem);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,sem);


        listViewCs.setAdapter(adapter);
        listViewCs.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if (i==0){
            Intent semFirst = new Intent(SemEle.this,EleFirstSem.class);
            startActivity(semFirst);

        }
        else if (i==1){
            Intent semSecond = new Intent(SemEle.this,EleSecondSem.class);
            startActivity(semSecond);

        }
        else if (i==2){
            Intent semThird = new Intent(SemEle.this,EleThirdSem.class);
            startActivity(semThird);

        }
        else if (i==3){
            Intent semFourth = new Intent(SemEle.this,EleFourthSem.class);
            startActivity(semFourth);

        }
        else if (i==4){
            Intent semFifth = new Intent(SemEle.this,EleFifthSem.class);
            startActivity(semFifth);

        }
        else if (i==5){
            Intent semSix = new Intent(SemEle.this,EleSixSem.class);
            startActivity(semSix);

        }
        else if (i==6){
            Intent semSeven  = new Intent(SemEle.this,EleSevenSem.class);
            startActivity(semSeven);

        }
        else if (i==7){
            Intent semEight = new Intent(SemEle.this,EleEightSem.class);
            startActivity(semEight);
        }

    }
}
