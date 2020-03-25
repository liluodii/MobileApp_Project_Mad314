package com.example.carrental;


import android.media.Image;

public class Car {

    private String Brand;
    private String Type;
    private String Model;
    private String Color;
    private String Year;
    private String LicensePlate;
    private int Image;


    // public Car(String creta, String hyundai, String sx_diesel, String white, int i, String s) {
    // }

    public Car(String brand, String type, String model, String color, String year, String licensePlate,int image) {
        Type = type;
        Brand = brand;
        Model = model;
        Color = color;
        Year = year;
        LicensePlate = licensePlate;
        Image = image;
    }

    public String getType() {
        return Type;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public String getYear() {
        return Year;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public int getImage() {
        return Image;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public void setImage(int image) {
        Image = image;
    }
}


