import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择游戏模式：1.人-人 2.人-机");
        int mode = scanner.nextInt();
        System.out.println("请选择胜利条件：1.三局两胜 2.五局三胜");
        int vmode = scanner.nextInt();
        if (vmode==1)
        {i=2;}
        else {i=3;}
        Player player1, player2;
        if (mode == 1) {
            player1 = new Human("玩家1");
            player2 = new Human("玩家2");
        } else {
            player1 = new Human("玩家");
            player2 = new Bot("机器人");}






        while (true) {
            System.out.println(player1.getName()+"请出手：");
            player1.move();
            if(mode==1){
                System.out.println(player2.getName()+"请出手：");
                player2.move();
            }
            if (mode == 2) {
                System.out.println("电脑正在思考中");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                player2.move();
            }



            System.out.println(player1.getName()+"："+player1.getChoiceName(player1.getChoice()));
            System.out.println(player2.getName()+"："+player2.getChoiceName(player2.getChoice()));



            int result = judge(player1.getChoice(), player2.getChoice());
            if (result == 1) {
                System.out.println(player2.getName() + "胜利！");
                player2.winmatchadd();
            } else if (result == -1) {
                System.out.println(player1.getName() + "胜利！");
                player1.winmatchadd();
            } else if (result==0){
                System.out.println("平局！");
            }
            else if(result==-2)
            {
                if (player1.getChoice()==-1&&player2.getChoice()!=-1)
                {
                    System.out.println(player2.getName() + "胜利！");
                    player2.winmatchadd();
                }
                if (player2.getChoice()==-1&&player1.getChoice()!=-1)
                {
                    System.out.println(player1.getName() + "胜利！");
                    player1.winmatchadd();
                }
                if (player2.getChoice()==-1&&player1.getChoice()==-1)
                {
                    System.out.println("双方都存在作弊行为,平局！");
                }
            }
            if (player1.winmatch-i==0||player2.winmatch-i==0) {
                System.out.println(player1.getName()+"赢了"+player1.winmatch+"局");
                System.out.println(player2.getName()+"赢了"+player2.winmatch+"局");
                System.out.println("游戏结束");
                    break;
            }
            //System.out.println("是否继续游戏？1.继续 2.退出");
            //int conti = scanner.nextInt();
            //if (conti == 2) break;
        }
    }

    public static int judge(int choice1, int choice2) {
        if(choice1==-1||choice2==-1)
        {
            return -2;
        }
        if (choice1 == choice2) return 0;
        if (choice1 - choice2 == 1 || choice1 - choice2 == -2) return 1;
        return -1;
    }
}