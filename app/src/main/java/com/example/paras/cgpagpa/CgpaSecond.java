package com.example.paras.cgpagpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaSecond extends AppCompatActivity {

    private TextView cgpaSecond;
    private EditText secondSemPointer;
    private EditText firstSemPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_second);
        cgpaSecond = findViewById(R.id.totalCgpa2);
        secondSemPointer = findViewById(R.id.secondSemPointer);
        firstSemPointer = findViewById(R.id.firstSemPointer2);

    }

    public void secondSemCalculate(View view){

        if(firstSemPointer.getText().length()==0 || secondSemPointer.getText().length()==0){
            Toast.makeText(CgpaSecond.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else
        {
            double sgpaFirst = Double.parseDouble(firstSemPointer.getText().toString());
            double sgpaSecond = Double.parseDouble(secondSemPointer.getText().toString());

            if (sgpaFirst <= 10 && sgpaSecond <= 10) {
                double cgpaCalculate = (sgpaFirst + sgpaSecond) / 2;
                cgpaSecond.setText(String.format(Locale.getDefault(), "%.2f", cgpaCalculate));
            }
            else{
                Toast.makeText(CgpaSecond.this,"Pointer should be equal or less than 10",Toast.LENGTH_LONG).show();

            }

        }



    }
}
