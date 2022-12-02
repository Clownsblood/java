package com.gaogao.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("gaogao");
        person.setAge(30);
        person.setSalary(999999);
        Person baibai = new Person("baibai", 15, 6000);
        System.out.println(baibai.info());

        System.out.println(person.info());

    }

}
/*
    不能随便查看人的年龄，工资等隐私，
    并对设置的年龄进行合理的验证，年龄合理就设置，
    否则就给默认，年龄必须在1-120之间，工资不能直接查看，
    name的长度在2-6之间
     */
//自己写setXxx和getXxx太慢，我们使用快捷键alt + ins
//然后根据要求来完善代码


class Person{

    public String name;
    private int age;
    private double salary;

    //先创建一个无参构造器

    public Person() {
    }

    //创建一个带有三个参数的构造器，调用一下试试
    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("请输入2-6字符的名字，给一个默认名字无名氏");
            this.name = "无名氏";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("您的输入有误，给一个默认年龄0");
            this.age = 0;
        }


    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        //用来返回属性信息
        return "信息为 name = " + name + " age = " + age + " 薪水 = " + salary;
    }


}

