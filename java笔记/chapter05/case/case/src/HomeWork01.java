public class HomeWork01 {
    public static void main(String[] args) {
//        1.编程实现如下功能
//
//        某人有100000元，没经过一次路口，需要缴费，规则如下
//
//​	当现金>50000时，每次交5%
//
//​	当现金<=50000时，每次交1000
//
//        编程计算该人可以经过多少次路口，要求使用while break方式完成
        double money = 100000;
        int num = 0;
        boolean b = true;
        while (money > 0){
            if (money > 50000){
                money *=0.95;
                num++;
                System.out.println("正在经过第" + num + "次路口，还剩" + money + "元钱");

            }
            else if (money <= 50000){
                money = money - 1000;
                num++;
                System.out.println("正在经过第" + num + "次路口，还剩" + money + "元钱");
                if (money < 1000){
                    break;

                }
            }
        }


    }
}
