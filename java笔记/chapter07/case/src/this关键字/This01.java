package this关键字;

public class This01 {
    public static void main(String[] args) {

        Dog dog01  = new Dog("xiaobai",5);
        System.out.println(dog01.hashCode());
        dog01.info();

    }
}
class Dog{
    String name;
    int age;
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){

        System.out.println(name + " \t" + age + "\t");
        System.out.println(this.hashCode());

    }

}
