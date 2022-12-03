package com.gaogao.extend_.improve;

import com.gaogao.extend_.Graduate;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小刚";
        pupil.age = 15;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("==============");

        com.gaogao.extend_.Graduate graduate = new Graduate();
        graduate.name = "小红";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
