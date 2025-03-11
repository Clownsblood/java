import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("请输入要判断的月份");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        switch(a){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("请输入正确的月份");

        }
    }
}
