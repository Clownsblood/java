import java.util.Scanner;
public class HomeWork04 {
    public static void main(String[] args) {
//        4.判断一个数是否为水仙花数，所谓水仙花数是指一个三位数，
//        其个位上数字立方和等于其本身，
//        例如：153 = 1 * 1 * 1 + 3 * 3 * 3 + 5 * 5 * 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数字：");
        int num = scanner.nextInt();
        int gewei = num % 10;
        int shiwei = (int)(num % 100) / 10;
        int baiwei = (int)(num / 100);
//        System.out.println(gewei);
//        System.out.println(shiwei);
//        System.out.println(baiwei);
        if (gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == num){
            System.out.println(num + "是水仙花数");
        }
        else {
            System.out.println("您输入的数不是水仙花数");
        }
    }
}
