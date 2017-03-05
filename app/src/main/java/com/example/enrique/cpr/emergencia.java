package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by Enrique on 3/5/2017.
 */

public class emergencia extends AppCompatActivity  implements View.OnClickListener  {
    Button back;
    Button menu;
    Button proteger;
    Button alertar;
    Button socorrer;
    /*Intent intent = new Intent(this, infobasica.class);
    startActivity(intent);*/
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergencia);
        back = (Button) findViewById(R.id.back);
        menu = (Button) findViewById(R.id.menu);
        proteger = (Button) findViewById(R.id.proteger);
        alertar = (Button) findViewById(R.id.alert);
        socorrer = (Button) findViewById(R.id.soco);
        back.setOnClickListener(this);
        menu.setOnClickListener(this);
        proteger.setOnClickListener(this);
        alertar.setOnClickListener(this);
        socorrer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()) {
            /*Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);*/
            finish();
        }
        else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        else if (id == proteger.getId()) {
           /* Intent intent = new Intent(this, prote.class);
            startActivity(intent);*/
        }
        else if (id == alertar.getId()) {

        }
        else if (id == socorrer.getId()) {
            Intent intent = new Intent(this, socs.class);
            startActivity(intent);
        }


    }
}
