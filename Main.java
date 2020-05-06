package ta03;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Player p = new Player();

        // Stretch Challenge: give player equipment
        p.equipment.put("Axe", 5);
        p.equipment.put("Speed Boat", 10);
        p.equipment.put("Laser gun", 900);

        Game g = new Game(p);

        // Set values for player in the game
        p.setGold(5);
        p.setHealth(8);
        p.setMana(3);
        p.setName("Trey");

        // Save the game
        g.saveGame();

        // Load game into brand new game object
        Game g2 = Game.loadGame("newGame.txt");
        g2.player.displayPlayerValues();
    }
}
