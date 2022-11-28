package this关键字;

public class ThisDetail {
    public static void main(String[] args) {
        T t1 = new T();

    }
}

class T{

    public T(){
        //如果要在一个构造器访问另一个构造器必须在第一句
        this("woshinibaba",1);
        System.out.println("默认构造器");

    }

    public T(String name,int age){
        System.out.println("String name,int age构造器被调用");
    }



    public void f1(){
        System.out.println("f1方法");
    }
    public  void f2(){
        System.out.println("f2方法");
        //调用本类方法f1
        //第一种方法
        f1();
        //第二种方法
        this.f1();
    }

}
