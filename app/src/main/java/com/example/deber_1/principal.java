package com.example.deber_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view ){
        EditText Cedula =findViewById(R.id.cedula);
        EditText Nombre =findViewById(R.id.nombres);
        EditText Fecha =findViewById(R.id.fecha);
        EditText Ciudad =findViewById(R.id.ciudad);
        EditText Correo =findViewById(R.id.correo);
        EditText Telefono =findViewById(R.id.telefono);
        RadioButton Genero =findViewById(R.id.masculino);

        String cedula;
        String nombre;
        String fecha;
        String ciudad;
        String correo;
        String telefono;
        String genero;

        genero = Genero.isChecked() ?"Estimado":"Estimada";
        cedula = Cedula.getText().toString();
        nombre = Nombre.getText().toString();
        fecha = Fecha.getText().toString();
        ciudad = Ciudad.getText().toString();
        correo = Correo.getText().toString();
        telefono = Telefono.getText().toString();

        Intent intent = new Intent(principal.this, informacion.class);
        Bundle b = new Bundle();
        b.putString("NOMBRE", nombre);
        b.putString("CIUDAD", ciudad);
        b.putString("FECHA",fecha);
        b.putString("CORREO", correo);
        b.putString("GENERO", genero);
        b.putString("CEDULA", cedula);
        b.putString("TELEFONO", telefono);
        intent.putExtras(b);
        startActivity(intent);
   }
}