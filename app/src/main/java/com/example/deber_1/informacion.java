package com.example.deber_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        TextView Datos = (TextView)findViewById(R.id.datos);
        Bundle bundle  = this.getIntent().getExtras();
        Datos.setText("Hola,"+bundle.getString("GENERO")+"\n"
                +"Tus nombres son:"+"  "+bundle.getString("NOMBRE")+"\n"
                +"Tu numero de cedula es:"+"  "+bundle.getString("CEDULA")+"\n"
                +"Tu fecha de nacimiento es:"+"  "+bundle.getString("FECHA")+"\n"
                +"Tu ciudad natal es:"+"  "+bundle.getString("CIUDAD")+"\n"
                +"Tu correo es:"+"  "+bundle.getString("CORREO")+"\n"
                +"Y tu telefono celular es:"+"  "+bundle.getString("TELEFONO")
        );
    }
}