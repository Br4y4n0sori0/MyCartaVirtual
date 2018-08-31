package com.example.bryan.mycartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class EntradasActivity extends Activity {

    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Datos>(); //inicializamos la lista

        Lista.add(new Datos(1,"Ceviche de mango","Este refrescante ceviche de mango se prepara con mangos frescos, cebolla colorada, jugo de limón, jugo de naranja, ajíes o chiles (puede ser habanero, fresno, amarillo, ají común, etc), cilantro, y sal.",R.drawable.ceiche));
        Lista.add(new Datos(2,"Nachos con queso","Deliciosa entrada con frituras de harina con polvo de queso, junto a un delicioso guacamole hecho con aguacate, limon, sal, crema de leche.",R.drawable.nachos));
        Lista.add(new Datos(3,"Croquetas de zanahoria","Croquetas de zanahoria con salsa de tomate, deliciosas y rellenas de queso chedar",R.drawable.croquetas));


        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //obj tendra el objetivo selecciona con toda la información
                Datos obj = (Datos) parent.getItemAtPosition(position);

                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto",(Serializable) obj); //serializamos el objeto dentro del campo llamado objeto
                startActivity(paso);

            }
        });


    }
}

