package com.gaogao.extend_;

public class Computer {
    private String cpu;
    private double mem;
    private double hard;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }

    public double getHard() {
        return hard;
    }

    public void setHard(double hard) {
        this.hard = hard;
    }

    public Computer(String cpu, double mem, double hard) {

        setCpu(cpu);
        setMem(mem);
        setHard(hard);
    }

    public String getDetails() {
        return "cpu型号为" + cpu + ",内存为" + mem + "G,硬盘为" + hard + "G";
    }
}