import org.w3c.dom.ls.LSOutput;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;
public class Method01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //方法使用
        //1.方法写好之后，如果不去调用，就不会输出
        Person p1 = new Person();
//        p1.speak();//调用方法
//        p1.cal01();//调用方法
//        System.out.println("请输入需要加到的数：");
//        int n = scanner.nextInt();
//        p1.cal02(n);
        System.out.println("请输入第一个数：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int j = scanner.nextInt();

        //把方法getSum返回的值赋给变量sum
        int sum = p1.getSum(i,j);
        System.out.println("和为" + sum);



    }
}

class Person{//创建一个人的类


    String name;//人的属性
    int age;
    //方法（成员方法）
    //添加speak成员方法，输出“我是一个好人”
    //public 表示方法是公开
    //void 表示方法没有返回值
    //speak() 方法名，（）小括号是形参列表
    //{}方法体，可以写我们要执行的代码
    //System.out.println();输出一句话


    public void speak(){//输出一句话
        System.out.println("我我是一个好人");

    }
    public void cal01(){
        //计算1-1000的值
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    //(int n) 形参列表，表示当前有一个形参n，可以接收用户输入

    public void cal02(int n){//计算从1到n的和
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("从1到" + n + "的和为" + sum);

    }


    //传入多个形参


    //表示方法执行后，返回一个int值
    //形参列表(int i,int j)两个形参，可以接收用户传入的两个数
    public int getSum(int i,int j){//计算两个数的和

        //
        return i + j;

    }

}

