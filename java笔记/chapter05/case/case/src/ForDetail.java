public class ForDetail {
    public static void main(String[] args) {
        int count = 3;
        //此时i的作用域只有for循环内，如果需要循环过后还使用，需要把i定义在循环外面

        for (int i = 0,j = 0;i < count; i += 2){
            System.out.println("i = " + i + " j = " + j);
        }
    }

}
