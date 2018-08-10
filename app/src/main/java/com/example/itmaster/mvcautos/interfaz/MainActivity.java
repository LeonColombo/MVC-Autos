package com.example.itmaster.mvcautos.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import com.example.itmaster.mvcautos.R;
import com.example.itmaster.mvcautos.controllers.ControladorAuto;
import com.example.itmaster.mvcautos.listeners.ListenerBtnGuardar;
import com.example.itmaster.mvcautos.listeners.ListenerBtnVer;
import com.example.itmaster.mvcautos.models.Auto;

public class MainActivity extends AppCompatActivity {

    private EditText edtModelo, edtMarca, edtAnio, edtKms, edtID;
    private Button btnGuardar, btnVer;
    private ListenerBtnGuardar listenerBtnGuardar;
    private ListenerBtnVer listenerBtnVer;
    private Auto unAuto;

    private ControladorAuto controladorAuto = new ControladorAuto();

    public EditText getEdtModelo() {
        return edtModelo;
    }

    public void setEdtModelo(EditText edtModelo) {
        this.edtModelo = edtModelo;
    }

    public EditText getEdtMarca() {
        return edtMarca;
    }

    public void setEdtMarca(EditText edtMarca) {
        this.edtMarca = edtMarca;
    }

    public EditText getEdtAnio() {
        return edtAnio;
    }

    public void setEdtAnio(EditText edtAnio) {
        this.edtAnio = edtAnio;
    }

    public EditText getEdtKms() {
        return edtKms;
    }

    public void setEdtKms(EditText edtKms) {
        this.edtKms = edtKms;
    }

    public Button getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(Button btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public Button getBtnVer() {
        return btnVer;
    }

    public void setBtnVer(Button btnVer) {
        this.btnVer = btnVer;
    }

    public ListenerBtnGuardar getListenerBtnGuardar() {
        return listenerBtnGuardar;
    }

    public void setListenerBtnGuardar(ListenerBtnGuardar listenerBtnGuardar) {
        this.listenerBtnGuardar = listenerBtnGuardar;
    }

    public ListenerBtnVer getListenerBtnVer() {
        return listenerBtnVer;
    }

    public void setListenerBtnVer(ListenerBtnVer listenerBtnVer) {
        this.listenerBtnVer = listenerBtnVer;
    }

    public Auto getUnAuto() {
        return unAuto;
    }

    public void setUnAuto(Auto unAuto) {
        this.unAuto = unAuto;
    }

    public ControladorAuto getControladorAuto() {
        return controladorAuto;
    }

    public void setControladorAuto(ControladorAuto controladorAuto) {
        this.controladorAuto = controladorAuto;
    }

    public EditText getEdtID() {
        return edtID;
    }

    public void setEdtID(EditText edtID) {
        this.edtID = edtID;
    }
    //***********************************************************************************************//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtModelo = findViewById(R.id.edtModelo);
        edtMarca = findViewById(R.id.edtMarca);
        edtAnio = findViewById(R.id.edtAnio);
        edtKms = findViewById(R.id.edtKms);
        edtID = findViewById(R.id.edtID);


        btnGuardar = findViewById(R.id.btnGuardar);
        btnVer = findViewById(R.id.btnVer);


        listenerBtnGuardar = new ListenerBtnGuardar(this);
        btnGuardar.setOnClickListener(listenerBtnGuardar);
        //*//
        listenerBtnVer = new ListenerBtnVer(this);
        btnVer.setOnClickListener(listenerBtnVer);




    }
}
