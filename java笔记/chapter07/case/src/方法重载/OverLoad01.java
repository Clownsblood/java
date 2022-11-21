package 方法重载;

public class OverLoad01 {
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        System.out.println(myCalc.calc(1,2,1));
    }
}

class MyCalc{
    public int calc(int n1,int n2){
        System.out.println("方法一被调用");
        return n1 + n2;
    }
    public double calc(int n1,double n2){
        System.out.println("方法二被调用");
        return n1 + n2;

    }
    public double calc(double n2,int n1){
        System.out.println("方法三被调用");
        return n1 + n2;
    }
    public int calc(int n1,int n2,int n3){
        System.out.println("方法四被调用");
        return n1 + n2 + n3;
    }

}

