public class VarScope {
    public static void main(String[] args) {

    }
}

class Cat1{

    double weight;//属性有默认值，和数组一致
//    public void hi(){
//        int num;
    //编译不通过，局部变量没有默认值，必须赋值后再使用
//        System.out.println("num = " + num);
//    }


    int age = 10;

    public void cry(){
        //局部变量一般是指在成员方法中定义的变量
        //n和name就是局部变量
        //n和name的作用域在cry方法中

        int n = 10;
        String name = "jack";
        System.out.println("在cry中使用age = " + age);


    }

    public void eat(){
        System.out.println("在eat中使用age = " + age);
    }

}
