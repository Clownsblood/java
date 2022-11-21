import java.util.Scanner;


public class NestedIf {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的性别，0：男，1：女");
        int gender = scanner.nextInt();
        char gen = scanner.next().charAt(0);
        System.out.println("请输入您的成绩：");
        double score = scanner.nextDouble();
        if (gender == 0){
            System.out.println("您进入的是男子组");
            if (score > 8.0){
                System.out.println("恭喜您进入决赛");
            }
            else {
                System.out.println("您被淘汰了");
            }
        }else {
            System.out.println("您进入的是女子组");
            if (score > 8.0){
                System.out.println("恭喜您进入决赛");
            }
            else {
                System.out.println("您被淘汰了");
            }
        }

    }
}
