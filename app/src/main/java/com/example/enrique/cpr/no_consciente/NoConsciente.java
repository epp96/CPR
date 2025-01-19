package com.example.enrique.cpr.no_consciente;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.enrique.cpr.MainActivity;
import com.example.enrique.cpr.R;

public class NoConsciente extends AppCompatActivity implements View.OnClickListener {
    private Button aButton;
    private Button bButton;
    private Button cButton;
    private Button paradaCardiacaButton;
    private Button atragantamientoButton;
    private Button convulsionButton;
    private Button desmayoButton;
    private Button comaButton;
    private Button traumatismoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noconsciente);
        aButton = findViewById(R.id.a);
        bButton = findViewById(R.id.b);
        cButton = findViewById(R.id.c);
        paradaCardiacaButton = findViewById(R.id.parada);
        atragantamientoButton = findViewById(R.id.atragar);
        convulsionButton = findViewById(R.id.covulsion);
        desmayoButton = findViewById(R.id.desmayo);
        comaButton = findViewById(R.id.coma);
        traumatismoButton = findViewById(R.id.trauma);
        aButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        paradaCardiacaButton.setOnClickListener(this);
        atragantamientoButton.setOnClickListener(this);
        convulsionButton.setOnClickListener(this);
        desmayoButton.setOnClickListener(this);
        comaButton.setOnClickListener(this);
        traumatismoButton.setOnClickListener(this);
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
        Intent intent;

        if (view.getId() == aButton.getId()) {
            intent = new Intent(this, A.class);
        } else if (view.getId() == bButton.getId()) {
            intent = new Intent(this, B.class);
        } else if (view.getId() == cButton.getId()) {
            intent = new Intent(this, C.class);
        } else if (view.getId() == paradaCardiacaButton.getId()) {
            intent = new Intent(this, ParadaCardiaca.class);
        } else if (view.getId() == atragantamientoButton.getId()) {
            intent = new Intent(this, Atragantamiento.class);
        } else if (view.getId() == convulsionButton.getId()) {
            intent = new Intent(this, Convulsion.class);
        } else if (view.getId() == desmayoButton.getId()) {
            intent = new Intent(this, Desmayo.class);
        } else if (view.getId() == comaButton.getId()) {
            intent = new Intent(this, Coma.class);
        } else if (view.getId() == traumatismoButton.getId()) {
            intent = new Intent(this, Traumatismo.class);
        } else {
            return;
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
