package com.example.dm2e_olaheliabe_practica94.mislibros;

public class Libro {
    public String titulo;
    public String autor;
    public String resumen;

    public Libro(String t, String a, String r) {
        this.titulo = t;
        this.autor = a;
        this.resumen = r;
    }
    @Override
    public String toString() {
        return this.titulo + " (" + this.autor + ")";
    }

}