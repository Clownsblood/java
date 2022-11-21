public class HomeWork06 {
    public static void main(String[] args) {


//        6.输出1-100之间的不能被五整除的数，每五个一行

        int num = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 5 != 0){
                if (num % 5 == 0){
                    System.out.println();
                }
                System.out.print(i + " ");
                num++;
            }
        }

    }

}
