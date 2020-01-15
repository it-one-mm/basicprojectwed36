package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class CheckBoxTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_test);
    }

    public void buCheck(View view) {
        CheckBox chb=findViewById(R.id.chbstatus);
        RadioButton rbtmale=findViewById(R.id.rbtmale);
        RadioButton rbfeamle=findViewById(R.id.rbtfemale);
        Switch swgrad=findViewById(R.id.swgrad);
        TextView txtresult=findViewById(R.id.txtresult);
        StringBuffer str=new StringBuffer();
        if(chb.isChecked())
        {
            str.append("Person is Married!");
        }
        else
        {
            str.append("Person is not Married!");
        }
        if(rbtmale.isChecked())
        {
            str.append("He is Male");
        }
        else
        {
            str.append("She is Female");
        }
        if(swgrad.isChecked())
        {
            str.append("Person is Graduated");
        }
        else
        {
            str.append("Person is not Graduated");
        }
        txtresult.setText(str.toString());
    }
}
