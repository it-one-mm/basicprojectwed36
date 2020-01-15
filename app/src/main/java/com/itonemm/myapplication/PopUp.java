package com.itonemm.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PopUp extends DialogFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.timepickertest,container,false);

        final TimePicker timePicker=view.findViewById(R.id.tp);
        Button btndone=view.findViewById(R.id.budone);
        btndone.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        String selectedtime=timePicker.getHour()+":"+timePicker.getMinute();
                        DialogTest.txtresult.setText(selectedtime);
                        dismiss();
                    }
                }
        );
        return view;
    }
}
