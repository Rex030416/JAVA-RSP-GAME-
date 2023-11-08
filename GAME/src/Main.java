import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择游戏模式：1.人-人 2.人-机");
        int mode = scanner.nextInt();
        Player player1, player2;
        if (mode == 1) {
            player1 = new Human("玩家1");
            player2 = new Human("玩家2");
        } else {
            player1 = new Human("玩家");
            player2 = new Bot("机器人");
        }
        while (true) {
            System.out.println(player1.getName()+"请出手：");
            player1.move();
            if (mode == 2) {
                System.out.println("电脑正在思考中");
                try {
                    Thread.sleep(31000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                player2.move();
            } else {
                System.out.println(player2.getName()+"请出手：");
                player2.move();
            }

            System.out.println(player1.getName()+"出了"+player1.getChoiceName(player1.getChoice()));
            System.out.println(player2.getName()+"出了"+player2.getChoiceName(player2.getChoice()));
            int result = judge(player1.getChoice(), player2.getChoice());
            if (result == 1) {
                System.out.println(player2.getName() + "胜利！");
            } else if (result == -1) {
                System.out.println(player1.getName() + "胜利！");
            } else {
                System.out.println("平局！");
            }
            System.out.println("是否继续游戏？1.继续 2.退出");
            int conti = scanner.nextInt();
            if (conti == 2) break;
        }
    }

    public static int judge(int choice1, int choice2) {
        if (choice1 == choice2) return 0;
        if (choice1 - choice2 == 1 || choice1 - choice2 == -2) return 1;
        return -1;
    }
}