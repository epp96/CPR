package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button emergencyButton = findViewById(R.id.emergencia);
        Button infoButton = findViewById(R.id.infoB);

        emergencyButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, Emergencia.class);
            startActivity(intent);
        });

        infoButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, InfoBasica.class);
            startActivity(intent);
        });
    }
}
