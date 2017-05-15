package com.example.enrique.cpr;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Enrique on 3/5/2017.
 */

public class infobasica extends AppCompatActivity implements View.OnClickListener{
    Button back;
    Button menu;
    Button botiquin;
    Button constantes_vitales;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infobasica);
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);
        menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(this);
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
                Toast.makeText(this, "Menu Item 1 selected", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()) {
            finish();
        }
        else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else if (id == botiquin.getId()) {
            Intent intent = new Intent(this, botiquin.class);
            startActivity(intent);
        } else if (id == constantes_vitales.getId()) {
            Intent intent = new Intent(this, constantes_vitales.class);
            startActivity(intent);
        }

    }
}
