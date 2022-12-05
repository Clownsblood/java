package com.gaogao.extend_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public int getN4() {
        return n4;
    }


    //把默认构造器注释掉，我们可以看到在sub.java中构造器位置报错了，所以我们应该使用super(10)在super中指定使用哪一个父类的构造器
//    public Base(){
//
//        System.out.println("Base()默认构造器被调用");
//    }
    public Base(int a){
        //有参构造器
        System.out.println("Base(int a)被调用了");
    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    public void calltest400(){
        test400();
    }











}
