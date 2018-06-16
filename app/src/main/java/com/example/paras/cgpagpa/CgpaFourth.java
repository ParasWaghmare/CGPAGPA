package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaFourth extends AppCompatActivity {


    private TextView cgpaFourth;
    private EditText secondSemPointer;
    private EditText firstSemPointer;
    private EditText thirdSemPointer;
    private EditText fourthPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_fourth);

        cgpaFourth = findViewById(R.id.totalCgpa4);
        firstSemPointer = findViewById(R.id.firstSemPointer4);
        secondSemPointer = findViewById(R.id.secondSemPointer4);
        thirdSemPointer = findViewById(R.id.thirdSemPointer4);
        fourthPointer = findViewById(R.id.fourthSemPointer4);
    }

    public void fourthSemCalculate(View view){
        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0 || thirdSemPointer.getText().length()==0 || fourthPointer.getText().length()==0){
            Toast.makeText(CgpaFourth.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else
        {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());
            double sgpaThird = Double.parseDouble(thirdSemPointer.getText().toString());
            double sgpaFourth = Double.parseDouble(fourthPointer.getText().toString());

            if (sgpaFirst <= 10 && sgpaSecond <= 10 && sgpaThird <= 10 && sgpaFourth <= 10 ) {
                double cgpaFourthCalculate = (sgpaFirst + sgpaSecond + sgpaThird + sgpaFourth) / 4;

                cgpaFourth.setText(String.format(Locale.getDefault(), "%.2f", cgpaFourthCalculate));
            } else{
                Toast.makeText(CgpaFourth.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();
            }
        }
    }
}
