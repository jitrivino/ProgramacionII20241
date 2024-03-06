package co.edu.uniquindio.programacion2.JuegoRol;
import java.util.List;
import java.util.ArrayList;

public class Player {
    List <Character> listaPersonajes;
    CharacterDirector director;

    public Player(){
        listaPersonajes = new ArrayList<>();
    }

    public void adicionarMago(String name, String characterClass, int level, List<String> skills,
                                List<String> equipment, String description, 
                                String nickname, double initialMoney){
            MageBuilder builder= new MageBuilder();
            director= new CharacterDirector(builder);
            director.construct(name, characterClass, level,  skills,
                                equipment,  description, nickname,  initialMoney );
            listaPersonajes.add(builder.build());
    }

    public void adicionarPersonaje(Personaje personaje){
        listaPersonajes.add(personaje);
    }

}
