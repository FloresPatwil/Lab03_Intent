package com.cdp.lab03_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtUsuario = findViewById(R.id.edtUsuario);
        EditText edtPassword = findViewById(R.id.edtPassword);
        TextView txtMensaje = findViewById(R.id.txtMensaje);
        Button btnLogin = (Button)findViewById(R.id.button);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();
                if(usuario.equals("1234") && password.equals("1234")){
                    Toast.makeText(getApplicationContext(), "Autenticacion valida", Toast.LENGTH_SHORT).show();
                    txtMensaje.setText("Autenticacion valida");
                    startActivity(new Intent(Activity_Login.this, Activity_Menu.class));
                }else{
                    txtMensaje.setText("Autenticacion invalida");
                    Toast.makeText(getApplicationContext(), "Autenticacion no valida", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}