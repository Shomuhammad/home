package com.company;

public class Hero {
private int health;
private int attack;
private String superpower;

    public Hero(int health, int attack, String superpower) {
        this.health = health;
        this.attack = attack;
        this.superpower = superpower;
    }

    public Hero(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public String getSuperpower() {
        return superpower;
    }
}
