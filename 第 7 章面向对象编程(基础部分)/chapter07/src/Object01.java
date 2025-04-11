/**
 * @version 1.0
 * @ClassName Object01
 * @Author phantom
 * @Date 2025/4/5 19:38:47
 */
public class Object01 {
    public static void main(String[] args){

        Cat cat1 = new Cat();
        System.out.println(cat1.add(100));
    }
}
class Cat{
    String name;
    int age;
    String color;
    public void say(){
        System.out.println("喵喵喵~");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void add(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum+=i;
        }
        return;
    }

}