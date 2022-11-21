public class ArrayAdd {
    public static void main(String[] args) {

        //定义初始数组int[] arr = {1,2,3}
        //将原数组拷贝到新数组，新数组的长度是arr.length + 1
        int[] arr = {1,2,3};//原数组
        int[] arrNew = new int[arr.length + 1];//新数组
        for (int i = 0; i < arr.length; i++){//将原数组的值赋给新数组
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;//把4赋给新数组的最后一个值
        arr = arrNew;//将原数组指向新数组，原数组内存空间将会被垃圾回收处理
        for (int i = 0; i < arr.length; i++){//遍历arr
            System.out.println(arr[i]);
        }



    }
}
