package com.example.dm2e_olaheliabe_practica94;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dm2e_olaheliabe_practica94.mislibros.Libro;
import com.example.dm2e_olaheliabe_practica94.mislibros.ListaLibrosFragment;
import com.example.dm2e_olaheliabe_practica94.mislibros.ResumenLibroFragment;

public class MainActivity extends AppCompatActivity implements ListaLibrosFragment.OnLibroSeleccionadoListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLibroSeleccionado(Libro l) {
        ResumenLibroFragment rlf = (ResumenLibroFragment) getSupportFragmentManager()
                .findFragmentById(R.id.resumenFragment);

        if (rlf != null && rlf.isInLayout()) {
            rlf.setLibro(l.titulo, l.autor, l.resumen);
        } else {
            Intent intent = new Intent(this, ResumenActivity.class);
            intent.putExtra("titulo", l.titulo);
            intent.putExtra("autor", l.autor);
            intent.putExtra("resumen", l.resumen);
            startActivity(intent);
        }
    }
}