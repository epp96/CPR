package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Enrique on 3/26/2017.
 */

public class quemaduras extends AppCompatActivity {
    TextView information;
    String info = "QUEMADURA LEVE:\n" +
            "\n" +
            "   ¿QUÉ HACER?\n" +
            "\n" +
            "       • Enfriar la quemadura con agua corriente 10 minutos.\n" +
            "       • Retirar anillos, relojes, pulseras…\n" +
            "       • No romper ampollas\n" +
            "       • Aplicar crema cicatrizante\n" +
            "       • Cubrir con apósitos estériles (si es posible) o muy limpios.\n" +
            "\n" +
            "QUEMADURA EXTENSA O GRAVE:\n" +
            "\n" +
            "   ¿QUÉ HACER?\n" +
            "\n" +
            "       • Alejar a la víctima de la fuente calorífica agresora.\n" +
            "       • ABC \n" +
            "       • Enfriar la zona quemada inmediatamente con agua corriente 10 minutos o aplicar paños empapados.\n" +
            "       • Cubrir al paciente con una sábana como aislamiento, si es posible, con un paño metálico isotérmico o manta térmica para prevenir la hipotermia.\n" +
            "       • Elevar el miembro.\n" +
            "       • Retirar anillos, relojes, pulseras…\n" +
            "\n" +
            "QUEMADURA POR AGENTE QUÍMICO:\n" +
            "\n" +
            "   ¿QUÉ HACER?\n" +
            "\n" +
            "       • Lavar y arrastrar el cáustico con agua durante 15-20 minutos.\n" +
            "       • Cubrir con apósitos estériles (si es posible) o muy limpios.\n" +
            "       • Retirar anillos, relojes, pulseras…\n" +
            "       • Si salpicadura a los ojos, acudir a centro hospitalario \n" +
            "       • Si solo se ha afectado un ojo, cuidar que el agua residual de lavado no entre en contacto con el ojo sano\n" +
            "\n" +
            "\n" +
            "\n" +
            "NUNCA\n" +
            "\n" +
            "   1.- NO aplicar remedios caseros tipo pomadas, lociones o ungüentos, pasta de dientes, aceite o vinagre. \n" +
            "   2.- NO utilizar algodón o apósitos adhesivos \n" +
            "   3.- NO usar hielo o agua helada\n" +
            "   4.- NO romper las ampollas \n" +
            "   5.- NO neutralizar una quemadura por producto químico con otro producto químico\n" +
            "   6.- NO quitar la ropa a la víctima. Sólo en caso de estar impregnada de productos cáusticos o hirvientes.\n" +
            "   7.- NO echar agua a una persona con ropas ardiendo. Impedir que corra, cubrirle con prendas grandes o hacerle rodar por el suelo.\n" +
            "\n" +
            "\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(info);
    }
}
