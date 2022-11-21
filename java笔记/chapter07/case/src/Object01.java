public class Object01 {
    public static void main(String[] args) {
        /*
        张老太养了两只猫猫：一只名字叫小白，白色，今年三岁，还有一只叫小花，今年一百岁，花色。
        请编写一个程序，当用户输入小猫名字的时候，就显示该猫的名字，年龄，颜色。
        如果用户输入的小猫名错误，就显示，张老太没有这只猫猫
        */
        //单独变量来解决,不利于数据的管理（把一只猫的信息拆解）
//        String cat1Name = "小白";
//        String cat2Name = "小花";
//
//        int cat1age = 3;
//        int cat2age = 100;
//
//        String cat1color = "白色";
//        String cat2color = "花色";
//
//        //数组  ==》数据类型体现不出来，只能通过下标获取信息，造成了变量名和内容对应关系不明确
//        //不能体现猫的行为
//
//
//        String[] cat1 = {"小白","3","白色"};
//        String[] cat2 = {"小花","100","花色"};

        //使用OOP面向对象解决
        //实例化一只猫【创建一个对象】

        //1.new Cat() 创建一只猫
        //2.Cat cat1 = new Cat();把创建的猫赋给cat1
        //cat1就是一个对象，cat2也是一个对象（猫对象）


        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        //第二只猫，叫cat2
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        //怎么访问对象的属性

        System.out.println("第一只猫的信息是" + " " + cat1.name + " " + cat1.age + " " + cat1.color + " ");
        System.out.println("第二只猫的信息是" + " " + cat2.name + " " + cat2.age + " " + cat2.color + " ");


    }
}



//使用面向对象的方式来解决养猫问题
//定义一个猫类-》相当于一个自定义的数据类型
class Cat{
    //属性
    String name;//名字
    int age;//年龄
    String color;//颜色


    //行为


}