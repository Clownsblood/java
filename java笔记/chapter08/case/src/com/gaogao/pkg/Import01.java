package com.gaogao.pkg;
import java.util.Arrays;
import java.util.Scanner;



public class Import01 {
    public static void main(String[] args) {
        int[] arr = {1,2,-2,4,45,13};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

}
