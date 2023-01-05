package com.example.enrique.cpr.consciente;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.enrique.cpr.MainActivity;
import com.example.enrique.cpr.R;

/**
 * Created by Enrique on 3/5/2017.
 */

public class consciente extends AppCompatActivity implements View.OnClickListener{
    Button calor;
    Button quemaduras;
    Button atragamiento;
    Button hemorragia;
    Button herida;
    Button envenenamiento;
    Button fractura;
    Button electrocucion;
    Button golpes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consciente);
        calor = (Button) findViewById(R.id.golpecalor);
        quemaduras = (Button) findViewById(R.id.fuego);
        atragamiento = (Button) findViewById(R.id.atraga);
        hemorragia = (Button) findViewById(R.id.hemo);
        herida = (Button) findViewById(R.id.herida);
        envenenamiento = (Button) findViewById(R.id.veneno);
        fractura = (Button) findViewById(R.id.fractura);
        electrocucion = (Button) findViewById(R.id.rayo);
        golpes = (Button) findViewById(R.id.golpes);
        calor.setOnClickListener(this);
        quemaduras.setOnClickListener(this);
        atragamiento.setOnClickListener(this);
        hemorragia.setOnClickListener(this);
        herida.setOnClickListener(this);
        envenenamiento.setOnClickListener(this);
        fractura.setOnClickListener(this);
        electrocucion.setOnClickListener(this);
        golpes.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == calor.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, golpedecalor.class);
            startActivity(intent);
        }
        else if (id == quemaduras.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, quemaduras.class);
            startActivity(intent);
        }
        else if (id == atragamiento.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, atragantamiento.class);
            startActivity(intent);
        }
        else  if (id == hemorragia.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, hemorragias.class);
            startActivity(intent);
        }
        else  if (id == herida.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, heridas.class);
            startActivity(intent);
        }
        else if (id == envenenamiento.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, envenenamiento.class);
            startActivity(intent);
        }
        else if (id == fractura.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, fracturas.class);
            startActivity(intent);
        }else if (id == electrocucion.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, electrocucion.class);
            startActivity(intent);
        }
        else if (id == golpes.getId()) {
            //obtener informacion
            Intent intent = new Intent(this, golpes.class);
            startActivity(intent);
        }

    }
}
