package com.cdp.lab03_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Activity_PostulanteInfo extends AppCompatActivity {
    private List<Postulante> list;
    private Button btnSearch;
    private EditText searchDNI;
    private TextView dni,nombres,apellidos,fecha,colegio,carrera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_info);

        Intent i = getIntent();
        list = (List<Postulante>) i.getSerializableExtra("lista");
        btnSearch = findViewById(R.id.buttonBuscar);
        dni = findViewById(R.id.textDni);
        nombres = findViewById(R.id.textNombres);
        apellidos = findViewById(R.id.textApellidos);
        fecha = findViewById(R.id.textDate);
        colegio = findViewById(R.id.textColegio);
        carrera = findViewById(R.id.textCarrera);
        searchDNI = findViewById(R.id.textViewDni);
        btnSearch.setOnClickListener( view -> {
            String dni_text = searchDNI.getText().toString();
            Postulante postulante = buscarDNI(dni_text);
            if (postulante != null) {
                dni.setText(postulante.getDni());
                nombres.setText(postulante.getNombres());
                apellidos.setText(postulante.getApellidoMaterno());
                fecha.setText(postulante.getFechaNacimiento());
                colegio.setText(postulante.getColegio());
                carrera.setText(postulante.getCarrera());
            }else{
                dni.setText("---");
                nombres.setText("---");
                apellidos.setText("---");
                fecha.setText("---");
                colegio.setText("---");
                carrera.setText("---");
            }
        });
    }
    public Postulante buscarDNI(String dni){
        for(Postulante post : list)
            if(post.getDni().equals(dni)) return post;
        return null;
    }
}