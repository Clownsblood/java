package this关键字;

public class ThisDetail {
    public static void main(String[] args) {
        T t1 = new T();

    }
}

class T{
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
