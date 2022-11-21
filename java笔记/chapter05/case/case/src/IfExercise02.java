import java.util.Scanner;

public class IfExercise02 {
    public static void main(String[] args) {
//        （1）年份能被四整除，但不能被一百整除
//
//        （2）能被四百整除

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判断的年份：");
        int year =  scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("您输入的年份是闰年");
        }
        else {
            System.out.println("您输入的年份不是闰年");
        }


    }
}
