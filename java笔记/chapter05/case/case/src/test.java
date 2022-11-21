public class test {
    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++){
//            System.out.println((int)(Math.random() * 100) + 1);
//
//        }
        int num = (int)(Math.random() * 100) + 1;
        int sum = 0;
        int i = 1;
        while (num != 97){
//            num = (int)(Math.random() * 100) + 1;
            System.out.println("第" + i + "个数字为：" + num);
            if (num != 97){
                sum++;
                i++;
            }
            num = (int)(Math.random() * 100) + 1;
        }
        System.out.println(num);



//        do {
//            num = (int)(Math.random() * 100) + 1;
//            System.out.println("第" + i + "次循环的数字为：" + num);
//            if (num != 97){
//                sum++;
//                i++;
//            }
//        } while (num != 97);
        System.out.println("共" + sum + "次");
    }
}

