package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class CivFourthSem extends AppCompatActivity {


    private  String grades[] = {"A+","A","B+","B","C+","C","F"} ;
    private double record1,record2,record3,record4,record5,record6,record7,record8,record9,record10;
    private TextView display_data;
    private TextView csFourthPer;
    private TextView gr1,gr2,gr3,gr4,gr5,gr6,gr7,gr8,gr9,gr10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civ_fourth_sem);



        display_data = findViewById(R.id.civSgpaFourth);
        csFourthPer = findViewById(R.id.civFourthPercentage);

        Spinner sp1 = findViewById(R.id.civSpinnerFourth1);
        Spinner sp2 = findViewById(R.id.civSpinnerFourth2);
        Spinner sp3 = findViewById(R.id.civSpinnerFourth3);
        Spinner sp4 = findViewById(R.id.civSpinnerFourth4);
        Spinner sp5 = findViewById(R.id.civSpinnerFourth5);
        Spinner sp6 = findViewById(R.id.civSpinnerFourth6);
        Spinner sp7 = findViewById(R.id.civSpinnerFourth7);
        Spinner sp8 = findViewById(R.id.civSpinnerFourth8);
        Spinner sp9 = findViewById(R.id.civSpinnerFourth9);
        Spinner sp10 = findViewById(R.id.civSpinnerFourth10);


        gr1 = findViewById(R.id.civGradeFourth1);
        gr2 = findViewById(R.id.civGradeFourth2);
        gr3 = findViewById(R.id.civGradeFourth3);
        gr4 = findViewById(R.id.civGradeFourth4);
        gr5 = findViewById(R.id.civGradeFourth5);
        gr6 = findViewById(R.id.civGradeFourth6);
        gr7 = findViewById(R.id.civGradeFourth7);
        gr8 = findViewById(R.id.civGradeFourth8);
        gr9 = findViewById(R.id.civGradeFourth9);
        gr10 = findViewById(R.id.civGradeFourth10);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grades);
        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);
        sp3.setAdapter(adapter);
        sp4.setAdapter(adapter);
        sp5.setAdapter(adapter);
        sp6.setAdapter(adapter);
        sp7.setAdapter(adapter);
        sp8.setAdapter(adapter);
        sp9.setAdapter(adapter);
        sp10.setAdapter(adapter);



        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 0:
                        gr1.setText("A+");
                        record1 = 10;

                        break;
                    case 1:
                        record1 = 9;
                        gr1.setText("A");
                        break;
                    case 2:
                        record1 = 8;
                        gr1.setText("B+");
                        break;
                    case 3:
                        record1 = 7;
                        gr1.setText("B");
                        break;
                    case 4:
                        record1 = 6;
                        gr1.setText("C+");
                        break;
                    case 5:
                        record1 = 5;
                        gr1.setText("C");
                        break;
                    case 6:
                        record1 = 0;
                        gr1.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        gr2.setText("A+");
                        record2 = 10;

                        break;
                    case 1:
                        record2 = 9;
                        gr2.setText("A");
                        break;
                    case 2:
                        record2 = 8;
                        gr2.setText("B+");
                        break;
                    case 3:
                        record2 = 7;
                        gr2.setText("B");
                        break;
                    case 4:
                        record2 = 6;
                        gr2.setText("C+");
                        break;
                    case 5:
                        record2 = 5;
                        gr2.setText("C");
                        break;
                    case 6:
                        record2 = 0;
                        gr2.setText("F");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr3.setText("A+");
                        record3 = 10;

                        break;
                    case 1:
                        record3 = 9;
                        gr3.setText("A");
                        break;
                    case 2:
                        record3 = 8;
                        gr3.setText("B+");
                        break;
                    case 3:
                        record3 = 7;
                        gr3.setText("B");
                        break;
                    case 4:
                        record3 = 6;
                        gr3.setText("C+");
                        break;
                    case 5:
                        record3 = 5;
                        gr3.setText("C");
                        break;
                    case 6:
                        record3 = 0;
                        gr3.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr4.setText("A+");
                        record4 = 10;

                        break;
                    case 1:
                        record4 = 9;
                        gr4.setText("A");
                        break;
                    case 2:
                        record4 = 8;
                        gr4.setText("B+");
                        break;
                    case 3:
                        record4 = 7;
                        gr4.setText("B");
                        break;
                    case 4:
                        record4 = 6;
                        gr4.setText("C+");
                        break;
                    case 5:
                        record4 = 5;
                        gr4.setText("C");
                        break;
                    case 6:
                        record4 = 0;
                        gr4.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr5.setText("A+");
                        record5 = 10;

                        break;
                    case 1:
                        record5 = 9;
                        gr5.setText("A");
                        break;
                    case 2:
                        record5 = 8;
                        gr5.setText("B+");
                        break;
                    case 3:
                        record5 = 7;
                        gr5.setText("B");
                        break;
                    case 4:
                        record5 = 6;
                        gr5.setText("C+");
                        break;
                    case 5:
                        record5 = 5;
                        gr5.setText("C");
                        break;
                    case 6:
                        record5 = 0;
                        gr5.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr6.setText("A+");
                        record6 = 10;

                        break;
                    case 1:
                        record6 = 9;
                        gr6.setText("A");
                        break;
                    case 2:
                        record6 = 8;
                        gr6.setText("B+");
                        break;
                    case 3:
                        record6 = 7;
                        gr6.setText("B");
                        break;
                    case 4:
                        record6 = 6;
                        gr6.setText("C+");
                        break;
                    case 5:
                        record6 = 5;
                        gr6.setText("C");
                        break;
                    case 6:
                        record6 = 0;
                        gr6.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr7.setText("A+");
                        record7 = 10;

                        break;
                    case 1:
                        record7 = 9;
                        gr7.setText("A");
                        break;
                    case 2:
                        record7 = 8;
                        gr7.setText("B+");
                        break;
                    case 3:
                        record7 = 7;
                        gr7.setText("B");
                        break;
                    case 4:
                        record7 = 6;
                        gr7.setText("C+");
                        break;
                    case 5:
                        record7 = 5;
                        gr7.setText("C");
                        break;
                    case 6:
                        record7 = 0;
                        gr7.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr8.setText("A+");
                        record8 = 10;

                        break;
                    case 1:
                        record8 = 9;
                        gr8.setText("A");
                        break;
                    case 2:
                        record8 = 8;
                        gr8.setText("B+");
                        break;
                    case 3:
                        record8 = 7;
                        gr8.setText("B");
                        break;
                    case 4:
                        record8 = 6;
                        gr8.setText("C+");
                        break;
                    case 5:
                        record8 = 5;
                        gr8.setText("C");
                        break;
                    case 6:
                        record8 = 0;
                        gr8.setText("F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        gr9.setText("A+");
                        record9 = 10;

                        break;
                    case 1:
                        record9 = 9;
                        gr9.setText("A");
                        break;
                    case 2:
                        record9 = 8;
                        gr9.setText("B+");
                        break;
                    case 3:
                        record9 = 7;
                        gr9.setText("B");
                        break;
                    case 4:
                        record9 = 6;
                        gr9.setText("C+");
                        break;
                    case 5:
                        record9 = 5;
                        gr9.setText("C");
                        break;
                    case 6:
                        record9 = 0;
                        gr9.setText("F");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        gr10.setText("A+");
                        record10 = 10;

                        break;
                    case 1:
                        record10 = 9;
                        gr10.setText("A");
                        break;
                    case 2:
                        record10 = 8;
                        gr10.setText("B+");
                        break;
                    case 3:
                        record10 = 7;
                        gr10.setText("B");
                        break;
                    case 4:
                        record10 = 6;
                        gr10.setText("C+");
                        break;
                    case 5:
                        record10 = 5;
                        gr10.setText("C");
                        break;
                    case 6:
                        gr10.setText("F");
                        record10 = 0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void displayResultCivFourth(View view){
        double gp = record1*4+record2*4+record3*3+record4*3+record5*3+record6*2+record7+record8+record9+record10;
        double gpa = gp / 23;
        double per = (gpa -0.75)*10;
        display_data.setText(String.format(Locale.getDefault(),"%.2f",gpa));
        csFourthPer.setText(String.format(Locale.getDefault(),"%.2f",per));

    }
}
