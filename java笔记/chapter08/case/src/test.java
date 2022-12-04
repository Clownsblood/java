public class test {
    public static void main(String[] args) {
        Calc calc = new Calc(1.1,0);
        System.out.println(calc.doDivide());
    }
}

class Calc{
    double num1;
    double num2;
    public Calc(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    //计算功能
    public double doAdd(){
        return num1 + num2;
    }
    public double doMinus(){
        return num1 - num2;
    }
    public double doRaid(){
        return num1 * num2;
    }
    public double doDivide(){
        if (num2 == 0){
            System.out.println("您输入的被除数为0");
            return 0;
        }else {
            return num1 / num2;
        }
    }

}


