package com.cdp.lab03_intent;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Activity_Menu extends AppCompatActivity {

    private List<Postulante> listaPostulantes = new ArrayList<>();
    private ActivityResultLauncher<Intent> registerActivityResultLauncher;
    private Button nuevoButton, buttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        nuevoButton = findViewById(R.id.button3);//button NUEVO
        buttonInfo = findViewById(R.id.button4);//button INFO
        registerActivityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK){
                        Intent data = result.getData();
                        if (data != null){
                            Postulante post = (Postulante)data.getSerializableExtra("postulante");
                            listaPostulantes.add(post);
                        }
                    }
                }
        );
        nuevoButton.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Menu.this, Activity_PostulanteRegistro.class);
            registerActivityResultLauncher.launch(intent);
        });
        buttonInfo.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Menu.this, Activity_PostulanteInfo.class);
            intent.putExtra("lista", (Serializable) listaPostulantes);
            startActivity(intent);
        });
    }
}