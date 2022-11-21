public class OverLoad01 {
    public static void main(String[] args) {
//        System.out.println(100);
//        System.out.println('A');
//        System.out.println("adsf");
//        System.out.println(true);
//        System.out.println(1.1);
        MyCalculator myCalculator = new MyCalculator();

        System.out.println(myCalculator.calc(1.1,2));

    }
}
class MyCalculator{
    public int calc(int n1,int n2){
        return n1 + n2;
    }
    public double calc(int n1,double n2){
        return n1 + n2;
    }
    public double calc(double n2,int n1){
        return n1 + n2;
    }
    public int calc(int n1,int n2,int n3){
        return n1 + n3;
    }
}


