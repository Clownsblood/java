package com.gaogao.extend_;

public class Sub extends Base {
//    int n3 = 300;

    public Sub(String name,int age){
        //想在调用这个构造器的时候调用父类的无参构造器
        super();//调用父类的无参构造器，或者不写，默认调用无参构造器
        System.out.println("构造器Sub(String name,int age)被调用");
    }
    public Sub() {
        //构造器
        super(10);//父类没有默认构造器，必须使用super()指定使用哪一个构造器
        //super和this必须都在第一句，所以super和this不能共存
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
