public class Method02 {
    public static void main(String[] args) {
        //定义原始数组
        int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
        MyTools tools = new MyTools();

        while(true){
            for (int i = 0; i < 5; i++){
                tools.tool(map);

            }
            break;
        }

    }
}

class MyTools{
    public void tool(int[][] map){
        //用for循环嵌套，遍历二维数组
        for (int i = 0; i < map.length; i++){//外层表示二维数组内一维数组的个数
            for (int j = 0; j < map[i].length; j++){//每个一维数组的个数
                //输出每个元素
                System.out.print(map[i][j] + " ");
            }
            //打印换行
            System.out.println();
        }
    }
}
