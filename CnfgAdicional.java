package com.example.login;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;

public class CnfgAdicional extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config);
    }

    public void dispositivos(View view) {
        Intent intent = new Intent(this, BaseDatos.class);
        startActivity(intent);
    }
}




