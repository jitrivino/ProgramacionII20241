package src.FactoryMethod;
import src.model.Mago;

public class FabricaMago implements FabricaPersonaje {
    private String nombre;
    private int poderMagico;

    public FabricaMago(String nombre, int poderMagico) {
        this.nombre = nombre;
        this.poderMagico = poderMagico;
    }

    @Override
    public Personaje crearPersonaje() {
        return new Mago(nombre, poderMagico);
    }
}
