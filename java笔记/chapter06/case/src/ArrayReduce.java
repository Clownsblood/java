import java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args) {
        //数组缩减
        //有一个数组{1,2,3,4,5}可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素，当只剩下最后一个元素时，提示：不能再缩减
        /*
        思路分析
        1.原数组
        2.创建一个新数组，长度为原数组减一，将原数组除了最后一个元素外拷贝到新数组
        3.将原数组指向新数组
        */

        Scanner scanner = new Scanner(System.in);



        int[] arr = {1,2,3,4,5};//原数组

        do {



        if (arr.length <= 1){
            System.out.println("就剩一个元素啦，不能再缩减了哦");
            break;
        }
        //定义一个新数组，将新数组拷贝到新数组中
        int[] arr2 = new int[arr.length - 1];



        //拷贝
        for (int i = 0; i < arr.length - 1; i++){
            arr2[i] = arr[i];
        }

        //指向新数组
        arr = arr2;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("请问是否继续缩减 y/n");

        char c = scanner.next().charAt(0);
        if (c == 'n'){
            break;
        }




        }while(true);




    }
}
