package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class EleSecondSem extends AppCompatActivity {

    private Spinner csSpinnerSec1,csSpinnerSec2,csSpinnerSec3,csSpinnerSec4,csSpinnerSec5,csSpinnerSec6,csSpinnerSec7,csSpinnerSec8,csSpinnerSec9,csSpinnerSec10;
    private ArrayAdapter<String> csSecadapter;
    private  String grades[] = {"A+","A","B+","B","C+","C","F"} ;
    private double record1,record2,record3,record4,record5,record6,record7,record8,record9,record10;
    private TextView display_data;
    private TextView csSecondPer;
    private TextView csSecondGr1,csSecondGr2,csSecondGr3,csSecondGr4,csSecondGr5,csSecondGr6,csSecondGr7,csSecondGr8,csSecondGr9,csSecondGr10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ele_second_sem);


        display_data = findViewById(R.id.eleSgpaSec);
        csSecondPer  = findViewById(R.id.eleSecondPercentage);

        csSpinnerSec1 = findViewById(R.id.eleSpinnerSec1);
        csSpinnerSec2 = findViewById(R.id.eleSpinnerSec2);
        csSpinnerSec3 = findViewById(R.id.eleSpinnerSec3);
        csSpinnerSec4 = findViewById(R.id.eleSpinnerSec4);
        csSpinnerSec5 = findViewById(R.id.eleSpinnerSec5);
        csSpinnerSec6 = findViewById(R.id.eleSpinnerSec6);
        csSpinnerSec7 = findViewById(R.id.eleSpinnerSec7);
        csSpinnerSec8 = findViewById(R.id.eleSpinnerSec8);
        csSpinnerSec9 = findViewById(R.id.eleSpinnerSec9);
        csSpinnerSec10 = findViewById(R.id.eleSpinnerSec10);

        csSecondGr1= findViewById(R.id.eleGradeSecond1);
        csSecondGr2= findViewById(R.id.eleGradeSecond2);
        csSecondGr3= findViewById(R.id.eleGradeSecond3);
        csSecondGr4= findViewById(R.id.eleGradeSecond4);
        csSecondGr5= findViewById(R.id.eleGradeSecond5);
        csSecondGr6= findViewById(R.id.eleGradeSecond6);
        csSecondGr7= findViewById(R.id.eleGradeSecond7);
        csSecondGr8 = findViewById(R.id.eleGradeSecond8);
        csSecondGr9 = findViewById(R.id.eleGradeSecond9);
        csSecondGr10 = findViewById(R.id.eleGradeSecond10);

        csSecadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,grades);
        csSpinnerSec1.setAdapter(csSecadapter);
        csSpinnerSec2.setAdapter(csSecadapter);
        csSpinnerSec3.setAdapter(csSecadapter);
        csSpinnerSec4.setAdapter(csSecadapter);
        csSpinnerSec5.setAdapter(csSecadapter);
        csSpinnerSec6.setAdapter(csSecadapter);
        csSpinnerSec7.setAdapter(csSecadapter);
        csSpinnerSec8.setAdapter(csSecadapter);
        csSpinnerSec9.setAdapter(csSecadapter);
        csSpinnerSec10.setAdapter(csSecadapter);


        csSpinnerSec1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                switch(i){
                    case 0:
                        csSecondGr1.setText("A+");
                        record1 = 10;

                        break;
                    case 1:
                        record1 = 9;
                        csSecondGr1.setText("A");
                        break;
                    case 2:
                        record1 = 8;
                        csSecondGr1.setText("B+");
                        break;
                    case 3:
                        record1 = 7;
                        csSecondGr1.setText("B");
                        break;
                    case 4:
                        record1 = 6;
                        csSecondGr1.setText("C+");
                        break;
                    case 5:
                        record1 = 5;
                        csSecondGr1.setText("C");
                        break;
                    case 6:
                        record1 = 0;
                        csSecondGr1.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        csSpinnerSec2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){
                    case 0:
                        csSecondGr2.setText("A+");
                        record2 = 10;

                        break;
                    case 1:
                        record2 = 9;
                        csSecondGr2.setText("A");
                        break;
                    case 2:
                        record2 = 8;
                        csSecondGr2.setText("B+");
                        break;
                    case 3:
                        record2 = 7;
                        csSecondGr2.setText("B");
                        break;
                    case 4:
                        record2 = 6;
                        csSecondGr2.setText("C+");
                        break;
                    case 5:
                        record2 = 5;
                        csSecondGr2.setText("C");
                        break;
                    case 6:
                        record2 = 0;
                        csSecondGr2.setText("F");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        csSpinnerSec3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr3.setText("A+");
                        record3 = 10;

                        break;
                    case 1:
                        record3 = 9;
                        csSecondGr3.setText("A");
                        break;
                    case 2:
                        record3 = 8;
                        csSecondGr3.setText("B+");
                        break;
                    case 3:
                        record3 = 7;
                        csSecondGr3.setText("B");
                        break;
                    case 4:
                        record3 = 6;
                        csSecondGr3.setText("C+");
                        break;
                    case 5:
                        record3 = 5;
                        csSecondGr3.setText("C");
                        break;
                    case 6:
                        record3 = 0;
                        csSecondGr3.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        csSpinnerSec4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr4.setText("A+");
                        record4 = 10;

                        break;
                    case 1:
                        record4 = 9;
                        csSecondGr4.setText("A");
                        break;
                    case 2:
                        record4 = 8;
                        csSecondGr4.setText("B+");
                        break;
                    case 3:
                        record4 = 7;
                        csSecondGr4.setText("B");
                        break;
                    case 4:
                        record4 = 6;
                        csSecondGr4.setText("C+");
                        break;
                    case 5:
                        record4 = 5;
                        csSecondGr4.setText("C");
                        break;
                    case 6:
                        record4 = 0;
                        csSecondGr4.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        csSpinnerSec5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr5.setText("A+");
                        record5 = 10;

                        break;
                    case 1:
                        record5 = 9;
                        csSecondGr5.setText("A");
                        break;
                    case 2:
                        record5 = 8;
                        csSecondGr5.setText("B+");
                        break;
                    case 3:
                        record5 = 7;
                        csSecondGr5.setText("B");
                        break;
                    case 4:
                        record5 = 6;
                        csSecondGr5.setText("C+");
                        break;
                    case 5:
                        record5 = 5;
                        csSecondGr5.setText("C");
                        break;
                    case 6:
                        record5 = 0;
                        csSecondGr5.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        csSpinnerSec6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr6.setText("A+");
                        record6 = 10;

                        break;
                    case 1:
                        record6 = 9;
                        csSecondGr6.setText("A");
                        break;
                    case 2:
                        record6 = 8;
                        csSecondGr6.setText("B+");
                        break;
                    case 3:
                        record6 = 7;
                        csSecondGr6.setText("B");
                        break;
                    case 4:
                        record6 = 6;
                        csSecondGr6.setText("C+");
                        break;
                    case 5:
                        record6 = 5;
                        csSecondGr6.setText("C");
                        break;
                    case 6:
                        record6 = 0;
                        csSecondGr6.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        csSpinnerSec7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr7.setText("A+");
                        record7 = 10;

                        break;
                    case 1:
                        record7 = 9;
                        csSecondGr7.setText("A");
                        break;
                    case 2:
                        record7 = 8;
                        csSecondGr7.setText("B+");
                        break;
                    case 3:
                        record7 = 7;
                        csSecondGr7.setText("B");
                        break;
                    case 4:
                        record7 = 6;
                        csSecondGr7.setText("C+");
                        break;
                    case 5:
                        record7 = 5;
                        csSecondGr7.setText("C");
                        break;
                    case 6:
                        record7 = 0;
                        csSecondGr7.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        csSpinnerSec8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr8.setText("A+");
                        record8 = 10;

                        break;
                    case 1:
                        record8 = 9;
                        csSecondGr8.setText("A");
                        break;
                    case 2:
                        record8 = 8;
                        csSecondGr8.setText("B+");
                        break;
                    case 3:
                        record8 = 7;
                        csSecondGr8.setText("B");
                        break;
                    case 4:
                        record8 = 6;
                        csSecondGr8.setText("C+");
                        break;
                    case 5:
                        record8 = 5;
                        csSecondGr8.setText("C");
                        break;
                    case 6:
                        record8 = 0;
                        csSecondGr8.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        csSpinnerSec9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){
                    case 0:
                        csSecondGr9.setText("A+");
                        record9 = 10;

                        break;
                    case 1:
                        record9 = 9;
                        csSecondGr9.setText("A");
                        break;
                    case 2:
                        record9 = 8;
                        csSecondGr9.setText("B+");
                        break;
                    case 3:
                        record9 = 7;
                        csSecondGr9.setText("B");
                        break;
                    case 4:
                        record9 = 6;
                        csSecondGr9.setText("C+");
                        break;
                    case 5:
                        record9 = 5;
                        csSecondGr9.setText("C");
                        break;
                    case 6:
                        record9 = 0;
                        csSecondGr9.setText("F");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        csSpinnerSec10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        csSecondGr10.setText("A+");
                        record10 = 10;

                        break;
                    case 1:
                        record10 = 9;
                        csSecondGr10.setText("A");
                        break;
                    case 2:
                        record10 = 8;
                        csSecondGr10.setText("B+");
                        break;
                    case 3:
                        record10 = 7;
                        csSecondGr10.setText("B");
                        break;
                    case 4:
                        record10 = 6;
                        csSecondGr10.setText("C+");
                        break;
                    case 5:
                        record10 = 5;
                        csSecondGr10.setText("C");
                        break;
                    case 6:
                        csSecondGr10.setText("F");
                        record10 = 0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    public void displayResultEleSec(View view){
        double gp = record1*4+record2*4+record3*3+record4*2+record5*3+record6+record7+record8*2+record9+record10*2;
        double gpa = gp / 23;
        double per = (gpa -0.75)*10;
        display_data.setText(String.format(Locale.getDefault(),"%.2f",gpa));
        csSecondPer.setText(String.format(Locale.getDefault(),"%.2f",per));

    }
}
