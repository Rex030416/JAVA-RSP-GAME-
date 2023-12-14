import java.util.Scanner;
public class DualInputExample {
    public static void main(String[] args) {
        // 创建两个输入线程
        InputThread inputThread1 = new InputThread("User 1");
        InputThread inputThread2 = new InputThread("User 2");

        // 启动两个线程
        inputThread1.start();
        inputThread2.start();
    }

    // 继承Thread类创建输入线程
    public static class InputThread extends Thread {
        private String userName;

        public InputThread(String userName) {
            this.userName = userName;
        }


        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.println(userName + " 只能输入以下字母：");

            // 根据用户名限制允许输入的字符
            String allowedChars = "";
            if (userName.equals("User 1")) {
                allowedChars = "asd";
            } else if (userName.equals("User 2")) {
                allowedChars = "jkl";
            }

            // 循环读取用户输入
            while (true) {
                System.out.print(userName + ", 请输入：");
                String userInput = scanner.nextLine();
                // 检查输入是否符合要求
                if (userInput.matches("["+ allowedChars +"]+")) {
                    System.out.println(userName + " 输入的长度为： " + userInput.length());
                } else {
                    System.out.println("输入错误，请重新输入");
                }
            }




        }
    }
}