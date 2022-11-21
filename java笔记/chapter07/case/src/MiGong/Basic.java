package MiGong;

public class Basic {
    public static void main(String[] args) {
        //思路分析
        //1.设置地图
        //2.0表示可以走  1表示是墙，2表示可以走，3表示不能走
        int[][] map = new int[6][6];
        for (int i = 0; i < 6; i++){
            map[0][i] = 1;
            map[5][i] = 1;
        }
        for (int i = 0; i < 6; i++){
            map[i][0] = 1;
            map[i][5] = 1;
        }

        map[1][4] = 1;
        map[2][1] = 1;
        map[3][3] = 1;
        map[4][1] = 1;
        map[4][2] = 1;

        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }


        Test test = new Test();
        if (test.findWay(map,1,1)){
            System.out.println("老鼠走出迷宫了");
        }else {
            System.out.println("老鼠迷路了");
        }
    }
}


//迷宫类
class Test{
    public boolean findWay(int[][] map,int i,int j){
        if (map[4][4] == 2){
            return true;
        }else {
            if (map[i][j] == 0){//如果该位置是0，则可以走通，将该位置置成2
                map[i][j] = 2;
                System.out.println("当前位置(" + i + "," + j + ")");
                //使用策略  右下左上
                if (findWay(map, i, j + 1)){
                    //右
                    return true;
                } else if (findWay(map, i + 1, j)) {
                    //下
                    return true;

                } else if (findWay(map,i,j - 1)) {
                    //左
                    return true;
                } else if (findWay(map,i - 1,j)) {
                    //上
                    return true;
                }else {
                    return false;
                }


            }else {
                return false;
            }
        }

    }


}




