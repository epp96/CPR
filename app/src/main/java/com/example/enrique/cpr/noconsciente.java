package com.example.enrique.cpr;

/**
 * Created by Enrique on 3/5/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class noconsciente extends AppCompatActivity implements View.OnClickListener{
    Button back;
    Button menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noconsciente);
        back = (Button) findViewById(R.id.back);
        menu = (Button) findViewById(R.id.menu);
        back.setOnClickListener(this);
        menu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()) {
            /*Intent intent = new Intent(this, socs.class);
            startActivity(intent);*/
            finish();
        }
        else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}