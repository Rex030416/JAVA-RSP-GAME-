import java.util.Random;
import java.util.Scanner;
class Human extends Player {

    public Human(String name) {
        super(name);
    }
    public void move() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int len=input.length();
        if (input.equals("1"))
        {
            choice = 1;
            choicearr[i]=1;
            i++;
        }
        else if (input.equals("2"))
        {
            choice = 2;
            choicearr[i]=2;
            i++;
        }
        else if (input.equals("3"))
        {
            choice = 3;
            choicearr[i]=3;
            i++;
        } else if (len>=2) {
            choice=-1;
            choicearr[i]=-1;
            i++;
        }

    }

}