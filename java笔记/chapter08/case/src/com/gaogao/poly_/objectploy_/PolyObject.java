package com.gaogao.poly_.objectploy_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态的特点

        //animal 编译类型就是Animal，运行类型是Dog()
        Animal animal = new Dog();
        animal.cry();
    }
}
