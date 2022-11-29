public class VarParameter01 {
    public static void main(String[] args) {
        GshMethod hspMethod = new GshMethod();
        System.out.println(hspMethod.sum(20,21));

    }
}

class GshMethod {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public int sum(int n1, int n2, int n3,int n4) {
        return n1 + n2 + n3 + n4;
    }
    //上面的方法名称相同，功能相同
    // 参数个数不同-》使用可变参数优化
    //int... 表示接收的是可变参数，类型是int，即可以接收多个（0-多）
    //使用可变参数时，可以当作数组使用，即nums可以当作数组
    public int sum(int... nums){
//        System.out.println("接收的参数个数 = " + nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            res += nums[i];
        }
        return res;
    }




}