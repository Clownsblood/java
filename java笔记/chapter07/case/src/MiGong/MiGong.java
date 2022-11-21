package MiGong;

public class MiGong {
    public static void main(String[] args) {
        //思路：
        //1.先创建迷宫，用二维数组表示int[][] map = new int[8][7];
        //2.先规定map数组的元素值：0表示可以走 1表示有障碍物
       int[][] map = new int[8][7];
       for (int i = 0; i < 7; i++){
           map[0][i] = 1;
           map[7][i] = 1;
       }
       for (int i = 0; i < 8; i++){
           map[i][0] = 1;
           map[i][6] = 1;
       }

       map[3][1] = 1;
       map[3][2] = 1;
       map[1][2] = 1;
       map[2][2] = 1;


       for (int i = 0; i < map.length; i++){
           for (int j = 0; j < map[i].length; j++){
               System.out.print(map[i][j] + " ");
           }
           System.out.println();
       }

       T t = new T();
       if (t.findWay(map,1,1)){
           System.out.println("老鼠找到出路了");
       }else {
           System.out.println("老鼠找不到出路");
       }


    }
}

class T{
    //使用递归回溯的思想解决老鼠出迷宫
    //有没有出迷宫返回一个布尔值


    //解读
    //1.如果找到，就返回true，否则返回false
    //2.map就是二维数组，即表示迷宫
    //3.i，j表示老鼠的位置，初始的位置为（1，1）
    //4.因为是递归找路，所以先规定 map数组的各个值的含义
    //5.  0 表示未探索但是可以走，1表示障碍物，2表示可以走，3表示曾经走过但是走不通
    //6.当（6，5）位置变成2时，表示走通了
    //7.设置探索策略，（下右上左）
    public boolean findWay(int[][] map, int i,int j){
        if (map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] == 0) {//当前位置0，说明可以走
                //假定可以走通,就将该位置置成2
                map[i][j] = 2;
                System.out.println("当前位置(" + i + "," + j + ")");
//                for (int m = 0; m < map.length; m++){
//                    for (int n = 0; n < map[i].length; n++){
//                        System.out.print(map[m][n] + " ");
//                    }
//                    System.out.println();
//                }
                if (findWay(map,i + 1,j)){
                    //判断向下能否走通
                    return true;
                } else if (findWay(map, i, j +1)) {
                    //右
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    //上
                    return true;
                } else if (findWay(map,i,j - 1)) {
                    //左
                    return true;
                }
                else {
                    //如果该位置下右上左都走不通，则将该位置置成3
                    map[i][j] = 3;
                    return false;
                }

            }else {
                //使用策略，来确定该位置是否真的可以走通
                //下右上左
                return false;


            }
        }
    }

}









