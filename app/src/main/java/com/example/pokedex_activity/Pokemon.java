package com.example.pokedex_activity;

import java.util.List;

public class Pokemon {

    private String name;
    private List<String> types;
    private int hp;
    private int attack;
    private int defense;
    private int sattack;
    private int sdefense;
    private int speed;
    private Pokemon evo1;
    private Pokemon evo2;

    public Pokemon(String name, List<String> types, int hp, int attack, int defense, int sattack, int sdefense, int speed, Pokemon evo1, Pokemon evo2) {

        this.name = name;
        this.types = types;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sattack = sattack;
        this.sdefense = sdefense;
        this.speed = speed;
        this.evo1 = evo1;
        this.evo2 = evo2;
    }

    public Pokemon(String name, List<String> types, int hp, int attack, int defense, int sattack, int sdefense, int speed) {
        this.name = name;
        this.types = types;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sattack = sattack;
        this.sdefense = sdefense;
        this.speed = speed;
    }

    public Pokemon(String name, List<String> types, int hp, int attack, int defense, int sattack, int sdefense, int speed, Pokemon evo1) {

        this.name = name;
        this.types = types;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sattack = sattack;
        this.sdefense = sdefense;
        this.speed = speed;
        this.evo1 = evo1;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSattack() {
        return sattack;
    }

    public void setSattack(int sattack) {
        this.sattack = sattack;
    }

    public int getSdefense() {
        return sdefense;
    }

    public void setSdefense(int sdefense) {
        this.sdefense = sdefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Pokemon getEvo1() {
        return evo1;
    }

    public void setEvo1(Pokemon evo1) {
        this.evo1 = evo1;
    }

    public Pokemon getEvo2() {
        return evo2;
    }

    public void setEvo2(Pokemon evo2) {
        this.evo2 = evo2;
    }


}
