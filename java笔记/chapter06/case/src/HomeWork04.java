public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        int[] arr1 = new int[arr.length + 1];
        int insert = 23;
        int sub = -1;//记录下标
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= insert){
                sub = i;//
                System.out.println(sub);
                break;
            }
        }
        if (sub == -1){//如果没有找到位置

        }

        for (int i = 0; i < arr1.length; i++){

            if (i == sub){
                arr1[i] = insert;
            }else {
                if (i > sub){
                    arr1[i] = arr[i -1];
                }
                else {
                    arr1[i] = arr[i];
                }

            }
        }
        arr = arr1;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
