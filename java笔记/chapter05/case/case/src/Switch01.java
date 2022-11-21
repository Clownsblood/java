import java.util.Scanner;


public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        char week = scanner.next().charAt(0);
        switch (week){
            case 'a':
                System.out.println("今天星期一，要加油哦！");
                break;
            case 'b':
                System.out.println("今天星期二，要加油哦！");
                break;
            case 'c':
                System.out.println("今天星期三，要加油哦！");
                break;
            case 'd':
                System.out.println("今天星期四，要加油哦！");
                break;
            case 'e':
                System.out.println("今天星期五，要加油哦！");
                break;
            case 'f':
                System.out.println("今天星期六，放松一下吧");
                break;
            case 'g':
                System.out.println("今天星期日，放松一下吧");
                break;
            default:
                System.out.println("您的输入不正确，请重新输入！");



        }


    }
}
