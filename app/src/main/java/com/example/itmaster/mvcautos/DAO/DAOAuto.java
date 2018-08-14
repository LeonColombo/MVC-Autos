package com.example.itmaster.mvcautos.DAO;

import com.example.itmaster.mvcautos.models.Auto;

import java.util.ArrayList;

public class DAOAuto {

    ArrayList<Auto> autoArrayList = new ArrayList<>();

    public void addAuto(Auto unAuto) {
        autoArrayList.add(unAuto);
    }

    public Integer CantAutos() {
        return autoArrayList.size();
    }
//public Persona getPersona(Integer i){
//        return personaArrayList.get(i);
//    }//

    public Auto obtenerAuto(Integer i) {
        return autoArrayList.get(i) ;
    }
}
