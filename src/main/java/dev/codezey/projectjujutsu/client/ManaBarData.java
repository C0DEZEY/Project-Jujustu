package dev.codezey.projectjujutsu.client;

public class ManaBarData {
    private static int playerMana = 100;
    public static void set(int mana) {
        ManaBarData.playerMana = mana;
    }
    public static void remove(int amount) {

           ManaBarData.playerMana = playerMana - amount;
           
    }
    public static int getPlayerMana() {
        return playerMana;
    }
}
