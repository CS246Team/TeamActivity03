package com.company;

public class Player {
    String name;
    Integer health;
    Integer gold;
    Integer mana;

    public void displayPlayerValues(){
        System.out.println("Player name: " + name);
        System.out.println("Player health: " + health);
        System.out.println("Player mana: " + mana);
        System.out.println("Player gold: " + gold);
    }
}
