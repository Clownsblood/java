public class MethodDetail02 {
    public static void main(String[] args) {
        S s = new S();
        s.sayOk();
    }
}


class S{
    public void print(int n){
        System.out.println("打印n = " + n);

    }

    public void sayOk(){
        print(10);
        System.out.println("继续执行");
        m1();
    }
    public void m1(){
        B b = new B();
        b.hi();
    }


}

class B{
    public void hi(){
        System.out.println("B类中的hi（）被执行");
    }
}


