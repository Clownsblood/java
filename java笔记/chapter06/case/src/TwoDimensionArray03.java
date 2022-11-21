public class TwoDimensionArray03 {
    public static void main(String[] args) {
        //创建一个二维数组，但是只确定一维数组的个数

        int arr[][] = new int[10][];//创建一个二维数组，里面包含三个一维数组
        for (int i = 0; i < arr.length; i++){
            //给每个一维数组分配空间，i+1个空间
            arr[i] = new int[i + 1];
            //数组中的数等于 i + 1;
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = i +1;
            }

        }
        //遍历数组打印出来
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
