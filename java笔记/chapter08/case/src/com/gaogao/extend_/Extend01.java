package com.gaogao.extend_;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 15;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("==============");

        Graduate graduate = new Graduate();
        graduate.name = "大壮";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
