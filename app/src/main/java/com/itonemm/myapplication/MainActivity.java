package com.itonemm.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buAdd(View view) {

        Button btnselcted=(Button)view;

        EditText edt_num1=findViewById(R.id.edt_num1);

        EditText edt_num2=findViewById(R.id.edt_num2);

        String num1=edt_num1.getText().toString();
        String num2=edt_num2.getText().toString();

        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);

        int res=0;

        switch (btnselcted.getId())
        {
            case R.id.bumult:
                 res=findResult(n1,n2,'*');
                break;
            case R.id.busub:
                 res=findResult(n1,n2,'-')
                 ;break;
            case R.id.buadd:
                res=findResult(n1,n2,'+');break;
            case R.id.budivde:
                res=findResult(n1,n2,'/');break;
            default:
                res=0;

        }

        TextView txt_result=findViewById(R.id.txt_result);
        txt_result.setText(String.valueOf(res));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.homemenu:
                Toasty.success(getApplicationContext(),"Home Click",Toast.LENGTH_LONG).show();
                break;
            case R.id.helpmenu:
                Toasty.error(getApplicationContext(),"Help Click",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    public static int findResult(int x,int y,char op)
    {
        switch (op)
        {
            case '+':return x+y;
            case '-':return x-y;
            case '*':return  x*y;
            case '/':return  x/y;
        }
        return  0;
    }

}
