package com.gla.Arrays;
import java.util.Arrays;
public class array_practice {

    public int[] swap(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               if(arr[i]>arr[j]) {
                   temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        array_practice practice = new array_practice();
        int[] arr = {4,5,32,6,7,8};
        System.out.println(Arrays.toString(practice.swap(arr)));
    }
}
