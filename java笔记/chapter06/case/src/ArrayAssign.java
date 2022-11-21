public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值，赋值方式为值拷贝
        //n2的变化，不会影响n1的值
//        int n1 = 10;
//        int n2 = n1;
//
//        n2 = 80;
//        System.out.println("n1 = " + n1);
//        System.out.println("n2 = " + n2);

        //数组在默认情况下是引用传递，赋的值是地址，赋值的方式为引用赋值
        //是一个地址，arr2变化会影响到arr1

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 5;
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i] + " " + arr2[i]);

        }



    }
}
