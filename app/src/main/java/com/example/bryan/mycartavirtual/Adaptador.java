package com.example.bryan.mycartavirtual;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter{


    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    //Retorna la cantidad de elementos de la lista
    public int getCount() {
        return ListaObjetos.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position); //permite retornar el objeto de la posicion indicada
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId(); //retorna el id de la posicion indicada
    }

    @Override
    //se ejecuta en cada secuencia en la cual se quiera cargar el contenido de cada item del list View

    //MEtodo para poder vinvular el layout dentro de un item de listView
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;

        LayoutInflater inflate = LayoutInflater.from(contexto); //obtenemos el contexto del item sobre el cual estamos trabajando
        vista = inflate.inflate(R.layout.itemlistview,null);//obtenemos la referencia al objeto inflate, que me va permitir el poder inyectar el layout dentro de la vista del listview

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView); //obtengo la referencia a la imagen
        TextView titulo = (TextView) vista.findViewById(R.id.textTitulo); // obtenemos la referencia al titulo
        TextView detalle = (TextView) vista.findViewById(R.id.txtDetalle);

        //Cargamos en el nuevo item generado la informacion del titulo y del detalle
        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getDetalle().toString());

        //Referenciamos la imagen
        imagen.setImageResource(ListaObjetos.get(position).getImagen());

        return vista;

    }
}
