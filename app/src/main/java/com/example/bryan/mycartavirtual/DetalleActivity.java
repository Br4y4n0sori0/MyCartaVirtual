package com.example.bryan.mycartavirtual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends Activity {

    ImageView foto;
    TextView titulo;
    TextView detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Referenciamos
        foto = (ImageView) findViewById(R.id.imgFoto);
        titulo = (TextView) findViewById(R.id.txtTitulo);
        detalle = (TextView) findViewById(R.id.txtDetalle);

        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");


        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImagen());


    }
}
