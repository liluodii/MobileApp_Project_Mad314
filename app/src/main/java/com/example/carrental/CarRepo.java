package com.example.carrental;

import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.Collection;
import java.util.Iterator;

import java.util.ListIterator;

public class CarRepo {


    private static CarRepo instance = null;
    private List<Car> cars = new ArrayList<>();

    private CarRepo() //constructor
    {
        Car cr = new Car();
        cr.Name = "Honda Civik";
        cr.Model = "C001";
        cr.Price = 100;
        this.cars.add(cr);
    }

    public static CarRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new CarRepo();
        }
        return instance;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }


    public List<Car> getCars() {
        return this.cars ;
    }
}


