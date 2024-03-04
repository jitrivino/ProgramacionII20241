package co.edu.uniquindio.programacion2.JuegoRol;


import java.util.List;

public class prueba {
    public static void main(String[] args) {
        CharacterBuilder builder = new WarriorBuilder();
        CharacterDirector director = new CharacterDirector(builder);

        // Construir un guerrero
        director.construct("Aragorn", "Guerrero", 10,
                List.of("Espada Afilada", "Golpe Definitivo", "Escudo Protector"),
                List.of("Espada", "Escudo"), "Héroe de Gondor", "El rey de los guerreros", 1000);
        Character warrior = builder.build();
        System.out.println("Guerrero creado: " + warrior);

        // Construir un mago
        builder = new MageBuilder();
        director = new CharacterDirector(builder);
        director.construct("Gandalf", "Mago", 15,
                List.of("Bola de Fuego", "Rayo Eléctrico", "Hechizo de Curación"),
                List.of("Báculo", "Túnica"), "El mago gris", "Gandalf el Blanco", 500);
        Character mage = builder.build();
        System.out.println("Mago creado: " + mage);

        // Construir un arquero
        builder = new ArcherBuilder();
        director = new CharacterDirector(builder);
        director.construct("Legolas", "Arquero", 12,
                List.of("Disparo Rápido", "Flecha Venenosa", "Tiro Certero"),
                List.of("Arco", "Flechas"), "El elfo de los bosques", "Príncipe de los arqueros", 800);
        Character archer = builder.build();
        System.out.println("Arquero creado: " + archer);
    }
}
