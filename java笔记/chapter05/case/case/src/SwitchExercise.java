import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a-e");
        char c1 = scanner.next().charAt(0);
        System.out.println("请输入成绩");
        int achievement = scanner.nextInt();
        switch (c1){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("您的输入不正确，请重新输入！");
        }
        if (achievement >= 0 & achievement <= 100){
            switch(achievement/60){
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
        else {
            System.out.println("输入有误");
        }





    }
}
