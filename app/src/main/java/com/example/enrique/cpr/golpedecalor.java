package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Enrique on 3/26/2017.
 */

public class golpedecalor extends AppCompatActivity {
    TextView information;
    String info = "INSOLACIÓN   \n" +
            "   - Exposición prolongada al sol con cabeza descubierta.\n" +
            "   - Síntomas: Dolor de cabeza, cara congestionada, sed intensa, piel brillante y sudorosa, náuseas, vómitos, fatiga, debilidad.\n" +
            "\n" +
            "GOLPE DE CALOR      \n" +
            "   - Exposición a altas temperaturas o al sol en ambiente húmedo.\n" +
            "   - Síntomas: Piel caliente y seca sin sudoración, fiebre alta, alteración del nivel de consciencia.\n" +
            " TRATAMIENTO \n" +
            "   • Retirar a la víctima a LUGAR FRESCO Y VENTILADO SEMISENTADA\n" +
            "   • Aflojar ropa\n" +
            "   • Paños húmedos fríos en frente, nuca, axilas e ingles\n" +
            "   • Administrar sorbos de agua y líquidos isotónicos fríos si está consciente\n" +
            "   • Avisar 112\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(info);
    }
}
