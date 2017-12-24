package com.order.design5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Employee extends AppCompatActivity {

    EditText text1,text2,text3,text4,text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        text1=findViewById(R.id.editText1);//id
        text2=findViewById(R.id.editText2);//name
        text3=findViewById(R.id.editText3);//address
        text4=findViewById(R.id.editText4);//salary
        text5=findViewById(R.id.editText5);//job


    }

    public void submit(View view) {
        Intent i=new Intent(Employee.this,Out1.class);

        EmployeesClass s=new EmployeesClass(Integer.parseInt(text1.getText().toString()),text2.getText().toString(),
                text3.getText().toString(),Double.parseDouble(text4.getText().toString()),text5.getText().toString());


        i.putExtra("table",s);
        startActivity(i);

    }
}
