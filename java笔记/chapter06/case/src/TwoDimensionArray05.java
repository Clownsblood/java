public class TwoDimensionArray05 {
    public static void main(String[] args) {

        //干啥嫩啊啊啊啊//小傻子上我电脑写的
        //遍历数组并求出和
        int arr[][] = {{4,6},{1,4,5,7},{-2}};

        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);



    }
}
