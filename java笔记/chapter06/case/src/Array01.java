public class Array01 {
    public static void main(String[] args) {
        //有六只鸡，它们的体重分别是3，5，1，3.4，2，50kg
        //请问这六只鸡得到总体重是多少？平均体重是多少
//        思路分析
//                1.定义六个变量，double，求和
        //传统实现的方式问题，6->600-566很麻烦
//        double hen1 = 3;
//        double hen2 = 5;
//        double hen3 = 1;
//        double hen4 = 3.4;
//        double hen5 = 2;
//        double hen6 = 50;

//        double totalWeight = hen1 + ... +
        //定义一个数组
        //1.double[]表示是double类型的数组，数组名hens
        //2.{3,5,1,3.4,2,50}表示数组的值、元素，一次表示数组的第几个元素
        double[] hens = {3,5,1,3.4,2,50};
//        遍历数组得到数组的元素的和，使用for
        //使用一个变量将各个元素累计

        //可以通过 数组名.length 得到数组的大小/长度

        double totalWeight = 0;

        for (int i = 0; i < 6; i++){
            totalWeight += hens[i];

        }

        System.out.println("总体重为" + totalWeight + "kg");
        System.out.println("平均体重为" + totalWeight / 6);
    }
}
