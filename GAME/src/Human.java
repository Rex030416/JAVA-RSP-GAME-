import java.util.Random;
import java.util.Scanner;

class Human extends Player {
    public Human(String name) {
        super(name);
    }

    public void move() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("石头")) choice = 0;
        else if (input.equals("剪刀")) choice = 1;
        else if (input.equals("布")) choice = 2;
    }
}