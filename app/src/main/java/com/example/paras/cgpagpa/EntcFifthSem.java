package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class EntcFifthSem extends AppCompatActivity {

    private Spinner meSpinnerFirst1,meSpinnerFirst2,meSpinnerFirst3,meSpinnerFirst4,meSpinnerFirst5,meSpinnerFirst6,meSpinnerFirst7,meSpinnerFirst8,meSpinnerFirst9,meSpinnerFirst10;
    private ArrayAdapter<String> csSecadapter;
    private  String grades[] = {"A+","A","B+","B","C+","C","F"} ;
    private double record1,record2,record3,record4,record5,record6,record7,record8,record9,record10;
    private TextView display_data;
    private TextView csSecondPer;
    private TextView meFirstGr1,meFirstGr2,meFirstGr3,meFirstGr4,meFirstGr5,meFirstGr6,meFirstGr7,meFirstGr8,meFirstGr9,meFirstGr10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entc_fifth_sem);


        display_data = findViewById(R.id.entcFifthSgpa);
        csSecondPer  = findViewById(R.id.entcFifthPercentage);

        meSpinnerFirst1 = findViewById(R.id.entcFifthSpinner1);
        meSpinnerFirst2 = findViewById(R.id.entcFifthSpinner2);
        meSpinnerFirst3 = findViewById(R.id.entcFifthSpinner3);
        meSpinnerFirst4 = findViewById(R.id.entcFifthSpinner4);
        meSpinnerFirst5 = findViewById(R.id.entcFifthSpinner5);
        meSpinnerFirst6 = findViewById(R.id.entcFifthSpinner6);
        meSpinnerFirst7 = findViewById(R.id.entcFifthSpinner7);
        meSpinnerFirst8 = findViewById(R.id.entcFifthSpinner8);
        meSpinnerFirst9 = findViewById(R.id.entcFifthSpinner9);
        meSpinnerFirst10 = findViewById(R.id.entcFifthSpinner10);

        meFirstGr1= findViewById(R.id.entcGradeFifth1);
        meFirstGr2= findViewById(R.id.entcGradeFifth2);
        meFirstGr3= findViewById(R.id.entcGradeFifth3);
        meFirstGr4= findViewById(R.id.entcGradeFifth4);
        meFirstGr5= findViewById(R.id.entcGradeFifth5);
        meFirstGr6= findViewById(R.id.entcGradeFifth6);
        meFirstGr7= findViewById(R.id.entcGradeFifth7);
        meFirstGr8 = findViewById(R.id.entcGradeFifth8);
        meFirstGr9 = findViewById(R.id.entcGradeFifth9);
        meFirstGr10 = findViewById(R.id.entcGradeFifth10);


        csSecadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,grades);
        meSpinnerFirst1.setAdapter(csSecadapter);
        meSpinnerFirst2.setAdapter(csSecadapter);
        meSpinnerFirst3.setAdapter(csSecadapter);
        meSpinnerFirst4.setAdapter(csSecadapter);
        meSpinnerFirst5.setAdapter(csSecadapter);
        meSpinnerFirst6.setAdapter(csSecadapter);
        meSpinnerFirst7.setAdapter(csSecadapter);
        meSpinnerFirst8.setAdapter(csSecadapter);
        meSpinnerFirst9.setAdapter(csSecadapter);
        meSpinnerFirst10.setAdapter(csSecadapter);



        meSpinnerFirst1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                switch(i){
                    case 0:
                        meFirstGr1.setText("A+");
                        record1 = 10;

                        break;
                    case 1:
                        record1 = 9;
                        meFirstGr1.setText("A");
                        break;
                    case 2:
                        record1 = 8;
                        meFirstGr1.setText("B+");
                        break;
                    case 3:
                        record1 = 7;
                        meFirstGr1.setText("B");
                        break;
                    case 4:
                        record1 = 6;
                        meFirstGr1.setText("C+");
                        break;
                    case 5:
                        record1 = 5;
                        meFirstGr1.setText("C");
                        break;
                    case 6:
                        record1 = 0;
                        meFirstGr1.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        meSpinnerFirst2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){
                    case 0:
                        meFirstGr2.setText("A+");
                        record2 = 10;

                        break;
                    case 1:
                        record2 = 9;
                        meFirstGr2.setText("A");
                        break;
                    case 2:
                        record2 = 8;
                        meFirstGr2.setText("B+");
                        break;
                    case 3:
                        record2 = 7;
                        meFirstGr2.setText("B");
                        break;
                    case 4:
                        record2 = 6;
                        meFirstGr2.setText("C+");
                        break;
                    case 5:
                        record2 = 5;
                        meFirstGr2.setText("C");
                        break;
                    case 6:
                        record2 = 0;
                        meFirstGr2.setText("F");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        meSpinnerFirst3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr3.setText("A+");
                        record3 = 10;

                        break;
                    case 1:
                        record3 = 9;
                        meFirstGr3.setText("A");
                        break;
                    case 2:
                        record3 = 8;
                        meFirstGr3.setText("B+");
                        break;
                    case 3:
                        record3 = 7;
                        meFirstGr3.setText("B");
                        break;
                    case 4:
                        record3 = 6;
                        meFirstGr3.setText("C+");
                        break;
                    case 5:
                        record3 = 5;
                        meFirstGr3.setText("C");
                        break;
                    case 6:
                        record3 = 0;
                        meFirstGr3.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        meSpinnerFirst4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr4.setText("A+");
                        record4 = 10;

                        break;
                    case 1:
                        record4 = 9;
                        meFirstGr4.setText("A");
                        break;
                    case 2:
                        record4 = 8;
                        meFirstGr4.setText("B+");
                        break;
                    case 3:
                        record4 = 7;
                        meFirstGr4.setText("B");
                        break;
                    case 4:
                        record4 = 6;
                        meFirstGr4.setText("C+");
                        break;
                    case 5:
                        record4 = 5;
                        meFirstGr4.setText("C");
                        break;
                    case 6:
                        record4 = 0;
                        meFirstGr4.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        meSpinnerFirst5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr5.setText("A+");
                        record5 = 10;

                        break;
                    case 1:
                        record5 = 9;
                        meFirstGr5.setText("A");
                        break;
                    case 2:
                        record5 = 8;
                        meFirstGr5.setText("B+");
                        break;
                    case 3:
                        record5 = 7;
                        meFirstGr5.setText("B");
                        break;
                    case 4:
                        record5 = 6;
                        meFirstGr5.setText("C+");
                        break;
                    case 5:
                        record5 = 5;
                        meFirstGr5.setText("C");
                        break;
                    case 6:
                        record5 = 0;
                        meFirstGr5.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        meSpinnerFirst6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr6.setText("A+");
                        record6 = 10;

                        break;
                    case 1:
                        record6 = 9;
                        meFirstGr6.setText("A");
                        break;
                    case 2:
                        record6 = 8;
                        meFirstGr6.setText("B+");
                        break;
                    case 3:
                        record6 = 7;
                        meFirstGr6.setText("B");
                        break;
                    case 4:
                        record6 = 6;
                        meFirstGr6.setText("C+");
                        break;
                    case 5:
                        record6 = 5;
                        meFirstGr6.setText("C");
                        break;
                    case 6:
                        record6 = 0;
                        meFirstGr6.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        meSpinnerFirst7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr7.setText("A+");
                        record7 = 10;

                        break;
                    case 1:
                        record7 = 9;
                        meFirstGr7.setText("A");
                        break;
                    case 2:
                        record7 = 8;
                        meFirstGr7.setText("B+");
                        break;
                    case 3:
                        record7 = 7;
                        meFirstGr7.setText("B");
                        break;
                    case 4:
                        record7 = 6;
                        meFirstGr7.setText("C+");
                        break;
                    case 5:
                        record7 = 5;
                        meFirstGr7.setText("C");
                        break;
                    case 6:
                        record7 = 0;
                        meFirstGr7.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        meSpinnerFirst8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr8.setText("A+");
                        record8 = 10;

                        break;
                    case 1:
                        record8 = 9;
                        meFirstGr8.setText("A");
                        break;
                    case 2:
                        record8 = 8;
                        meFirstGr8.setText("B+");
                        break;
                    case 3:
                        record8 = 7;
                        meFirstGr8.setText("B");
                        break;
                    case 4:
                        record8 = 6;
                        meFirstGr8.setText("C+");
                        break;
                    case 5:
                        record8 = 5;
                        meFirstGr8.setText("C");
                        break;
                    case 6:
                        record8 = 0;
                        meFirstGr8.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        meSpinnerFirst9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){
                    case 0:
                        meFirstGr9.setText("A+");
                        record9 = 10;

                        break;
                    case 1:
                        record9 = 9;
                        meFirstGr9.setText("A");
                        break;
                    case 2:
                        record9 = 8;
                        meFirstGr9.setText("B+");
                        break;
                    case 3:
                        record9 = 7;
                        meFirstGr9.setText("B");
                        break;
                    case 4:
                        record9 = 6;
                        meFirstGr9.setText("C+");
                        break;
                    case 5:
                        record9 = 5;
                        meFirstGr9.setText("C");
                        break;
                    case 6:
                        record9 = 0;
                        meFirstGr9.setText("F");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        meSpinnerFirst10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        meFirstGr10.setText("A+");
                        record10 = 10;

                        break;
                    case 1:
                        record10 = 9;
                        meFirstGr10.setText("A");
                        break;
                    case 2:
                        record10 = 8;
                        meFirstGr10.setText("B+");
                        break;
                    case 3:
                        record10 = 7;
                        meFirstGr10.setText("B");
                        break;
                    case 4:
                        record10 = 6;
                        meFirstGr10.setText("C+");
                        break;
                    case 5:
                        record10 = 5;
                        meFirstGr10.setText("C");
                        break;
                    case 6:
                        meFirstGr10.setText("F");
                        record10 = 0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    public void displayResultEntcFifth(View view){
        double gp = record1*3+record2+record3*3+record4+record5*3+record6+record7*3+record8*3+record9*3+record10*2;
        double gpa = gp / 23;
        double per = (gpa -0.75)*10;
        display_data.setText(String.format(Locale.getDefault(),"%.2f",gpa));
        csSecondPer.setText(String.format(Locale.getDefault(),"%.2f",per));

    }
}
