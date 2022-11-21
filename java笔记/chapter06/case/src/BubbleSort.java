public class BubbleSort {
    public static void main(String[] args) {
        /*
        总结冒泡排序特点：
        1.一共有五个元素
        2.一共进行了4轮排序，可以看成是外层循环
        3.每一轮排序可以确定一个数的位置，比如第一轮确定最大的数，第二轮确定第二大的数位置
        4.当进行比较时，如果前面的数大于后面的数，就交换
        5.每轮比较在减少
        * */

        //化繁为简，先死后活
        int temp = 0;//用于交换的变量

        int[] arr = {1,5,3,4,2};



        for (int i = 0; i < arr.length -1; i++){
            int num = 0;
            for (int j = 0; j < 4; j++){
                //如果前面的数大于后面的数，就交换
                if (arr[j] > arr[j + 1]){

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    num += 1;



                }
            }
            if (num == 0){
                System.out.println("已经排序好啦，不需要再继续了！");
                break;
            }
            System.out.println("第" + (i + 1) + "轮排序后");

            for (int j = 0; j < arr.length; j++){
                System.out.println(arr[j]);
            }
        }
    }
}
