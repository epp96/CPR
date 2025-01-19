package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.enrique.cpr.consciente.Consciente;
import com.example.enrique.cpr.no_consciente.NoConsciente;

public class Socs extends AppCompatActivity {

    private Button conscienteButton;
    private Button noConscienteButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soco);

        conscienteButton = findViewById(R.id.cons);
        noConscienteButton = findViewById(R.id.nocons);

        conscienteButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, Consciente.class);
            startActivity(intent);
        });

        noConscienteButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, NoConsciente.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
