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

import org.w3c.dom.Text;

import java.util.Calendar;

public class Book extends AppCompatActivity {
    private static final String TAG="Book";
    public DatePickerDialog.OnDateSetListener mDatesetListner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        final Button btnbooknow=findViewById(R.id.btnbooknow);
       final TextView startdate=findViewById(R.id.tvstartdate);
       final TextView enddate=findViewById(R.id.tvenddate);
        final Button btnok=findViewById(R.id.btnok);
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
        mDatesetListner=new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker,int year,int month,int day)
            {
                month=month+1;
                Log.d(TAG,"onDateset :mm/dd/yyyy:"+month+"/"+day+"/"+year);
                String date=month+"/"+day+"/"+year;
                startdate.setText(date);
            }

        };
    }

}
