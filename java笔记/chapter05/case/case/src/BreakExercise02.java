import java.util.Scanner;
public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chance = 3;
        String username = "丁真";
        String password = "666";
        for (int i = 0; i < 3 ;i++){
            System.out.println("请输入用户名：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String passwd = scanner.next();
            if (username.equals(name) & password.equals(passwd)){
                System.out.println("登陆成功");
                break;
            }
            else{
                chance--;
                System.out.println("您输入的用户名或密码错误，您还有" + chance + "次机会");
            }

        }
    }
}
