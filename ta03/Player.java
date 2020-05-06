package ta03;

import java.util.Map;
import java.util.HashMap;

public class Player {
    String name;
    Integer health;
    Integer gold;
    Integer mana;
    Map <String, Integer> equipment = new HashMap<String, Integer>();

    public void displayPlayerValues(){
        System.out.println("Player name: " + name);
        System.out.println("Player health: " + health);
        System.out.println("Player mana: " + mana);
        System.out.println("Player gold: " + gold);

        for (Map.Entry<String, Integer> entry : equipment.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }
}