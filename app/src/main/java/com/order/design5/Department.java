package com.order.design5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Department extends AppCompatActivity {

    EditText numb,name,des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        numb=findViewById(R.id.numb);//number
        name=findViewById(R.id.name);//name
        des=findViewById(R.id.des);//destination
    }

    public void submit2(View view) {
        Intent i =new Intent();
        DepartmentClass d=new DepartmentClass(Integer.parseInt(numb.getText().toString()),name.getText().toString(),des.getText().toString());

        i.putExtra("data",d);
        startActivity(i);

    }
}
