package this关键字;

public class TestPerson {
    public static void main(String[] args) {
        //问题分析
        //1.调用比较方法判断是否相同，如果完全相同就返回true
        Person p1 = new Person("xiaoming",15);
        Person p2 = new Person("xiaoming",15);
        System.out.println(p1.compareTo(p2));

    }
}


class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Boolean compareTo(Person p){
        return this.name.equals(p.name) && this.age == p.age;
    }



}

