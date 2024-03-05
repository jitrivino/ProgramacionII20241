package src.model;

import src.FactoryMethod.Personaje;
public class Mago implements Personaje {
    private String nombre;
    private int poderMagico;

    public Mago(String nombre, int poderMagico) {
        this.nombre = nombre;
        this.poderMagico = poderMagico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Mago: " + nombre + " (Poder Mágico: " + poderMagico + ")");
    }
}