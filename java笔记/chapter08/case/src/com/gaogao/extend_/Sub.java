package com.gaogao.extend_;

public class Sub extends Base{
//    int n3 = 300;


    public Sub(){
        //构造器
        System.out.println("sub()...");
    }
    public void sayOk(){
        //子类方法
        //非私有的属性和方法可以在子类直接访问
        System.out.println(" " + n1 + " " + n2 + " " + n3);
        test300();
    }
}
