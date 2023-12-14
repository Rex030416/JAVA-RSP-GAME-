import java.util.Random;
import java.util.Scanner;

public abstract class Player {
    protected int i=0;
    protected String name;
    protected int choice;
    protected int winmatch;
    protected int[] choicearr= new int [10];
    public Player(String name) {
        this.name = name;
        this.winmatch = 0;
        for (int j = 0; j < 10; j++) {
            choicearr[j] = 5;
        }
    }
    public void winmatchadd ()
    {
        winmatch++;
    }
    public String getName() {
        return name;
    }
    public abstract void move();

    public String getChoiceName(int choice) {
        if (choice == 1) return "石头";
        if (choice == 2) return "剪刀";
        if (choice == 3) return "布";
        if (choice ==-1) return "作弊";
        return null;
    }
    public int getChoice() {
        return choice;
    }

}