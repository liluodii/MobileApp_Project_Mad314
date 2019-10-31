package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CarListView extends AppCompatActivity {

    List<Car> carList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list_view);

        carList = new ArrayList<>();
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creat","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));
        carList.add(new Car("Hyundai","Creta","SX Diesel","White","2018","ABC146",R.drawable.hyundaicreta));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        CarAdapter mAdapter = new CarAdapter(this,carList);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(mAdapter);



    }
}
