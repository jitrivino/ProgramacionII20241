package co.edu.uniquindio.programacion2.JuegoRol;

import java.util.ArrayList;
import java.util.List;

class Character {
    private String name;
    private String characterClass;
    private int level;
    private List<String> skills;
    private List<String> equipment;
    private String description;
    private String nickname;
    private double initialMoney;

    public Character() {
        this.skills = new ArrayList<>();
        this.equipment = new ArrayList<>();
    }

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getInitialMoney() {
        return initialMoney;
    }

    public void setInitialMoney(double initialMoney) {
        this.initialMoney = initialMoney;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", level=" + level +
                ", skills=" + skills +
                ", equipment=" + equipment +
                ", description='" + description + '\'' +
                ", nickname='" + nickname + '\'' +
                ", initialMoney=" + initialMoney +
                '}';
    }
}