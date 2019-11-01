package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Car_Activity extends AppCompatActivity {

    public TextView tvBrand, tvType, tvModel, tvColor, tvYear,tvLicenseplate;
    public ImageView img;
    public Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_);

        tvBrand = (TextView) findViewById(R.id.tvBrand);
        tvType = (TextView) findViewById(R.id.tvType);
        tvModel = (TextView) findViewById(R.id.tvModel);
        tvColor = (TextView) findViewById(R.id.tvColor);
        tvYear = (TextView) findViewById(R.id.tvYear);
        tvLicenseplate = (TextView) findViewById(R.id.tvLicplt);
        img = (ImageView) findViewById(R.id.Carimage);
        book=findViewById(R.id.btnbook);
        final Intent intent = getIntent();
        final Intent bookintent=new Intent(this,Book.class);
        String Brand  = intent.getExtras().getString("Brand");
        String Type = intent.getExtras().getString("Type");
        String Model = intent.getExtras().getString("Model");
        String Color = intent.getExtras().getString("Color");
        String Year = intent.getExtras().getString("Year");
        String LicensePlate = intent.getExtras().getString("License_Plate");
        int image = intent.getExtras().getInt("Image");

        tvBrand.setText(Brand);
        tvType.setText(Type);
        tvModel.setText(Model);
        tvColor.setText(Color);
        tvYear.setText(Year);
        tvLicenseplate.setText(LicensePlate);
        img.setImageResource(image);

       book.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(bookintent);


           }
       });
    };
}