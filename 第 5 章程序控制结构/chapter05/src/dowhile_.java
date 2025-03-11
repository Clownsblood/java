import java.util.Scanner;

public class dowhile_ {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
//        while(a < 10){
//            System.out.println("Hello");
//            a++;
//        }
        do {
            System.out.println("Hello");
            a++;
        }while (a < 10);



    }
}
