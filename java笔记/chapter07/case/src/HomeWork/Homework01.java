package HomeWork;

public class Homework01 {
    public static void main(String[] args) {

        //编写类A01，定义方法max，实现求某个double数组的最大值，并返回
        A01 a01 = new A01();
        double[] a = {};
        System.out.println(a01.max(a));

    }
}

class A01{

    public double max(double[] a){
        if (a.length == 0){
            System.out.println("数组为空");
            return 0;
        }

        double m = a[0];

        for (int i = 1; i < a.length; i++){


            if (a[i] > m){
                m = a[i];
            }
        }
        return m;
    }
}

