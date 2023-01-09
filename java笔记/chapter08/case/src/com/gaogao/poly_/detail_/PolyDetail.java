package com.gaogao.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();

        Animal animal = new Cat();

        //可以调用父类中的所有成员（需遵守访问权限）
        //但是不能调用子类的特有成员
        //因为在编译阶段，能调用哪些成员是由编译类型决定的
//        animal.catchMouse();错误
        //最终运行效果看子类的具体实现，即调用方法时，按照从子类（运行类型）开始查找方法
        //然后调用，规则和方法调用规则一致
        animal.eat();//猫吃鱼
        animal.run();//跑
        animal.show();//hello，你好
        animal.sleep();//睡

        Cat cat = (Cat) animal;
        cat.catchMouse();

        Animal animal1 = new Dog();
        Dog dog = (Dog) animal1;
        dog.cry();

    }
}
