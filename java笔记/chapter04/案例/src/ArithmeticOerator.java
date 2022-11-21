public class ArithmeticOerator{
    
    public static void main(String[] args) {
        // System.out.println(10 /4);//从数学角度说，应该是2.5，Java中最高精度是整数，所以应该是2
        // double d = 10/4;
        // System.out.println(d);

        //％取余，取模
        // 在Java中%的本质是一个公式，a%b=a-a/b*b
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);

        int j = 8;
        
        // int k = ++j;//等价 j = j + 1; k = j;

        int k = j++;//等价于k = j; j = j + 1;

        System.out.println("k = " + k + " j = " + j);

    }
}