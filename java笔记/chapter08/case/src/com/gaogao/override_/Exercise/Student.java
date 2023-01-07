package com.gaogao.override_.Exercise;

public class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
//        return "name = " + getName() + ",age = " + getAge()  + ",id = " + "score" + score;
        return super.say() + ",id = " + ",score = " + score;
    }
}
