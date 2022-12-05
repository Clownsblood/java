package com.gaogao.extend_;

public class NotePad extends Computer {


    private String color;


    public NotePad(String cpu, double mem, double hard) {
        super(cpu, mem, hard);


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

