import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的信用分");
        int creditScore = scanner.nextInt();
        if (creditScore == 100){
            System.out.println("信用极好");
        } else if (creditScore > 79 & creditScore < 100) {
            System.out.println("信用优秀");
        } else if (creditScore > 59 & creditScore < 80) {
            System.out.println("信用一般");
        }
        else{
            System.out.println("信用不及格");
        }


    }
}
