import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("111");
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("asdfa",15);
        System.out.println(person.hashCode());

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
