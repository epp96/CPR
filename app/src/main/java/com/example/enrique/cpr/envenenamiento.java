package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Enrique on 3/25/2017.
 */

public class envenenamiento extends AppCompatActivity {
    TextView information;
    String info = "INTOXICACIÓN Y ENVENENAMIENTO:\n" +
            "   - Ingestión/contacto con sustancias tóxicas nocivas que alteran el sistema digestivo, nervioso, respiratorio y circulatorio.\n" +
            "   - Criterios de gravedad: tipo de producto, vía de entrada (ingestión, inhalación, contacto), cantidad, tiempo transcurrido, edad (niños, ancianos).\n" +
            "   - Síntomas: quemaduras/enrojecimiento de boca o labios, aliento extraño, manchas en ropa y olor extraño, síntomas inesperados y repentinos.\n" +
            "TRATAMIENTO \n" +
            "   •\tLlamar 112\n" +
            "   •\tInformar de: edad y estado del afectado, envase del producto, cantidad ingerida, tiempo de ingesta.\n" +
            "   •\tProvocar el vómito en caso de: medicamentos, alimentos en mal estado, venenos sólidos (setas y plantas), agua no potable.\n" +
            "\n" +
            "TRATAMIENTO ENVENENAMIENTO SUSTANCIA CÁUSTICA: \n" +
            "   •\tCONSCIENTE: \n" +
            "       - Llamar 112  \n" +
            "       - Consultar si administrar agua \n" +
            "       - Posición Lateral de Seguridad y abrigar\n" +
            "       - Si hay restos del tóxico→ lavar con agua, retirar ropa impregnada\n" +
            "\n" +
            "\n" +
            "   •\tINCONSCIENTE: \n" +
            "       - Llamar 112 \n" +
            "       - Control ABC \n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(info);
    }
}
