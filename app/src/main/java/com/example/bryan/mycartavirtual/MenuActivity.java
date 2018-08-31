package com.example.bryan.mycartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.io.Serializable;

public class MenuActivity extends Activity {

    private String [] productos = new String[]{"Entradas","Platos Fuertes", "Bebidas", "Postres"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //obtenemos referencia a la lista
        ListView lv = findViewById(android.R.id.list); //permite encontrar una vista por su id y lo almacena en la variable Lv
        ListAdapter la = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,productos); //cree un adaptador para cargar el contenido a list view, el adaptador hace un arreglo de string que esta en el objeto actual que esta en la plantilla para pintar el contenido y finalmente el contenido como tal que esta en el vector de string's
        lv.setAdapter(la); //se le asigna a la lista el contenido. Creara un elementos por cada uno de los productos


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //obj tendra el objetivo selecciona con toda la información
                //Datos obj = (Datos) parent.getItemAtPosition(position);

                Intent paso;
                switch (position) {

                    case 0: paso = new Intent(getApplicationContext(), EntradasActivity.class);
                        startActivity(paso);
                        break;

                    case 1: paso = new Intent(getApplicationContext(), PFuertesActivity.class);
                        startActivity(paso);
                        break;

                    case 2: paso = new Intent(getApplicationContext(), BebidasActivity.class);
                        startActivity(paso);
                        break;

                    case 3: paso = new Intent(getApplicationContext(), PostresActivity.class);
                        startActivity(paso);
                        break;




                }

                // Intent paso = new Intent(getApplicationContext(), EntradasActivity.class);
                // paso.putExtra("objeto",(Serializable) ); //serializamos el objeto dentro del campo llamado objeto
                // startActivity(paso);

            }
        });


    }
}
