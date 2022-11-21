public class HomeWork07 {
    public static void main(String[] args) {
//        7.输出小写的a-z以及大写的Z-A
        char c = 'a';
        char C = 'Z';

        for (int i = 0; i < 26; i++){
            System.out.println(c);
            c++;
        }
        for (int i = 0; i < 26; i++){
            System.out.println(C);
            C--;
        }


    }
}
