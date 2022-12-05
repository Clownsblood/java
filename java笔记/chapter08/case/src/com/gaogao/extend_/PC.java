package com.gaogao.extend_;

public class PC extends Computer {


    private String brand;


    public PC(String cpu, double mem, double hard) {

        super(cpu, mem, hard);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
