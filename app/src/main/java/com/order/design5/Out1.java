package com.order.design5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Out1 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out1);

        text1=findViewById(R.id.text1);//id
        text2=findViewById(R.id.text2);//name
        text3=findViewById(R.id.text3);//address
        text4=findViewById(R.id.text4);//salary
        text5=findViewById(R.id.text5);//job


        Intent i=getIntent();
        EmployeesClass e= (EmployeesClass) getIntent().getSerializableExtra("table");

        text1.setText(e.toString());
        text2.setText(e.toString());
        text3.setText(e.toString());
        text4.setText(e.toString());
        text5.setText(e.toString());
    }
}
