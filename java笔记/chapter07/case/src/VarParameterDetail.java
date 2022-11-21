public class VarParameterDetail {
    public static void main(String[] args) {
        //可变参数的实参可以为数组
        int[] arr = {1,2,3};
        T t1 = new T();
//        t1.f1(arr);
        //可变参数可以和普通类型的参数一起放在形参列表
        //但必须保证可变参数放在最后
        t1.f1(1,2,1,1,1,1,1,1);
    }
}

class T{
    public void f1(int i,double j,int... nums){
        System.out.println(nums[2]);

    }

}


