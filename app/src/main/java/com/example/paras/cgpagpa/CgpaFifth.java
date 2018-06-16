package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.DOMImplementation;

import java.util.Locale;

public class CgpaFifth extends AppCompatActivity {


    private TextView cgpaFourth;
    private EditText secondSemPointer;
    private EditText firstSemPointer;
    private EditText thirdSemPointer;
    private EditText fourthPointer;
    private EditText fifthSemPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_fifth);

        cgpaFourth = findViewById(R.id.totalCgpa5);

        firstSemPointer = findViewById(R.id.firstSemPointer5);
        secondSemPointer = findViewById(R.id.secondSemPointer5);
        thirdSemPointer = findViewById(R.id.thirdSemPointer5);
        fourthPointer = findViewById(R.id.fourthSemPointer5);
        fifthSemPointer = findViewById(R.id.fifthSemPointer5);

    }

    public void fifthSemCalculate(View view){


        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0 || thirdSemPointer.getText().length()==0 || fourthPointer.getText().length()==0 || fifthSemPointer.getText().length()==0){
            Toast.makeText(CgpaFifth.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());
            double sgpaThird = Double.parseDouble(thirdSemPointer.getText().toString());
            double sgpaFourth = Double.parseDouble(fourthPointer.getText().toString());
            double sgpaFifth = Double.parseDouble(fifthSemPointer.getText().toString());

            if (sgpaFirst <= 10 && sgpaSecond <= 10 && sgpaThird <= 10 && sgpaFourth <= 10 && sgpaFifth <= 10) {
                double cgpaFourthCalculate = (sgpaFirst + sgpaSecond + sgpaThird + sgpaFourth + sgpaFifth) / 5;
                cgpaFourth.setText(String.format(Locale.getDefault(), "%.2f", cgpaFourthCalculate));
            }
            else{
                Toast.makeText(CgpaFifth.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();
            }
        }
    }
}
