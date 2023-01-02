package com.gaogao.override_;

public class Dog extends Animal{
    //因为Dog是Animal的子类
    //Dog的cry方法和Animal的cry定义形式一样()
    //这时我们就说Dog的cry方法，重写了Animal的cry方法


    public void cry(){
        System.out.println("小狗叫");
    }

    public String m1(){
        //子类返回的是Object的子类，父类返回的是Object，构成重写
        //如果反过来则报错
        return null;
    }

    //这里Object不是String的子类所以会编译错误
//    public Object m2(){
//        return null;
//    }

}

class AAA{

}

class BBB extends AAA{

}


