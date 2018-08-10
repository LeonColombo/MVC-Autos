package com.example.itmaster.mvcautos.DAO;

import com.example.itmaster.mvcautos.models.Auto;

import java.util.ArrayList;

public class DAOAuto {

    ArrayList<Auto> autoArrayList = new ArrayList<>();

    public void addAuto(Auto unAuto) {
        autoArrayList.add(unAuto);
    }


}
