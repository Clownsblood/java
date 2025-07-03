import java.util.Scanner;

/**
 * @version 1.0
 * @ClassName Object02
 * @Author phantom
 * @Date 2025/4/12 11:34:41
 */
public class Object02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("调用前");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        new Utils().test(arr);
        System.out.println("调用后");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


class Utils{
    //1.访问修饰符
    //2.返回值类型
    //3.方法名
    //4.参数列表
    //5.方法体
    public void test(int[] arr){
        arr[0] = 100;
    }

}
