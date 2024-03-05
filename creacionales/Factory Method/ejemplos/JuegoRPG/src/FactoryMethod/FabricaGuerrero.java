package src.FactoryMethod;

import src.model.Guerrero;

// FabricaGuerrero.java
public class FabricaGuerrero implements FabricaPersonaje {
    private String nombre;
    private int fuerza;

    public FabricaGuerrero(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    @Override
    public Personaje crearPersonaje() {
        return new Guerrero(nombre, fuerza);
    }
}
