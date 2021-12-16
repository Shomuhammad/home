package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setAttack(45);
        boss.setHealth(150);
        boss.setProtection(" ");
        System.out.println(boss.getAttack() + boss.getHealth() + boss.getProtection());
    }
    public static Boss[] createHeroes;


}
