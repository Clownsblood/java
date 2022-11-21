public class OverLoadExercise {
    public static void main(String[] args) {
        Method method = new Method();
        Methods methods = new Methods();
        System.out.println(method.m(2));
        System.out.println(method.m(2,3));
        method.m("alsdf ");

        System.out.println(methods.max(1,2));
        System.out.println(methods.max(2.1,2.1));
        System.out.println(methods.max(1.1,2.2,3.3));


    }
}

class Method{
    public int m(int n1){
        return n1 * n1;
    }
    public int m(int n1,int n2){
        return n1 * n2;
    }
    public void m(String s){
        System.out.println(s);
    }
}

class Methods{
    public int max(int n1,int n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2,double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n2 ? max1 : n2;
    }
}

