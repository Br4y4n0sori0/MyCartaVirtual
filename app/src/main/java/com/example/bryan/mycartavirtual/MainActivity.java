package com.example.bryan.mycartavirtual;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.drawable.degradado);


    }

    void VerMapa (View v){

        Intent intencion  = new Intent(  this, MapsActivity.class);
        startActivity(intencion);
    }

    void VerMenu (View v){

        Intent intencion  = new Intent(  this, MenuActivity.class);
        startActivity(intencion);
    }

    void HacerReserva (View v){
        Intent _intencion = new Intent("android.intent.action.MAIN");
        _intencion.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
        _intencion.putExtra("jid", PhoneNumberUtils.stripSeparators("573" + 300423748)+"@s.whatsapp.net");
        _intencion.setAction(Intent.ACTION_SEND);
        _intencion.putExtra(Intent.EXTRA_TEXT, "Hello world!");
        _intencion.setType("plain/text");
        startActivity(_intencion);








    }
}
