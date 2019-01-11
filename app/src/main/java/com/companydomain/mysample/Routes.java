package com.companydomain.mysample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Routes extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);


        /* Inicia codigo de Lista de Rutas */
        final ListView RutaCentro = findViewById(R.id.RutaCentro);
        final String[] routesArray = new String[]{"Centro - UABC - Villa Fontana - El Refugio", "Centro - Aeropuerto - Modulos",
                "Centro - Venados - Natura", "Centro - 10 de Mayo", "Centro - Lomas Taurinas - Nido de las Aguilas", "Centro - Playas",
                "Centro - La Presa - Villa Fontana", "Centro - 5y10 - Insurgentes - Presidentes", "Centro - 5y10 - Camino Verde",
                "Centro - 5y10 - Zapata/Reforma", "Centro - UABC - Insurgentes - Natura", "Centro - Villa del Campo",
                "Centro - El niño", "Centro - Valle de Palmas", "Centro - El Refugio", "Linea - Centro - Santa Fe", "Centro - Jardin",
                "Taxi Centro - Lomas Verdes", "Taxi Centro - 5y10 - Presa", "Taxi Centro - UABC - 5Y10", "Taxi Centro - Presidentes",
                "Taxi Centro -Guaycura - Ampliacion Guaycura", "Taxi Centro - Capistrano", "Taxi Centro - Aeropuerto - Otay",
                "Taxi Centro - Buena Vista - Otay", "Taxi Centro - Olivos - Colinas", "Taxi Centro - UABC - Rivera del Bosque",
                "Taxi Centro - UABC - 10 de Mayo", "Taxi Centro - Azteca", "Taxi Centro - Libertad",
                "Taxi Centro - Central Camionera - Refugio - San Pedro"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.activity_list_item, android.R.id.text1, routesArray);
        RutaCentro.setAdapter(adapter);
        RutaCentro.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue = (String) RutaCentro.getItemAtPosition(position);
                Toast.makeText(Routes.this, itemValue, Toast.LENGTH_SHORT).show();

//                /* Inicia codigo acceso a Rutas */
//                if (position == 0) {
//                    Intent myintent = new Intent(view.getContext(), Evento.class);
//                    startActivityForResult(myintent, 0);
//                }
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEvento();
            }
        });
    }
            private void openEvento() {
                Intent intent = new Intent(this,Evento.class);
                startActivity(intent);
            }



}
