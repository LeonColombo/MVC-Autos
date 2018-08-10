package com.example.itmaster.mvcautos.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.mvcautos.R;

public class MainActivity extends AppCompatActivity {

    private EditText edtModelo, edtMarca, edtAnio, edtKms;
    private Button btnGuardar, btnVer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtModelo = findViewById(R.id.edtModelo);
        edtMarca = findViewById(R.id.edtMarca);
        edtAnio = findViewById(R.id.edtAnio);
        edtKms = findViewById(R.id.edtKms);



    }
}
