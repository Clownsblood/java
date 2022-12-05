package com.gaogao.extend_;

public class ExtendsExercise03 {
    public static void main(String[] args) {

        PC pc = new PC("英特尔", 2, 512);
        pc.setBrand("戴尔");
        System.out.println("电脑的配置为 " + pc.getDetails() + pc.getBrand());
        NotePad notePad = new NotePad("AMD", 4, 1024);
        notePad.setColor("黑色");
        System.out.println("notepad的配置为 " + pc.getDetails() + notePad.getColor());


    }
}







