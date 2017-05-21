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

/**
 * Created by Enrique on 3/5/2017.
 */

public class emergencia extends AppCompatActivity  implements View.OnClickListener  {
    Button proteger;
    Button alertar;
    Button socorrer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergencia);
        proteger = (Button) findViewById(R.id.proteger);
        alertar = (Button) findViewById(R.id.alert);
        socorrer = (Button) findViewById(R.id.soco);
        proteger.setOnClickListener(this);
        alertar.setOnClickListener(this);
        socorrer.setOnClickListener(this);

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
        if (id == proteger.getId()) {
            Intent intent = new Intent(this, proteger.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        else if (id == alertar.getId()) {
            Intent intent = new Intent(this, alertar.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        else if (id == socorrer.getId()) {
            Intent intent = new Intent(this, socs.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }


    }
}
