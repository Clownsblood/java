package com.gaogao.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说，属性的值看编译类型
        Base base = new Sub();
        System.out.println(base.count);



    }
}

class Base{//父类
    int count = 10;//属性

}


class Sub extends Base{//子类
    int count = 20;//属性
}
