package com.order.design5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Out2 extends AppCompatActivity {
TextView text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out2);

        text1=findViewById(R.id.numb);
        text2=findViewById(R.id.name);
        text3=findViewById(R.id.des);

        Intent i=getIntent();
        DepartmentClass d= (DepartmentClass) getIntent().getSerializableExtra("data");

        text1.setText(d.toString());
        text2.setText(d.toString());
        text3.setText(d.toString());
    }
}
