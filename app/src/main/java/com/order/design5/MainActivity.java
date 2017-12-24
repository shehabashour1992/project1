package com.order.design5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;

    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.employee);
        btn2=findViewById(R.id.department);

    }


    public void employee(View view) {
        i=new Intent(MainActivity.this,Employee.class);
        startActivity(i);
    }

    public void department(View view) {
        i=new Intent(MainActivity.this,Department.class);
        startActivity(i);
    }
}
