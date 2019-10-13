package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = findViewById(R.id.Email);
        final TextView message=findViewById(R.id.message);
        final EditText password = findViewById(R.id.Password);
        final Button login = findViewById(R.id.SignIn);
        //final CheckBox cbUser = (CheckBox) view.findViewById(R.id.Customer);
        //final CheckBox cbEmployee = (CheckBox) view.findViewById(R.id.Employee);

        //cbUser.setChecked(!cbUser.isChecked());
        //cbEmployee.setChecked(!cbEmployee.isChecked());

        final Intent myIntent =new Intent(MainActivity.this,LoginPage.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("User") && password.getText().toString().equals("abc")) {
                    myIntent.putExtra("id", username.getText().toString());
                    startActivity(myIntent);

                } else {
                    message.setText("incorrect username or password");
                }

            }

        }

        );
    }
}



