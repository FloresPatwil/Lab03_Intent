package com.cdp.lab03_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_PostulanteRegistro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_registro);
        EditText edtDni = findViewById(R.id.dni);
        EditText edtApellidoMaterno = findViewById(R.id.editTextApellidoMaterno);
        EditText edtNombres= findViewById(R.id.editTextNombres);
        EditText edtFechaNacimiento = findViewById(R.id.editTextFechaNacimiento);
        EditText edtColegio = findViewById(R.id.editTextColegio);
        EditText edtCarrera = findViewById(R.id.editTextCarrera);

        Button btnEnviar = findViewById(R.id.buttonEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dni = edtDni.getText().toString();
                String apellidoMaterno = edtApellidoMaterno.getText().toString();
                String nombres = edtNombres.getText().toString();
                String fechaNacimiento = edtFechaNacimiento.getText().toString();
                String colegio = edtColegio.getText().toString();
                String carrera = edtCarrera.getText().toString();

                //Nuevo postulante
                Postulante postulante = new Postulante(dni,apellidoMaterno,nombres,fechaNacimiento,colegio,carrera);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("postulante",postulante);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}