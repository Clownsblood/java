package com.gaogao.super_;

public class B extends A{
    //访问父类的属性，按hi不能访问问父类的private属性
    // super.属性名
    public  void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " +  super.n3);
    }

    public void sum(){
        System.out.println("B类的sum方法");
        //希望调用父类A的cal方法
        //这时，因为子类B没有cal方法，因此我可以使用下面三种方式
        //
        cal();//找calc方法时，顺序是，先找本类，如果有，则调用，如果没有，
        // 则找父类（并且可调用则调用，如果没有则继续向上直到Object）
    }


    public void ok(){
        super.test100();
        super.test200();
        super.test300();
//        super.test400();   会报错，因为test400时私有方法
    }


}
