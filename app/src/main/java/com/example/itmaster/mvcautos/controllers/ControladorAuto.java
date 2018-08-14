package com.example.itmaster.mvcautos.controllers;

import com.example.itmaster.mvcautos.DAO.DAOAuto;
import com.example.itmaster.mvcautos.models.Auto;

public class ControladorAuto {

    DAOAuto daoAuto = new DAOAuto();

    public void guardarAuto(Auto unAuto) {
    daoAuto.addAuto(unAuto);

    }

    public Integer cantidadAutos(){
        return daoAuto.CantAutos();
    }

    //
    //    public Persona getPersona(Integer i){
    //        return daoPersona.getPersona(i);
    //    }//

    public Auto obtenerAuto (Integer i){

        return daoAuto.obtenerAuto(i);

    }
}
