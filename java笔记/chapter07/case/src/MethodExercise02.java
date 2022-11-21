

public class MethodExercise02 {
    public static void main(String[] args) {

        Person01 p = new Person01();
        p.name = "jack";
        p.age = 100;

        Tools tools = new Tools();
        Person01 p2 = tools.copyPerson(p);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p = p2);


    }
}

class Person01{
    String name;
    int age;
}

class Tools{

    //编写一类MyTools类，编写一个方法可以打印二维数组的数据
    //编写方法copyPerson 可以复制一个Person对象，返回复制的对象。克隆对象
    //注意要求得到的新对象和原来的对象是两个独立的对象，只是他们的属性相同

    public Person01 copyPerson(Person01 p){
//        System.out.println();
        Person01 p2 = new Person01();
        p2.name = p.name;
        p2.age = p.age;

        return p2;

    }




}
