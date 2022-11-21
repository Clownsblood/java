import java.util.Scanner;
public class BreakExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += i;
            if (sum > 20){
                System.out.println(i);
                System.out.println(sum);
                break;
            }
        }
    }
}
