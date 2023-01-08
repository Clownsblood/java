package com.gaogao.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog1 = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog1,bone);

        //如果动物很多，食物很多
        //===》feed方法很多，不利于管理


    }
}
