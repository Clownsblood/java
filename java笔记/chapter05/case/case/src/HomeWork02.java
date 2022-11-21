import java.util.Scanner;
public class HomeWork02 {
    public static void main(String[] args) {
//        实现判断一个整数，属于那个范围：大于零，小于零，等于零
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判断的整数:");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("大于零");
        }else if (num == 0){
            System.out.println("等于零");
        }else {
            System.out.println("小于零");
        }
    }
}
