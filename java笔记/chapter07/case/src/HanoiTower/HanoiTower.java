package HanoiTower;

public class HanoiTower {
    public static void main(String[] args) {
        //
        Tower tower = new Tower();
        tower.move(64,'A','B','C');


    }
}
class Tower{
    //方法
    //num表示要移动的个数，a,b,c分别表示A塔，B塔，C塔

    public void move(int num,char a,char b, char c){
        if (num == 1){
            System.out.println(a + "->" + c + " " + num + " " + a + b + c);
        }else {
            //如果有多个盘，可以看成两个盘，最下面的和上面的所有盘
            //1.先移动上面所有的盘到B，借助C
            move(num - 1, a, c, b);
            //2.把最下面的这个盘，移动到C
            System.out.println(a + "->" + c + " "+ num + " " + a + b + c);
            //3.把B的所有盘移动到C，借助A塔
            move(num - 1, b, a, c);

        }
    }


}
