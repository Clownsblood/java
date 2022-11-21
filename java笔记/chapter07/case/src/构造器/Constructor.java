package 构造器;

public class Constructor {
    public static void main(String[] args) {
//        Person p1 = new Person("smith",80);
//        System.out.println(p1.name + p1.age);
        Dog dog01 = new Dog();
        System.out.println(dog01.age);
        Dog dog02 = new Dog("xiaobai",18);
        System.out.println(dog02.age);
        System.out.println(dog02.name);

    }
}

class Person{
    String name;
    int age;
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;


    }
}


class Dog{

    int age;
    String name;
    public Dog(){
        age = 18;
    }
    public Dog(String pName,int pAge){
        name = pName;
        age = pAge;
    }


}

