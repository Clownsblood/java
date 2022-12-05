package com.gaogao.extend_;

public class Sub extends Base {
//    int n3 = 300;


    public Sub() {
        //构造器
        super(10);//父类没有默认构造器，必须使用super()指定使用哪一个构造器
        System.out.println("sub()构造器被调用");
    }

    public void sayOk() {
        //子类方法
        //非私有的属性和方法可以在子类直接访问
        System.out.println(" " + n1 + " " + n2 + " " + n3 + " " + getN4());
        test100();
        test200();
        test300();
        calltest400();

    }
}
