package src.model;
import src.FactoryMethod.Personaje;

// Guerrero.java
public class Guerrero implements Personaje {
    private String nombre;
    private int fuerza;

    public Guerrero(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Guerrero: " + nombre + " (Fuerza: " + fuerza + ")");
    }
}