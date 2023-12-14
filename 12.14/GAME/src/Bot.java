import java.util.Random;
import java.util.Scanner;
class Bot extends Player {
    public Bot(String name) {
        super(name);
    }

    public void move() {
        Random random = new Random();
        choice = random.nextInt(3);
    }
}