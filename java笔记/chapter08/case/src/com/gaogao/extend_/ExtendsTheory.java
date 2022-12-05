package com.gaogao.extend_;
import com.gaogao.modifier.A;
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //此时访问son.name
        //1.首先看子类中有没有该属性
        //2.如果子类中有该属性并且可以访问，则返回信息
        //3.如果子类中没有这个属性，就向上访问父类看有没有该属性（如果有并且可以访问就返回信息）
        //4.如果父类没有就按照3的规则继续找上级父类，直到Object
        System.out.println(son.name);
    }
}
class GrandPa {
    //爷爷类

    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 30;
}
class Father extends GrandPa {
    //父类

    String name = "大头爸爸";
    private int age = 39;
}
class Son extends Father {
    //子类
    String name = "大头儿子";
}
