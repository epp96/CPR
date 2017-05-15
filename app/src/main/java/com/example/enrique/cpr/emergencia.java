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

import com.example.enrique.cpr.MainActivity;
import com.example.enrique.cpr.R;
import com.example.enrique.cpr.socs;

/**
 * Created by Enrique on 3/5/2017.
 */

public class emergencia extends AppCompatActivity  implements View.OnClickListener  {
    Button proteger;
    Button alertar;
    Button socorrer;
    /*Intent intent = new Intent(this, infobasica.class);
    startActivity(intent);*/
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
                Toast.makeText(this, "Menu Item 1 selected", Toast.LENGTH_SHORT).show();
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
           /* Intent intent = new Intent(this, prote.class);
            startActivity(intent);*/
        }
        else if (id == alertar.getId()) {

        }
        else if (id == socorrer.getId()) {
            Intent intent = new Intent(this, socs.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }


    }
}
