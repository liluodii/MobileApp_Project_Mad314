package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeAddCar extends AppCompatActivity {
    Button btn;
    EditText brand,type,model,color,year,Lplate,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_add_car);
         brand=findViewById(R.id.etBrand);
         type=findViewById(R.id.etType);
        model=findViewById(R.id.etModel);
         color=findViewById(R.id.etColor);
         year=findViewById(R.id.etYear);
        Lplate= findViewById(R.id.etLP);
         price=findViewById(R.id.etprice);
         btn=findViewById(R.id.btnAdd);
          final CarListView carListView=new CarListView();
        btn.setOnClickListener(new View.OnClickListener() {

            final TextView msg=findViewById(R.id.txtmsg);
            final String Brand=brand.getText().toString();
            final String Type=type.getText().toString();
            final String Model=model.getText().toString();
            final String Color=color.getText().toString();
            final String Year=year.getText().toString();
            final String LPlate=Lplate.getText().toString();
            final String Price=price.getText().toString();
            final int image1=R.drawable.bmw;
            @Override
            public void onClick(View v) {
                Car car=new Car(Brand,Type,Model,Color,Year,LPlate,Price,image1);
                msg.setText("CAR SUCCESFULLY ADDED");

            }
        });


    }
}
