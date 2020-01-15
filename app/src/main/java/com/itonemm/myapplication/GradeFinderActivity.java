package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cunoraz.gifview.library.GifView;


public class GradeFinderActivity extends AppCompatActivity {

    GifView gifView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_finder);
        gifView1 = (GifView)findViewById(R.id.result_img);
        gifView1.setVisibility(View.VISIBLE);
        gifView1.play();

    }

    public void buFindGrade(View view) {
        EditText edt_mark=findViewById(R.id.edt_mark);
        String str_mark=edt_mark.getText().toString();
        int mark=Integer.parseInt(str_mark);
        TextView txt_grade=findViewById(R.id.txt_grade);

        if(mark>=0 && mark<=100){



            if(mark>50 && mark<=70)
            {

                txt_grade.setText("C");
                gifView1.setGifResource(R.drawable.success);
            }
            else  if(mark>70 && mark<=80)
            {
                txt_grade.setText("B");
                gifView1.setGifResource(R.drawable.success);
            }
            else if(mark>80 && mark<=90)
            {
                txt_grade.setText("A");
                gifView1.setGifResource(R.drawable.success);

            }
            else if(mark>90 && mark<=100)
            {
                txt_grade.setText("Excellent");
                gifView1.setGifResource(R.drawable.excellentgif);

            }
            else
            {


                txt_grade.setText("Fail");
                gifView1.setGifResource(R.drawable.failgif);
            }



        }
        else
        {
            Toast.makeText(getApplicationContext(),"Not In Range",Toast.LENGTH_LONG).show();
        }

    }
}
