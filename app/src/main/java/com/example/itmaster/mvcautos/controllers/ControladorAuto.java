package com.example.itmaster.mvcautos.controllers;

import com.example.itmaster.mvcautos.DAO.DAOAuto;
import com.example.itmaster.mvcautos.models.Auto;

public class ControladorAuto {

    DAOAuto daoAuto = new DAOAuto();

    public void guardarAuto(Auto unAuto) {
    daoAuto.addAuto(unAuto);

    }
}
