import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //演示接收用户输入
        //步骤
        //Scanner类表示简单文本扫描器，在java.util包
        //1.引入、导入 Scanner类所在的包
        //2.创建Scanner对象，new创建一个对象，体会
        Scanner myScanner = new Scanner(System.in);
        //3.接收用户输入，使用相关方法
        System.out.println("请输入名字：");
        //当程序执行到next方法时，等待用户输入
        String name = myScanner.next();//用于接收用户输入
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();//接收用户输入
        System.out.println("请输入薪水：");
        double sal = myScanner.nextDouble();//接收用户输入double
        System.out.println("欢迎" + name + "，您的年龄是" + age + "岁，您的薪水是" + sal);


    }
}
