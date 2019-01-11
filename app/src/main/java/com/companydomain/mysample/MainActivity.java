package com.companydomain.mysample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inicia codigo de Lista de Zonas */
        final ListView ZoneLV = findViewById(R.id.ZoneLV);
        final String[] zoneArray = new String[]{"Centro", "La Mesa", "Otay Centenario", "La Presa",
                "Sanchez Taboada", "Cerro Colorado", "San Antonio de los Buenos", "Playas"};
        ArrayAdapter<String> zoneArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1,zoneArray);
        ZoneLV.setAdapter(zoneArrayAdapter);
        ZoneLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue = (String) ZoneLV.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, itemValue, Toast.LENGTH_SHORT).show();

                /* Inicia codigo acceso a Rutas. Nota... Remplazar Routes */
                if (position == 0) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 0);
                }
                if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 1);
                }
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 2);
                }
                if (position == 3) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 3);
                }
                if (position == 4) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 4);
                }
                if (position == 5) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 5);
                }
                if (position == 6) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 6);
                }
                if (position == 7) {
                    Intent myintent = new Intent(view.getContext(), Routes.class);
                    startActivityForResult(myintent, 7);
                }
            }

        });



    }
}