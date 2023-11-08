import java.util.Random;
import java.util.Scanner;

public abstract class Player {
    protected String name;
    protected int choice;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public String getChoiceName(int choice) {
        if (choice == 0) return "石头";
        if (choice == 1) return "剪刀";
        if (choice == 2) return "布";
        return null;
    }

    public int getChoice() {
        return choice;
    }
}