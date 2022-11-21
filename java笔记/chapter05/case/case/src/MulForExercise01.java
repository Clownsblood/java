import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[] args) {
//        1.统计三个班成绩情况，每个班有五名同学，求出各个班的平均分和所有班级的平均分（学生成绩从键盘输入）
//
//        2.统计三个班及格人数，每个班有五名同学
//
//        3.打印出九九乘法表
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int score = 0;
        int sum1 = 0;
        int sum2 = 0;
        int pass = 0;
        for (i = 0; i < 3; i++){
            System.out.println("请输入第" + (i + 1) + "个班的成绩");
            for (j = 0; j < 5; j++){
                System.out.println("请输入第" + (j + 1) + "个学生成绩");
                score = scanner.nextInt();
                if (score >= 60){
                    pass += 1;
                }
                sum1 += score;

            }
            System.out.println("第" + (i + 1) + "个班的平均分为" + sum1/5.0);
            System.out.println("第" + (i + 1) + "个班及格的人数为" + pass);
            sum2 += sum1;
            sum1 = 0;
            pass = 0;

        }
        System.out.println("三个班平均分为：" + sum2 / 3.0);
    }
}
