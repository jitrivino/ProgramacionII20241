package co.edu.uniquindio.programacion2.JuegoRol;

import java.util.List;

public interface CharacterBuilder {
    void name(String name);
    void characterClass(String characterClass);
    void level(int level);
    void skills(List<String> skills);
    void equipment(List<String> equipment);
    void description(String description);
    void nickname(String nickname);
    void initialMoney(double initialMoney);
    Character build();
}