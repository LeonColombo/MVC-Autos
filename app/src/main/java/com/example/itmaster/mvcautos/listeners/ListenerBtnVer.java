package com.example.itmaster.mvcautos.listeners;

import android.view.View;

import com.example.itmaster.mvcautos.interfaz.MainActivity;

public class ListenerBtnVer implements View.OnClickListener {

    MainActivity context;

    public ListenerBtnVer(MainActivity context) {
        this.context = context;
    }
//Integer id = Integer.valueOf(context.getIdObtener().getText().toString());
//        if(id < context.getControladorPersona().cantidadPersonas()){
//            if (context.getControladorPersona().cantidadPersonas() != 0) {
//                context.setUnaPersona(context.getControladorPersona().getPersona(id));
//                context.getTxtNombre().setText(context.getUnaPersona().getNombre());
//                context.getTxtApellido().setText(context.getUnaPersona().getApellido());
//
//            } else {
//                Toast.makeText(context, "No hay personas", Toast.LENGTH_SHORT).show();
//            }
//        }else{
//            Toast.makeText(context, "Fuera de rango", Toast.LENGTH_SHORT).show();
//        }
//    }//
    @Override
    public void onClick(View view) {
        Integer id = Integer.valueOf(context.getEdtID().getText().toString());
        if (id < context.getControladorAuto().cantidadAutos()){
            if (context.getControladorAuto().cantidadAutos() !=0){

                context.setUnAuto(context.getControladorAuto().obtenerAuto(id));
                context.getEdtMarca().setText(context.getUnAuto().getMarca());
                context.getEdtAnio().setText(context.getUnAuto().getAnio().toString());
            }

        }

    }
}
