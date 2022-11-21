public class ArrarExercise01 {
    public static void main(String[] args) {
//        创建一个char类型的26个元素的数组
//        分别放置'A'-'Z'使for循环访问所有元素并打印出来
        char array[];//声明数组
        array = new char[26];
        char c = 'A';
        for (int i = 0; i < array.length; i++){
            array[i] = c;
            c++;
        }

        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }

    }
}
