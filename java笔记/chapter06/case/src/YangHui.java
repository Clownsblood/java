import javax.swing.*;

public class YangHui {
    public static void main(String[] args) {
        //规律
        //第一行有一个元素，第n行有n个元素
        //每一行的第一个元素和最后一个元素都是1
        //从第三行开始，对于非第一个元素和最后一个元素的值 arr[i][j]
        //arr[i][j] = arr[i -1][j] + arr[i-1][j-1];
        /*
        *
        *
        *     1
        *    1  1
        *   1  2  1
        *  1  3  3  1
        * 1  4  6  4  1
        arr[i][j] = arr[i-1][j] + arr[i-1][j-1];


        * */
        int yanghui[][] = new int[13][];

        for (int i = 0; i < yanghui.length; i++){
            //遍历yanghui的每个元素
            yanghui[i] = new int[i + 1];
            //给每个一维数组赋值
            //赋值的时候遵循上面的规律
            for (int j = 0; j < yanghui[i].length; j++){
                //第一个和最后一个元素为1
                if (j == 0 | j == yanghui[i].length - 1){
                    yanghui[i][j] = 1;
                }
                else {
                    //中间的元素
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];

                }
            }

        }
        for (int i = 0; i < yanghui.length; i++){
            for (int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j] + "\t\t");
            }
            System.out.println();
        }


    }
}
