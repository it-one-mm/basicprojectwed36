package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DialogTest extends AppCompatActivity {

   static TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_test);
        txtresult=findViewById(R.id.txttimeresult);
    }

    public void buShow(View view) {

        PopUp mypopup=new PopUp();
        mypopup.show(getSupportFragmentManager(),"Show PopUp");
    }
}
