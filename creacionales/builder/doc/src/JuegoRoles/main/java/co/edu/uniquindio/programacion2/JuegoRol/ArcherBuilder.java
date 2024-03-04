package co.edu.uniquindio.programacion2.JuegoRol;

import java.util.ArrayList;
import java.util.List;

class ArcherBuilder implements CharacterBuilder {
    private String name;
    private String characterClass;
    private int level;
    private List<String> skills;
    private List<String> equipment;
    private String description;
    private String nickname;
    private double initialMoney;

    public ArcherBuilder() {
        this.skills = new ArrayList<>();
        this.equipment = new ArrayList<>();
    }

    public void name(String name) {
        this.name = name;
    }

    public void characterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void level(int level) {
        this.level = level;
    }

    public void skills(List<String> skills) {
        this.skills = skills;
    }

    public void equipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public void description(String description) {
        this.description = description;
    }

    public void nickname(String nickname) {
        this.nickname = nickname;
    }

    public void initialMoney(double initialMoney) {
        this.initialMoney = initialMoney;
    }

    public Character build() {
        Character character = new Character();
        character.setName(name);
        character.setCharacterClass(characterClass);
        character.setLevel(level);
        character.setSkills(skills);
        character.setEquipment(equipment);
        character.setDescription(description);
        character.setNickname(nickname);
        character.setInitialMoney(initialMoney);
        return character;
    }
}
