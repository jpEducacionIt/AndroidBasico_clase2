package com.example.clase11_loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button botonCrearUsuario, botonLogin;
    EditText nombreUsuario, password;
    String nombre, passwordUser;
    Boolean isLoged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCrearUsuario = findViewById(R.id.botonCrear);
        botonLogin = findViewById(R.id.botonIniciar);
        nombreUsuario = findViewById(R.id.etUsuario);
        password = findViewById(R.id.etContraseña);

        botonCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guardarUsuario = nombreUsuario.getText().toString();
                String guardarPassword = password.getText().toString();
                if (!guardarUsuario.equals("") && !guardarPassword.equals("")) {
                    nombre = guardarUsuario;
                    passwordUser = guardarPassword;

                } else {
                    Toast.makeText(MainActivity.this, "Faltan datos completar", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityDetalle.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("password", passwordUser);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
