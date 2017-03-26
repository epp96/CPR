package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Enrique on 3/25/2017.
 */

public class hemorragias extends AppCompatActivity {
    TextView information;
    String info = "CORTE\n" +
            "\n" +
            "   • PAS\n" +
            "   • Si es muy profundo o grande valorar si aviso a 112 +ABC\n" +
            "   • Ponerse guantes y presionar la herida con gasas limpias.\n" +
            "   • Si no cede añadir más gasas sin retirar las anteriores.\n" +
            "   • Elevar el miembro afectado (si no hay fractura).\n" +
            "   • Compresión arterial si el sangrado no cede.\n" +
            "   • Aplicar vendaje compresivo.\n" +
            "   • Si hay objeto clavado NO RETIRAR, sujetar con vendaje.\n" +
            "HEMORRAGIA INTERNA\n" +
            "\n" +
            "   • 112\n" +
            "   • Tranquilizar al paciente.\n" +
            "   • Control de signos vitales.\n" +
            "   • Acostar al paciente boca arriba.\n" +
            "   • Aflojar la ropa.\n" +
            "   • Arropar al paciente.\n" +
            "HEMORRAGIA EXTERNA\n" +
            "\n" +
            "   Nariz\n" +
            "       • Mantener erguido.\n" +
            "       • Comprimir fosa nasal (al menos 5 minutos).\n" +
            "       • Taponar.\n" +
            "       • Si no cede, 112.\n" +
            "       • Nunca echar la cabeza hacia atrás.\n" +
            "   Boca\n" +
            "       • 112\n" +
            "       • Paciente semisentado con la cabeza elevada.\n" +
            "       • Vigilar constantes.\n" +
            "       • Abrigar al paciente.\n" +
            "       • Ayuno total.\n" +
            "   Oído\n" +
            "       •\tSangrado interno tras traumatismo \n" +
            "           – 112\n" +
            "           – No movilizar\n" +
            "       •\tSangrado externo \n" +
            "           – Cubrir \n" +
            "           – Inclinar la cabeza hacia ese lado\n" +
            "           – Acudir centro sanitario\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        information = (TextView) findViewById(R.id.infoTitle);
        information.setText(info);
    }
}
