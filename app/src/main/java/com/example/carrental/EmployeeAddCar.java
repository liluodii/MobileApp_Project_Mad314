package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeAddCar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_add_car);
        final EditText brand=findViewById(R.id.etBrand);
        final EditText type=findViewById(R.id.etType);
        final EditText model=findViewById(R.id.etModel);
        final EditText color=findViewById(R.id.etColor);
        final EditText year=findViewById(R.id.etYear);
        final EditText Lplate= findViewById(R.id.etLP);
        final Button btnadd=findViewById(R.id.btnaddcar);
        final TextView msg=findViewById(R.id.txtmsg);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Brand=brand.getText().toString();
                String Type=type.getText().toString();
                String Model=model.getText().toString();
                String Color=color.getText().toString();
                String Year=year.getText().toString();
                String LPlate=Lplate.getText().toString();
             // String image1="abc.jpg";

            }
        });
        msg.setText("CAR SUCCESFULLY ADDED");

    }
}
