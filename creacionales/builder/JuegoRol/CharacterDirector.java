package co.edu.uniquindio.programacion2.JuegoRol;

import java.util.List;


// Director que coordina la construcción del personaje
class CharacterDirector {
    private CharacterBuilder builder;

    public CharacterDirector(CharacterBuilder builder) {
        this.builder = builder;
    }

    public Character construct(String name, String characterClass, int level, List<String> skills,
                          List<String> equipment, String description, String nickname, double initialMoney) {
        builder.name(name);
        builder.characterClass(characterClass);
        builder.level(level);
        builder.skills(skills);
        builder.equipment(equipment);
        builder.description(description);
        builder.nickname(nickname);
        builder.initialMoney(initialMoney);
        return builder.build();
    }
}