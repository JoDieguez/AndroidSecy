package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

public class AlertasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertas);
    }

    public void activarLuz(View view) {
        Snackbar.make(view, "Alerta Encendida", Snackbar.LENGTH_LONG)
                .setAction("Entendido", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Acción al presionar "Deshacer"
                    }
                }).show();
    }

    public void activarSonido(View view) {
        Snackbar.make(view, "Alerta Encendida", Snackbar.LENGTH_LONG)
                .setAction("Entendido", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Acción al presionar "Deshacer"
                    }
                }).show();
    }

    public void configAdicional(View view) {
        Intent intent = new Intent(this, CnfgAdicional.class);
        startActivity(intent);
    }
}
