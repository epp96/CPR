package com.example.enrique.cpr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Enrique on 3/26/2017.
 */

public class golpes extends AppCompatActivity {
    TextView information;
    String info = "CONTUSIÓN\n" +
            "   Síntomas:\n" +
            "       • Dolor\n" +
            "       • Inflamación\n" +
            "       • Hematoma\n" +
            "   Qué hacer:\n" +
            "       1. Inmovilizar zona afectada.\n" +
            "       2. Elevarla.\n" +
            "       3. Frío.\n" +
            "       4. No pinchar los hematomas.\n" +
            "       5. Centro sanitario.\n" +
            "\n" +
            "ESGUINCE\n" +
            "   Síntomas:\n" +
            "       • Enrojecimiento\n" +
            "       • Calor\n" +
            "       • Hinchazón\n" +
            "       • Dolor\n" +
            "   Qué hacer:\n" +
            "       1. Inmovilizar articulación (vendaje almohadillado, elástico y compresivo).\n" +
            "       2. Elevar miembro afectado.\n" +
            "       3. Reposo.\n" +
            "       4. Frío (20’).\n" +
            "       5. No pomadas.\n" +
            "       6. Centro sanitario.\n" +
            "\n" +
            "LUXACIÓN\n" +
            "   Síntomas:\n" +
            "       • Dolor intenso\n" +
            "       • Hinchazón\n" +
            "       • Dificultad de movimientos\n" +
            "       • Deformación\n" +
            "   Qué hacer:\n" +
            "       1. Inmovilizar articulación (vendaje almohadillado, elástico y compresivo).\n" +
            "       2. Elevar miembro y reposo.\n" +
            "       3. Frío local.\n" +
            "       4. Centro sanitario.\n" +
            "\n" +
            "LESIÓN MUSCULAR\n" +
            "   Qué hacer:\n" +
            "       1. Inmovilizar zona afectada (vendaje almohadillado, elástico y compresivo).\n" +
            "       2. Elevar miembro y reposo.\n" +
            "       3. Frío local.\n" +
            "       4. No pomadas.\n" +
            "       5. Centro sanitario.\n" +
            "\n" +
            "TRAUMATISMO CRÁNEO-ENCEFÁLICO\n" +
            "   Qué hacer:\n" +
            "       1. ABC\n" +
            "       2. Valorar consciencia AVDN (Alerta, Respuesta Verbal, Responde al Dolor, No responde) \n" +
            "       3. Asegurar permeabilidad de vía aérea y controlar cuello.\n" +
            "       4. Tumbar boca arriba (elevación cabecera 30º).\n" +
            "       5. Control hemorragias.\n" +
            "\n" +
            "TRAUMATISMO DE ESPALDA\n" +
            "   Qué hacer:\n" +
            "       1. ABC\n" +
            "       2. Control del cuello, cabeza y tronco alineados.\n" +
            "       3. 112\n" +
            "       4. No mover.\n" +
            "       5. Si está boca abajo → movilizar en bloque.\n" +
            "\n" +
            "TRAUMATISMO TORÁCICO\n" +
            "   Qué hacer:\n" +
            "       1. Tranquilizar al paciente.\n" +
            "       2. Permeabilidad vía aérea.\n" +
            "       3. Control hemorragias.\n" +
            "       4. Paciente semisentado (30-45º cabecera).\n" +
            "       5. Traumatismo abierto → ocluir herida fijando solo 3 bordes (apósitos estériles).\n" +
            "       6. Objetos clavados → fijarlos, no retirarlos.\n" +
            "       7. Centro sanitario.\n" +
            "\n" +
            "TRAUMATISMO ABDOMINAL\n" +
            "   Qué hacer:\n" +
            "       1. Tranquilizar al paciente.\n" +
            "       2. Herida abierta → taponar.\n" +
            "       3. Salida de vísceras → cubrir (paño húmedo o suero).\n" +
            "       4. Traslado boca arriba y piernas flexionadas.\n" +
            "       5. Salida de órganos → no reintroducir.\n" +
            "       6. Objetos clavados → fijarlos, no retirarlos.\n";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        WebView webview = (WebView) findViewById(R.id.webview_xml);
        webview.loadUrl("file:///android_asset/golpes.html");
    }
}
