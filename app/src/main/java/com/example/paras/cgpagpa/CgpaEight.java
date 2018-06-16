package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaEight extends AppCompatActivity {

    private TextView cgpaFifth;
    private EditText secondSemPointer;
    private EditText firstSemPointer;
    private EditText thirdSemPointer;
    private EditText fourthPointer;
    private EditText fifthSemPointer;
    private EditText sixthSemPointer;
    private EditText sevenSemPointer;
    private EditText eightSemPointer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_eight);

        cgpaFifth = findViewById(R.id.totalCgpa8);

        firstSemPointer = findViewById(R.id.firstSemPointer8);
        secondSemPointer = findViewById(R.id.secondSemPointer8);
        thirdSemPointer = findViewById(R.id.thirdSemPointer8);
        fourthPointer = findViewById(R.id.fourthSemPointer8);
        fifthSemPointer = findViewById(R.id.fifthSemPointer8);
        sixthSemPointer = findViewById(R.id.sixthSemPointer8);
        sevenSemPointer = findViewById(R.id.sevenSemPointer8);
        eightSemPointer = findViewById(R.id.eightSemPointer8);

    }

    public void eightSemCalculate(View view){
        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0 || thirdSemPointer.getText().length()==0 || fourthPointer.getText().length()==0 || fifthSemPointer.getText().length()==0|| sixthSemPointer.getText().length()==0 || sevenSemPointer.getText().length()==0 || eightSemPointer.getText().length() == 0){
            Toast.makeText(CgpaEight.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());
            double sgpaThird = Double.parseDouble(thirdSemPointer.getText().toString());
            double sgpaFourth = Double.parseDouble(fourthPointer.getText().toString());
            double sgpaFifth = Double.parseDouble(fifthSemPointer.getText().toString());
            double sgpaSixth = Double.parseDouble(sixthSemPointer.getText().toString());
            double sgpaSeven = Double.parseDouble(sevenSemPointer.getText().toString());
            double sgpaEight = Double.parseDouble(eightSemPointer.getText().toString());

            if (sgpaFirst <= 10 && sgpaSecond <= 10 && sgpaThird <= 10 && sgpaFourth <= 10 && sgpaFifth <= 10 && sgpaSixth<=10 && sgpaSeven <=10 && sgpaEight<=10) {
                double cgpaFourthCalculate = (sgpaFirst + sgpaSecond + sgpaThird + sgpaFourth + sgpaFifth +sgpaSixth + sgpaSeven + sgpaEight ) / 8;
                cgpaFifth.setText(String.format(Locale.getDefault(), "%.2f", cgpaFourthCalculate));


            }
            else{
                Toast.makeText(CgpaEight.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();
            }
        }
    }
}
