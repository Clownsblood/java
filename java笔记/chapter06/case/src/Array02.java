import java.util.Scanner;
public class Array02 {
    public static void main(String[] args) {

        //演示   数据类型 数组名[] = new 数据类型[大小]
        //循环输入5个成绩，保存到double数组，并输出
        Scanner scanner = new Scanner(System.in);

//        double scores[] = new double[5];
        double scores[];  //声明数组，这时scores是null
        scores = new double[5];  //分配内存空间，可以存放数据



        for (int i = 0; i < scores.length; i++){

            System.out.println("请输入第" + (i+1) + "个数");
            scores[i] = scanner.nextDouble();


        }
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }


    }
}
