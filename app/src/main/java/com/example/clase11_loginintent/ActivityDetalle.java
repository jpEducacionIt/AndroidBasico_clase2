package com.example.clase11_loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityDetalle extends AppCompatActivity {

    TextView tvNombre, tvPass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String password = intent.getStringExtra("password");

        tvNombre = findViewById(R.id.textViewNombre);
        tvPass = findViewById(R.id.textViewPassword);
        button = findViewById(R.id.boton2);

        tvNombre.setText(nombre);
        tvPass.setText(password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
