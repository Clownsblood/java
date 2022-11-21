public class VarParameterExercise {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.showScore("小白",60.1,60.1));

    }
}

class Student{
    public String showScore(String s,double... nums){

        double score = 0;

        for (int i = 0; i < nums.length; i++){
            score += nums[i];
        }
        return s + " 有 " + nums.length + "门课，，总分为：" + score;
    }
}
