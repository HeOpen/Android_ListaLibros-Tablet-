package com.example.dm2e_olaheliabe_practica94.mislibros;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.dm2e_olaheliabe_practica94.R;
import java.util.ArrayList;

public class ListaLibrosFragment extends androidx.fragment.app.Fragment {

    private ArrayList<Libro> libros;
    private ArrayAdapter<Libro> aa;
    private OnLibroSeleccionadoListener listener;

    public interface OnLibroSeleccionadoListener {
        void onLibroSeleccionado(Libro l);
    }

    public ListaLibrosFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_lista_libros, container, false);

        libros = new ArrayList<>();
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes",
                "En un lugar de la mancha, de cuyo nombre no quiero acordarme..."));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "La historia de la familia Buendía en el pueblo ficticio de Macondo."));
        libros.add(new Libro("1984", "George Orwell", "Una distopía sobre un futuro vigilado por el Gran Hermano donde el pensamiento es controlado."));
        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "Un piloto perdido en el Sahara encuentra a un pequeño príncipe de otro planeta."));
        libros.add(new Libro("Orgullo y Prejuicio", "Jane Austen", "La vida y amores de las hermanas Bennet en la Inglaterra rural del siglo XIX."));
        libros.add(new Libro("El Hobbit", "J.R.R. Tolkien", "Bilbo Bolsón emprende un viaje inesperado para recuperar un tesoro custodiado por un dragón."));
        libros.add(new Libro("Rayuela", "Julio Cortázar", "Una contranovela que narra la historia de Horacio Oliveira y su búsqueda de sentido."));
        libros.add(new Libro("Fahrenheit 451", "Ray Bradbury", "Un bombero cuya misión es quemar libros empieza a cuestionar su sociedad."));
        libros.add(new Libro("La metamorfosis", "Franz Kafka", "Gregorio Samsa se despierta una mañana transformado en un insecto gigante."));
        libros.add(new Libro("Pedro Páramo", "Juan Rulfo", "Juan Preciado viaja a Comala para buscar a su padre, encontrando un pueblo de fantasmas."));
        libros.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", "El relato de los eventos que llevaron al asesinato de Santiago Nasar."));

        aa = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, libros);
        ListView lv = (ListView) result.findViewById(R.id.listView);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Libro l = libros.get(position);
                if (listener != null) {
                    listener.onLibroSeleccionado(l);
                }
            }
        });
        return result;
    }
    public void setOnLibroSeleccionadoListener(OnLibroSeleccionadoListener listener) {
        this.listener = listener;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (OnLibroSeleccionadoListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " debe implementar OnLibroSeleccionadoListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

}