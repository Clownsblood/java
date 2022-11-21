public class ArrarExercise02 {
    public static void main(String[] args) {

        //请求出一个数组int[]的最大值{4，-1，9，10，23}并得到对应的下标
//        int num[];
//        num = new int[1];
        int[] num = {4,-1,9,10,23};
        int max = num[0];
        int xiabiao = 0;


        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                xiabiao = i;
            }
        }
        System.out.println(max);
        System.out.println(xiabiao);



    }
}
