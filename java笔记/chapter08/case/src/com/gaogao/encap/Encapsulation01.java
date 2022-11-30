package com.gaogao.encap;

public class Encapsulation01 {
        /*
        不能随便查看人的年龄，工资等隐私，
        并对设置的年龄进行合理的验证，年龄合理就设置，
        否则就给默认，年龄必须在1-120之间，工资不能直接查看，
        name的长度在2-6之间
         */
        public String name;
        private int age;
        private double salary;
        //自己写setXxx和getXxx太慢，我们使用快捷键alt + ins
        //然后根据要求来完善代码





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
