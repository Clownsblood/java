
public class DoWhileExercise01 {
    public static void main(String[] args) {
        //统计0-200之间能被5整除但不能被3整除的个数
        //
        int sum = 0;
        int i = 0;
        do{

            if(i % 5 == 0 & i % 3 != 0){
                sum += 1;
            }
            i += 1;
        }while (i <= 200);
        System.out.println(sum);


    }
}
