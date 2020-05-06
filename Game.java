package com.company;

import com.google.gson.Gson;

public class Game {
    Player player;

    Game(Player p){
        player = p;
    }

    public void saveGame(){
        Gson g = new Gson();
        g.toJson(player);
    }

    public static void loadGame(String filename){
        Gson g = new Gson();
        g.
    }
}
