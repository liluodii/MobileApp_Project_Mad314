package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;


import java.text.DateFormat;
import java.util.Calendar;

public class Book extends AppCompatActivity {
    private static final String TAG="Book";
    public DatePickerDialog.OnDateSetListener mDatesetListner;
    public DatePickerDialog.OnDateSetListener mDatesetListner1;
<<<<<<< HEAD
<<<<<<< HEAD
 /*public String yearcurr,daycurr,monthcurr, yeardate,daydate,monthdate,yeardate1,daydate1,monthdate1;*/
=======
<<<<<<< HEAD
 /*public String yearcurr,daycurr,monthcurr, yeardate,daydate,monthdate,yeardate1,daydate1,monthdate1;*/
=======
>>>>>>> 536c863dffefa4a0aceedbc22dddef878cfbf28e
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
=======
>>>>>>> parent of 4bc2158... Final Project Submit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
        final ReservationRepo reservationRepo =ReservationRepo.getInstance();
        final Button btnbooknow = findViewById(R.id.btnbooknow);
        final TextView startdate = findViewById(R.id.tvstartdate);
        final TextView enddate = findViewById(R.id.tvenddate);
        final Button btnok = findViewById(R.id.btnok);
        final TextView msg=findViewById(R.id.tvmsg);
        final Intent intent1 = getIntent();
        final Intent okintent=new Intent(this,OrderDisp.class);
<<<<<<< HEAD
=======
=======
=======
>>>>>>> parent of 4bc2158... Final Project Submit
        final Button btnbooknow=findViewById(R.id.btnbooknow);
       final TextView startdate=findViewById(R.id.tvstartdate);
       final TextView enddate=findViewById(R.id.tvenddate);
        final Button btnok=findViewById(R.id.btnok);
<<<<<<< HEAD
>>>>>>> 536c863dffefa4a0aceedbc22dddef878cfbf28e
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
=======
>>>>>>> parent of 4bc2158... Final Project Submit
        btnbooknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH)+1;
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String date = month + "/" + day + "/" + year;
              /*  yearcurr = String.valueOf(Calendar.YEAR);
                monthcurr = String.valueOf(Calendar.MONTH);
                daycurr = String.valueOf(Calendar.DAY_OF_MONTH);*/
<<<<<<< HEAD
=======
=======
=======
>>>>>>> parent of 4bc2158... Final Project Submit
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                String date=month+"/"+day+"/"+year;
<<<<<<< HEAD
>>>>>>> 536c863dffefa4a0aceedbc22dddef878cfbf28e
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
=======
>>>>>>> parent of 4bc2158... Final Project Submit
                startdate.setText(date);
            }
        });
        startdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(
                        Book.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDatesetListner,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        enddate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

              /*  yeardate1 = String.valueOf(Calendar.YEAR);
                monthdate1 = String.valueOf(Calendar.MONTH);
                daydate1 = String.valueOf(Calendar.DAY_OF_MONTH);*/


                /*try {
                    SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
                    Date date1 = sdf.parse(monthdate + "/" + daydate + "/" + yeardate);
                    //   Date currDate=sdf.parse(monthcurr+"/"+daycurr+"/"+yearcurr);
                    Date date2 = sdf.parse(monthdate1 + "/" + daydate1 + "/" + yeardate1);
<<<<<<< HEAD


                    if (date2.before(date1)) {
                        Log.i(TAG, "END DATE BEFORE STARTDATE");
                        enddate.setText("");
                    }

                } catch (ParseException ex) {
                    Log.i(TAG, "PARSE EXCEPTION");

                }*/
                DatePickerDialog dialog = new DatePickerDialog(
=======
=======
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
>>>>>>> parent of 4bc2158... Final Project Submit


                DatePickerDialog dialog=new DatePickerDialog(
                        Book.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDatesetListner1,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD
        mDatesetListner = new DatePickerDialog.OnDateSetListener() {
=======
        enddate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
                        Book.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDatesetListner1,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();


            }
        });
<<<<<<< HEAD
        mDatesetListner = new DatePickerDialog.OnDateSetListener() {
=======
        mDatesetListner=new DatePickerDialog.OnDateSetListener()
        {
>>>>>>> 536c863dffefa4a0aceedbc22dddef878cfbf28e
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
=======
        mDatesetListner=new DatePickerDialog.OnDateSetListener()
        {
>>>>>>> parent of 4bc2158... Final Project Submit
            @Override
            public void onDateSet(DatePicker datePicker,int year,int month,int day)
            {
                month=month+1;
                Log.d(TAG,"onDateset :mm/dd/yyyy:"+month+"/"+day+"/"+year);
                String date=month+"/"+day+"/"+year;
                startdate.setText(date);

<<<<<<< HEAD
            }

        };
        mDatesetListner1=new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker,int year,int month,int day)
            {
                month=month+1;
                Log.d(TAG,"onDateset :mm/dd/yyyy:"+month+"/"+day+"/"+year);
                String date=month+"/"+day+"/"+year;
                enddate.setText(date);


            }

        };


    }
<<<<<<< HEAD
=======
            }

        };
        mDatesetListner1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateset :mm/dd/yyyy:" + month + "/" + day + "/" + year);
                String date = month + "/" + day + "/" + year;
                enddate.setText(date);

            }

        };
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Brand  = intent1.getExtras().getString("Brand");
                final String Type = intent1.getExtras().getString("Type");
                final String Model = intent1.getExtras().getString("Model");
                final String Color = intent1.getExtras().getString("Color");
                final String Year = intent1.getExtras().getString("Year");
                final String LicensePlate = intent1.getExtras().getString("Lplate");
                final String Price = intent1.getExtras().getString("Price");
                final int image = intent1.getExtras().getInt("image");
                String sdate= startdate.getText().toString();
                String edate=enddate.getText().toString();

                Reservation reservation=new Reservation(Brand,Type,Model,Color,Year,LicensePlate,Price,image,sdate,edate);
                reservationRepo.addReservation(reservation);
                msg.setText("ORDER RESERVATION SUCCESSFUL");
                startActivity(okintent);

<<<<<<< HEAD
            }
        });

=======
>>>>>>> 536c863dffefa4a0aceedbc22dddef878cfbf28e
>>>>>>> 89f82ab71ea2e2785e05bfb251933bd31be4b49e
    }
    }
=======
>>>>>>> parent of 4bc2158... Final Project Submit

}
