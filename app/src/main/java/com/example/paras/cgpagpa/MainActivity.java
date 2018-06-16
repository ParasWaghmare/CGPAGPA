package com.example.paras.cgpagpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button gpaBtn;
    private Button cgpaBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gpaBtn  = findViewById(R.id.btn_gpa);
        cgpaBtn = findViewById(R.id.btn_cgpa);

        gpaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gpaIntent =  new Intent(MainActivity.this,GpaCalculation.class);
                startActivity(gpaIntent);
            }
        });

        cgpaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cgpaIntent =  new Intent(MainActivity.this,CgpaCalculation.class);
                startActivity(cgpaIntent);

            }
        });



    }
}
