package ta03;

import com.google.gson.Gson;

import java.io.*;
import java.util.Scanner;

public class Game {
    Player player;

    Game(Player p){
        player = p;
    }

    public void createFile() {
        try {
            File f = new File("newGame.txt");
            if (f.createNewFile()) {
                System.out.println("Created new file\n");
            } else {
                System.out.println("File already exists.\n");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.\n");
        }
    }

    public void saveGame(){
        Gson g = new Gson();
        String myPlayer = g.toJson(this);
        createFile();
        FileWriter b = null;
        try {
            b = new FileWriter("newGame.txt");
            b.write(myPlayer);
            b.close();
            System.out.println("Wrote to the file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Game loadGame(String filename){
        String json = "";
        Game newObj = null;
        try {
            File myObj = new File(filename);
            Scanner reader = new Scanner(myObj);
            json = reader.nextLine();
            Gson g = new Gson();
            newObj = g.fromJson(json, Game.class);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return newObj;
    }
}
