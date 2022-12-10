import java.util.Scanner;
public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("你还不还钱！不还的话，我将使用出闪电五连鞭（y/n）");
        char answer = ' ';
        do {
            answer = scanner.next().charAt(0);

            if (answer == 'y'){
                System.out.println("算你识相！");
            }else{
                System.out.println("闪电五连鞭！！！");
            }

        }while (answer == 'n');


    }
}
