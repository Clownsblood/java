import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        //if快速入门

        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = myscanner.nextInt();
        if (age > 18){
            System.out.println("你年龄大于十八，要对自己的行为负责");
        }
        else{
            System.out.println("小屁孩");
        }
    }
}
