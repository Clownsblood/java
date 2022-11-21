public class ForExercise {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= 30000; i++){
            if (i % 9 == 0){
                num += 1;
                sum += i;
                System.out.println(i);
            }

        }
        System.out.println("一共有" + num + "个9的倍数，和是" + sum);



    }
}
