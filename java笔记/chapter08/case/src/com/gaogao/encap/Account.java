package com.gaogao.encap;

public class Account {
    private String name;
    private double remainder;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("名字必须为2-4字符，否则给默认名字无名氏");
            this.name = "无名氏";
        }
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        if (remainder > 20){
            this.remainder = remainder;
        }else {
            System.out.println("余额小于20，做清零处理");
            this.remainder = 0;
        }

    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        if (passwd.length() == 6){
            this.passwd = passwd;
        }else {
            System.out.println("密码必须为六位，否则默认密码为123456");
            this.passwd = "123456";
        }
    }

    public Account(String name, double remainder, String passwd) {
        setName(name);
        setRemainder(remainder);
        setPasswd(passwd);
    }
    public String info(){
        return "name = " + name + " remainder = " + remainder + " passwd = " + passwd;
    }

}
