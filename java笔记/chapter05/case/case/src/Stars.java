public class Stars {
    public static void main(String[] args) {
        /*
        思路分析
        化繁为简
        1.先打印一个矩形

         */
        //矩形
        for (int i = 1; i <= 5; i++){
            System.out.println("*****");
        }
        //打印半个金字塔
        for (int i = 1; i <= 5; i++){

            //在打印*之前要打印空格
            for (int k = 1; k <= 5 - i; k++){



                System.out.print(" ");
            }


            //i表示层数
            //控制每层打印的*的个数
            for (int j = 1; j <= 2 * i - 1; j++){
                if (j == 1 || j == 2 * i - 1 || i  == 5){
                    System.out.print("*");
                }
                else {

                    System.out.print(" ");
                }


            }
            //每打印完一层的*后就换行  println本身就会换行

            System.out.println();
        }





    }
}
