package bahuanghou;

public class Empresses {
    public static void main(String[] args) {
        int[] arr = new int[8];



    }
}


class T{
    //思路分析
    //1.先将第一个皇后放在第一行第一列
    //2.第二个棋子先尝试第二行第一列看可不可以，然后尝试第二行第二列第三列
    //3.继续第三个皇后，还是第一列，第二列……直到第八个皇后也能放在一个不冲突的位置，算是找到一个正确解
    //4.当得到一个正确解时，在栈回退到上一个栈时，就会开始回溯，即将第一个皇后放在第一列的所有正确解，全部得到
    //5.然后继续回头继续第一个皇后放在第二列，后面继续循环执行1，2，3，4步骤
//    public int[] HuangHou(int[] a){
//        a[0] = 0;
//        if ()
//    }




}