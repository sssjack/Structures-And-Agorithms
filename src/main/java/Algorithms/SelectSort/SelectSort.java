package Algorithms.SelectSort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] arr = new int[]{3,2,4,5,6,8,7,1};
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length-1; j > i ; j--){
                if(arr[j]<arr[i]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }

        }
        System.out.println("ѡ�������Ľ����"+ Arrays.toString(arr));
    }
}
