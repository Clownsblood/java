package this关键字;

public class This01 {
    public static void main(String[] args) {
        Dog dog01  = new Dog("xiaobai",5);
        dog01.info();
    }
}
class Dog{
    String name;
    int age;
    public Dog(String dName,int dAge){
        name = dName;
        age = dAge;
    }
    public void info(){
        System.out.println(name + " \t" + age + "\t");
    }


}


