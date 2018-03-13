package com.example.didact.u2_viewejercicio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvNombres;
    TextView tvSuperior, tvInferior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNombres = (ListView)findViewById(R.id.lvNombres);
        tvSuperior = (TextView)findViewById(R.id.tvSuperior);
        tvInferior = (TextView)findViewById(R.id.tvInferior);

        String[] nombres = {"Luis","Manuel","Full","Adri","Paco","Maria",
                            "Lucia","Sofia","Ana","Gloria","Juan","Pepe",
                            "Ivan"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,nombres);

        lvNombres.setAdapter(adaptador);

        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String nombre_seleccionado = parent.getItemAtPosition(position).toString();
                tvSuperior.setText(nombre_seleccionado);

            }
        });

        lvNombres.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String nombre_seleccionado2 = parent.getItemAtPosition(position).toString();
                tvInferior.setText(nombre_seleccionado2);
                return true;
            }
        });

    }//fin onCreate
}//fin MainActivity
