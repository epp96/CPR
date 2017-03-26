package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Enrique on 3/25/2017.
 */

public class fracturas  extends AppCompatActivity {
    TextView information;
    String info = "Síntomas:\n" +
            "   • Chasquido\n" +
            "   • Dolor\n" +
            "   • Hinchazón\n" +
            "   • Deformidad\n" +
            "   • Hematoma\n" +
            "   • Impotencia funcional\n" +
            "Qué hacer:\n" +
            "   1. No movilizar.\n" +
            "   2. Retirar anillos, relojes y pulseras.\n" +
            "   3. Explorar movilidad y sensibilidad.\n" +
            "   4. Inmovilizar parte fracturada (sin forzar).\n" +
            "   5. Centro sanitario.\n" +
            "   6. Fractura abierta → cubrir (apósitos) y parar hemorragia.\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(info);
    }

}
