import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Pig pig = new Pig("xiaozhu",5);
        System.out.println(pig.name);
        System.out.println(pig.age);
        System.out.println(pig.hashCode());
    }
}

class Pig{

    String name;
    int age;

    public Pig(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }
}
