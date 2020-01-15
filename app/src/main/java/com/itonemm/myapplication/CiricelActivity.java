package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class CiricelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciricel);
        final EditText edt_radius=findViewById(R.id.circle_radius);
        final TextView txt_area=findViewById(R.id.circle_area);

        edt_radius.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                        String radius=s.toString();
                        try {
                            int r = Integer.parseInt(radius);
                            double area = 3.142 * Math.pow(r, 2);
                            txt_area.setText("A=" + String.valueOf(area));
                        }
                        catch (Exception ex)
                        {
                            txt_area.setText("A=0");

                        }


                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                }
        );
    }
}
