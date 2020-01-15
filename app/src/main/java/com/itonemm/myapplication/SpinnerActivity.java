package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayList<String> month=new ArrayList<>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,month);
        spinner.setAdapter(arrayAdapter);

    }
}
