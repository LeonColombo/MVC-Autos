package com.example.itmaster.mvcautos.listeners;

import android.view.View;

import com.example.itmaster.mvcautos.interfaz.MainActivity;
import com.example.itmaster.mvcautos.models.Auto;

public class ListenerBtnGuardar implements View.OnClickListener {

    MainActivity context;

    public ListenerBtnGuardar(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        context.setUnAuto( new Auto());

        context.getUnAuto().setAnio(Integer.valueOf(context.getEdtAnio().getText().toString()));
        context.getUnAuto().setKm(Integer.valueOf(context.getEdtKms().getText().toString()));
        context.getUnAuto().setMarca(context.getEdtMarca().getText().toString());
        context.getUnAuto().setModelo(context.getEdtModelo().getText().toString());


        context.getControladorAuto().guardarAuto(context.getUnAuto());
    }
}
