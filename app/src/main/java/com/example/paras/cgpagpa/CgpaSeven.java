package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaSeven extends AppCompatActivity {

    private TextView cgpaFifth;
    private EditText secondSemPointer;
    private EditText firstSemPointer;
    private EditText thirdSemPointer;
    private EditText fourthPointer;
    private EditText fifthSemPointer;
    private EditText sixthSemPointer;
    private EditText sevenSemPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_seven);

        cgpaFifth = findViewById(R.id.totalCgpa7);

        firstSemPointer = findViewById(R.id.firstSemPointer7);
        secondSemPointer = findViewById(R.id.secondSemPointer7);
        thirdSemPointer = findViewById(R.id.thirdSemPointer7);
        fourthPointer = findViewById(R.id.fourthSemPointer7);
        fifthSemPointer = findViewById(R.id.fifthSemPointer7);
        sixthSemPointer = findViewById(R.id.sixthSemPointer7);
        sevenSemPointer = findViewById(R.id.sevenSemPointer7);

    }

    public void sevenSemCalculate(View view){
        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0 || thirdSemPointer.getText().length()==0 || fourthPointer.getText().length()==0 || fifthSemPointer.getText().length()==0|| sixthSemPointer.getText().length()==0 || sevenSemPointer.getText().length()==0){
            Toast.makeText(CgpaSeven.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());
            double sgpaThird = Double.parseDouble(thirdSemPointer.getText().toString());
            double sgpaFourth = Double.parseDouble(fourthPointer.getText().toString());
            double sgpaFifth = Double.parseDouble(fifthSemPointer.getText().toString());
            double sgpaSixth = Double.parseDouble(sixthSemPointer.getText().toString());
            double sgpaSeven = Double.parseDouble(sevenSemPointer.getText().toString());

            if (sgpaFirst <= 10 && sgpaSecond <= 10 && sgpaThird <= 10 && sgpaFourth <= 10 && sgpaFifth <= 10 && sgpaSixth<=10 && sgpaSeven <=10) {
                double cgpaFourthCalculate = (sgpaFirst + sgpaSecond + sgpaThird + sgpaFourth + sgpaFifth +sgpaSixth + sgpaSeven ) / 7;
                cgpaFifth.setText(String.format(Locale.getDefault(), "%.2f", cgpaFourthCalculate));


            }
            else{
                Toast.makeText(CgpaSeven.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();
            }
        }
    }
}
