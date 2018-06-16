package com.example.paras.cgpagpa;

import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class CgpaFirst extends AppCompatActivity {

    private TextView cgpaFirst;
    private EditText firstSemPointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_first);
        cgpaFirst = findViewById(R.id.totalCgpa1);
        firstSemPointer = findViewById(R.id.firstSemPointer);



    }

    public void firstSemCalculate(View view){
        if(firstSemPointer.getText().length()==0){
            Toast.makeText(CgpaFirst.this,"Enter Your Pointer",Toast.LENGTH_LONG).show();
        }
        else {
            double cgpap = Double.parseDouble(firstSemPointer.getText().toString());
            cgpaFirst.setText(String.format(Locale.getDefault(),"%.2f",cgpap));

        }
    }

}
