package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Enrique on 3/25/2017.
 */

public class heridas extends AppCompatActivity {
    TextView information;
    String info = "TRATAMIENTO\n" +
            "1. Lavarse las manos y usar guantes\n" +
            "2. Limpiar la herida de dentro hacia fuera\n" +
            "3. Secar sin frotar, solo ligera presión\n" +
            "4. Utilizar gasas estériles \n" +
            "5. Parar hemorragia\n" +
            "6. Aplicar un antiséptico local\n" +
            "7. Cubrir herida\n" +
            "8. Vigilar al herido y si precisa llamar al 112\n" +
            "9. Posteriormente:\n" +
            "   -Curar 1 vez al día\n" +
            "   -No exponer al sol directamente\n" +
            "   -No arrancar las costras\n" +
            "\n" +
            "\n" +
            "RECOMENDACIONES\n" +
            "1. No usar algodón, pañuelos o servilletas.\n" +
            "2. No usar alcohol ni productos agresivos.\n" +
            "3. No aplicar pomadas o polvos cicatrizantes.\n" +
            "4. No hurgar en la herida.\n" +
            "5. En caso de objeto punzante no quitarlo ni manipularlo.\n" +
            "6. Cubrir y proteger la zona herida.\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(info);
    }
}
