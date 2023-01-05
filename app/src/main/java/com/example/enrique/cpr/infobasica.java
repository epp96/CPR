package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Enrique on 3/5/2017.
 */

public class infobasica extends AppCompatActivity implements View.OnClickListener {
    Button botiquin;
    Button constantes_vitales;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infobasica);
        constantes_vitales = (Button) findViewById(R.id.vitales);
        constantes_vitales.setOnClickListener(this);
        botiquin = (Button) findViewById(R.id.botiquin);
        botiquin.setOnClickListener(this);
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
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == botiquin.getId()) {
            Intent intent = new Intent(this, botiquin.class);
            startActivity(intent);
        } else if (id == constantes_vitales.getId()) {
            Intent intent = new Intent(this, constantes_vitales.class);
            startActivity(intent);
        }

    }
}
