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
                "Considerada la obra cumbre de la literatura española, narra las aventuras de Alonso Quijano, un hidalgo pobre que, tras leer demasiados libros de caballería, pierde el juicio y decide hacerse caballero andante bajo el nombre de Don Quijote. Junto a su fiel escudero Sancho Panza, recorre tierras españolas luchando contra molinos de viento que cree gigantes, en busca de honor y del amor de su dama idealizada, Dulcinea del Toboso. Es una parodia de los libros de caballería que explora temas como la locura, la realidad y el idealismo."));

        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez",
                "Esta obra maestra del realismo mágico relata la historia de siete generaciones de la familia Buendía en el pueblo ficticio de Macondo. La trama comienza con la fundación del pueblo por José Arcadio Buendía y Úrsula Iguarán, y sigue su ascenso y eventual caída. El libro está lleno de elementos fantásticos tratados como cotidianos, como ascensos al cielo y plagas de insomnio. A través de la soledad, el incesto y el destino ineludible, Márquez crea una metáfora sobre la historia de América Latina y la condición humana universal."));

        libros.add(new Libro("1984", "George Orwell",
                "Una aterradora visión de un futuro distópico bajo el régimen totalitario de 'El Partido', liderado por la figura omnipresente del Gran Hermano. El protagonista, Winston Smith, trabaja en el Ministerio de la Verdad reescribiendo la historia para que coincida con la propaganda oficial. En una sociedad donde incluso los pensamientos son vigilados por la 'Policía del Pensamiento' y el lenguaje se reduce para eliminar la libertad, Winston comete el crimen de enamorarse y cuestionar el sistema. Orwell explora el control mental, la vigilancia masiva y la manipulación de la verdad."));

        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry",
                "Aunque parece un cuento infantil, es una profunda reflexión filosófica sobre la naturaleza humana y la pérdida de la inocencia. Un piloto varado en el desierto del Sahara conoce a un pequeño príncipe que viaja de planeta en planeta. A través de los ojos del niño, el autor critica la obsesión de los adultos con los números, el poder y las apariencias. El encuentro con el zorro enseña que 'lo esencial es invisible a los ojos' y la importancia de crear vínculos, convirtiendo este libro en un manifiesto sobre el amor, la amistad y la pureza del alma."));

        libros.add(new Libro("Orgullo y Prejuicio", "Jane Austen",
                "Ambientada en la Inglaterra rural de finales del siglo XVIII, la novela sigue a Elizabeth Bennet, una joven inteligente y aguda que debe navegar las presiones sociales para casarse. Tras conocer al rico y aparentemente arrogante Fitzwilliam Darcy, Elizabeth desarrolla un prejuicio inicial que la ciega ante la verdadera naturaleza del hombre. La obra es una sátira social brillante que critica la dependencia económica de las mujeres de la época y examina cómo los malentendidos, el orgullo personal y las diferencias de clase pueden obstaculizar la búsqueda de la felicidad y el amor verdadero."));

        libros.add(new Libro("El Hobbit", "J.R.R. Tolkien",
                "La historia sigue al hogareño hobbit Bilbo Bolsón, quien es arrastrado por el mago Gandalf y un grupo de trece enanos a una aventura épica para recuperar el tesoro robado por el dragón Smaug en la Montaña Solitaria. A lo largo del viaje, Bilbo atraviesa tierras peligrosas, se enfrenta a trolls y trasgos, y encuentra un misterioso anillo que cambiará su vida y el destino de la Tierra Media para siempre. Es una aventura clásica sobre el valor, la madurez y cómo incluso el ser más pequeño puede marcar la diferencia en el mundo."));

        libros.add(new Libro("Rayuela", "Julio Cortázar",
                "Esta 'contranovela' revolucionó la literatura hispanoamericana por su estructura no lineal. Narra la historia de Horacio Oliveira, un intelectual argentino en París y luego en Buenos Aires, y su relación con 'La Maga'. El libro invita al lector a elegir su propio camino de lectura, ya sea de forma tradicional o siguiendo un tablero de dirección que salta entre capítulos. Es una búsqueda metafísica sobre el sentido de la vida, el arte y la imposibilidad de alcanzar una verdad absoluta, llena de juegos lingüísticos y reflexiones jazzísticas."));

        libros.add(new Libro("Fahrenheit 451", "Ray Bradbury",
                "En una sociedad futura donde los libros están prohibidos y los bomberos tienen la misión de quemarlos para mantener el control social y evitar el pensamiento crítico, Guy Montag es un bombero que empieza a dudar de su labor. Tras conocer a una joven que le muestra la belleza de la naturaleza y el valor de las ideas, Montag comienza a robar libros y a unirse a una resistencia intelectual. Bradbury advierte sobre los peligros de una sociedad dominada por el entretenimiento superficial, la censura y la pérdida de la memoria cultural compartida."));

        libros.add(new Libro("La metamorfosis", "Franz Kafka",
                "La historia comienza con el famoso despertar de Gregorio Samsa, un viajante de comercio que se encuentra convertido en un insecto gigante. A través de esta premisa absurda, Kafka explora el aislamiento, la alienación y la deshumanización del individuo en la sociedad moderna. La reacción de su familia pasa de la compasión al asco y, finalmente, al rechazo total, mostrando cómo la utilidad de una persona define su valor para los demás. Es una obra angustiante que refleja la impotencia del ser humano ante una realidad incomprensible y cruel."));

        libros.add(new Libro("Pedro Páramo", "Juan Rulfo",
                "Juan Preciado viaja al pueblo de Comala para cumplir la promesa hecha a su madre moribunda de reclamar a su padre, el cacique Pedro Páramo, lo que les pertenece. Al llegar, se encuentra con un lugar desértico y habitado por voces y murmullos de fantasmas. La novela utiliza una estructura fragmentada para contar la historia del ascenso de Pedro Páramo al poder absoluto y cómo su despecho por la muerte de Susana San Juan condenó al pueblo a la muerte. Es una obra fundacional del realismo mágico que difumina la frontera entre la vida y la muerte."));
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