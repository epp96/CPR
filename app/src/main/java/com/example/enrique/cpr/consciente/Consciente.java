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

public class Consciente extends AppCompatActivity implements View.OnClickListener {
    private Button calorButton;
    private Button quemadurasButton;
    private Button atragantamientoButton;
    private Button hemorragiaButton;
    private Button heridaButton;
    private Button envenenamientoButton;
    private Button fracturaButton;
    private Button electrocucionButton;
    private Button golpesButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consciente);
        calorButton = findViewById(R.id.golpecalor);
        quemadurasButton = findViewById(R.id.fuego);
        atragantamientoButton = findViewById(R.id.atraga);
        hemorragiaButton = findViewById(R.id.hemo);
        heridaButton = findViewById(R.id.herida);
        envenenamientoButton = findViewById(R.id.veneno);
        fracturaButton = findViewById(R.id.fractura);
        electrocucionButton = findViewById(R.id.rayo);
        golpesButton = findViewById(R.id.golpes);
        calorButton.setOnClickListener(this);
        quemadurasButton.setOnClickListener(this);
        atragantamientoButton.setOnClickListener(this);
        hemorragiaButton.setOnClickListener(this);
        heridaButton.setOnClickListener(this);
        envenenamientoButton.setOnClickListener(this);
        fracturaButton.setOnClickListener(this);
        electrocucionButton.setOnClickListener(this);
        golpesButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;

        if (id == calorButton.getId()) {
            intent = new Intent(this, GolpeDeCalor.class);
        } else if (id == quemadurasButton.getId()) {
            intent = new Intent(this, Quemaduras.class);
        } else if (id == atragantamientoButton.getId()) {
            intent = new Intent(this, Atragantamiento.class);
        } else if (id == hemorragiaButton.getId()) {
            intent = new Intent(this, Hemorragias.class);
        } else if (id == heridaButton.getId()) {
            intent = new Intent(this, Heridas.class);
        } else if (id == envenenamientoButton.getId()) {
            intent = new Intent(this, Envenenamiento.class);
        } else if (id == fracturaButton.getId()) {
            intent = new Intent(this, Fracturas.class);
        } else if (id == electrocucionButton.getId()) {
            intent = new Intent(this, Electrocucion.class);
        } else if (id == golpesButton.getId()) {
            intent = new Intent(this, Golpes.class);
        } else {
            return;
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
