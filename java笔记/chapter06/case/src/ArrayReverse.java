public class ArrayReverse {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11,22,33,44,55,66};
        int[] arr1 = new int[arr.length];
        for (int i = arr.length - 1,j = 0; i >= 0; i--,j++){
            //逆序遍历arr再正着赋给arr1
            arr1[j] = arr[i];
        }
        //把arr指向arr1
        //原本arr的地址指向的内存会被当成垃圾进行销毁
        arr = arr1;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
