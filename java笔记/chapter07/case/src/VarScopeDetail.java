public class VarScopeDetail {
    public static void main(String[] args) {

        Person1 person1 = new Person1();
        person1.say();

    }
}

class Person1{
    String name = "jack";
    public void say(){
        //细节 属性和局部变量可以重名，访问时遵循就近原则
        String name = "king";

        System.out.println("say() name = " + name);
    }

    public void hi(){
        String address = "北京";
//        String address = "上海";//错误，重复定义变量
        String name = "jjj";
    }

}




