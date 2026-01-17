package com.example.dm2e_olaheliabe_practica94.mislibros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dm2e_olaheliabe_practica94.R;

public class ResumenLibroFragment extends androidx.fragment.app.Fragment {

    public ResumenLibroFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_resumen_libro, container, false);
    }

    public void setLibro(String titulo, String autor, String resumen) {
        setLabel(R.id.tituloLibro, titulo);
        setLabel(R.id.autorLibro, autor);
        setLabel(R.id.resumenLibro, resumen);
    }

    protected void setLabel(int id, String str) {
        TextView tv;
        tv = (TextView) getView().findViewById(id);
        if (str != null) {
            tv.setText(str);
        } else {
            tv.setText("");
        }
    }
}