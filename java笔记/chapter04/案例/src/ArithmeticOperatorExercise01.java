public class ArithmeticOperatorExercise01{
    public static void main(String[] args) {
//        int i = 1;//i->1
//        i = i++;//规则使用临时变量：（1）temp = i;(2)i = i + 1;(3)i = temp;
//        System.out.println(i);
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i = " + i);//i=10
        System.out.println("i2 = " + i2);//i2=20
        i = --i2;
        System.out.println("i = " + i);//i=19
        System.out.println("i2 = " + i2);//i2=19



    }
}