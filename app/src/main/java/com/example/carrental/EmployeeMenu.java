package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmployeeMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_menu);

        final Button btnaddcar=findViewById(R.id.btnaddcar);
        final Button btncustlist=findViewById((R.id.btnviewcustlist));
        final Button btnres_car_list=findViewById(R.id.btnviewcarlist);
        final Intent intent=new Intent(this,EmployeeAddCar.class);
        final Intent intent1=new Intent(this,CustomerDisplay.class);
        final Intent intent2=new Intent(this,ViewReservedCarList.class);


       btnaddcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        btncustlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
        btnres_car_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}
