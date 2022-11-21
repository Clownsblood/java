import java.lang.module.ModuleDescriptor;

public class MethodExercise01 {
    public static void main(String[] args) {
        //编写类AA，有一个方法：判断一个数是奇数还是偶数，返回boolean

        A a = new A();

//        if (a.odd(3)){
//            System.out.println("该数是偶数");
//        }
//        else {
//            System.out.println("该数是奇数");
//        }

        a.printChar(10,10,'#');



    }
}
class A{
    public boolean odd(int i){
//        boolean b = true;
//        if (i % 2 == 0){
//            b = true;
//        }
//        else {
//            b = false;
//        }
//        return b;
//        if (i % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }

        return i % 2 == 0;

    }

    public void printChar(int row,int col,char c){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }


}



