package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaThird extends AppCompatActivity {

    private TextView cgpaThird;
    private EditText secondSemPointer;
    private EditText firstSemPointer;
    private EditText thirdSemPointer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_third);

        cgpaThird = findViewById(R.id.totalCgpa3);

        firstSemPointer = findViewById(R.id.firstSemPointer3);
        secondSemPointer = findViewById(R.id.secondSemPointer3);
        thirdSemPointer = findViewById(R.id.thirdSemPointer3);
    }
    public void thirdSemCalculate(View view){
        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0 || thirdSemPointer.getText().length()==0){
            Toast.makeText(CgpaThird.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else
        {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());
            double sgpaThird = Double.parseDouble(thirdSemPointer.getText().toString());
            if (sgpaFirst <= 10 && sgpaSecond <= 10 && sgpaThird <= 10) {
                double cgpaCalculate = (sgpaFirst + sgpaSecond + sgpaThird) / 3;

                cgpaThird.setText(String.format(Locale.getDefault(), "%.2f", cgpaCalculate));
            }else {
                Toast.makeText(CgpaThird.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();

            }

        }
    }

}
