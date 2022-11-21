import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {

        /*

        定义初始数组int[] arr = {1,2,3}
        将原数组拷贝到新数组，新数组的长度是arr.length + 1

        思路分析
        1.定义初始数组int[] arr = {1,2,3}//下标0-2
        2.定义一个新数组int[] arrNew = new int[arr.length + 1]
        3.遍历arr数组，依次将arr的元素拷贝到arrNew数组
        4.将4赋给arrNew[arrNew.length - 1]
        5.让arr指向arrNew; arr = arrNew;那么原来的数组就被销毁
        6.创建一个Scanner 可以接收用户输入
        7.因为用户什么时候退出不确定，所以使用do-while + break 来控制

*/

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3};//原数组


        do {

        int[] arrNew = new int[arr.length + 1];//新数组




            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }

            System.out.println("请输入你要添加的元素");

            int addNum = scanner.nextInt();

            arrNew[arrNew.length - 1] = addNum;

            arr = arrNew;

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.println("是否继续添加y/n");

            char c = scanner.next().charAt(0);

            if (c == 'n'){
                break;
            }

        }while(true);
    }
}
