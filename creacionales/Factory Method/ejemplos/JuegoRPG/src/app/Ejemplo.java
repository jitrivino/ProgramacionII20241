package src.app;

import src.FactoryMethod.*;

public class Ejemplo {

    public static void main(String[] args) {
        // Creamos personajes utilizando el Factory Method
        FabricaPersonaje fabricaGuerrero = new FabricaGuerrero("Conan", 100);
        Personaje guerrero = fabricaGuerrero.crearPersonaje();

        System.out.println("Creando personaje Guerrero...");
        guerrero.mostrarInformacion();

        System.out.println();

        FabricaPersonaje fabricaMago = new FabricaMago("Gandalf", 200);
        Personaje mago = fabricaMago.crearPersonaje();

        System.out.println("Creando personaje Mago...");
        mago.mostrarInformacion();
    }
}
