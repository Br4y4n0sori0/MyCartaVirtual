package com.example.bryan.mycartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class BebidasActivity extends Activity {
    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        listaDatos = (ListView) findViewById(R.id.lstDatosBebidas);

        Lista = new ArrayList<Datos>(); //inicializamos la lista

        Lista.add(new Datos(1,"Ceviche","Este refrescante ceviche de mango se prepara con mangos frescos, cebolla colorada, jugo de limón, jugo de naranja, ajíes o chiles (puede ser habanero, fresno, amarillo, ají común, etc), cilantro, y sal.",R.drawable.ceiche));
        Lista.add(new Datos(2,"Ceviche2","Este refrescante ceviche de mango se prepara con mangos frescos, cebolla colorada, jugo de limón, jugo de naranja, ajíes o chiles (puede ser habanero, fresno, amarillo, ají común, etc), cilantro, y sal.",R.drawable.cebolla));


//ejecute y mire si cuando le aaa espere se detuvo cuando le di click a platos  aaa sisas espere
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
