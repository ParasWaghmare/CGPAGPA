package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaSixth extends AppCompatActivity {

    private TextView cgpaFifth;
    private EditText secondSemPointer;
    private EditText firstSemPointer;
    private EditText thirdSemPointer;
    private EditText fourthPointer;
    private EditText fifthSemPointer;
    private EditText sixthSemPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_sixth);


        cgpaFifth = findViewById(R.id.totalCgpa6);

        firstSemPointer = findViewById(R.id.firstSemPointer6);
        secondSemPointer = findViewById(R.id.secondSemPointer6);
        thirdSemPointer = findViewById(R.id.thirdSemPointer6);
        fourthPointer = findViewById(R.id.fourthSemPointer6);
        fifthSemPointer = findViewById(R.id.fifthSemPointer6);
        sixthSemPointer = findViewById(R.id.sixthSemPointer6);

    }
    public void sixthSemCalculate(View view){
        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0 || thirdSemPointer.getText().length()==0 || fourthPointer.getText().length()==0 || fifthSemPointer.getText().length()==0|| sixthSemPointer.getText().length()==0){
            Toast.makeText(CgpaSixth.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());
            double sgpaThird = Double.parseDouble(thirdSemPointer.getText().toString());
            double sgpaFourth = Double.parseDouble(fourthPointer.getText().toString());
            double sgpaFifth = Double.parseDouble(fifthSemPointer.getText().toString());
            double sgpaSixth = Double.parseDouble(sixthSemPointer.getText().toString());

            if (sgpaFirst <= 10 && sgpaSecond <= 10 && sgpaThird <= 10 && sgpaFourth <= 10 && sgpaFifth <= 10 && sgpaSixth<=10) {
                double cgpaFourthCalculate = (sgpaFirst + sgpaSecond + sgpaThird + sgpaFourth + sgpaFifth +sgpaSixth ) / 6;
                cgpaFifth.setText(String.format(Locale.getDefault(), "%.2f", cgpaFourthCalculate));

            }
            else{
                Toast.makeText(CgpaSixth.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();
            }
        }
    }
}
