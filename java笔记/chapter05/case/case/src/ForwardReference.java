public class ForwardReference {
    public static void main(String[] args) {
        //向前引用实例
        int num1 = 1;
        int num2 = num1 + 2;
        System.out.println(num2);

        //错误演示
//        int num2 = num1 + 2;
//        int num1 = 1;


    }
}
