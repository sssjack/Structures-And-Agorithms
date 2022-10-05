package Algorithms.InsertSort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 3, 4, 7, 1, 8};
        for (int i = 1; i < array.length; i++) {//控制拿取每一个元素
            for (int j = i; j >= 1; j--) {//比较的次数
                if(array[j]<array[j-1]){//是否小于前面的元素
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else {
                    break;
                }

            }
        }
        System.out.println("排序后的结果："+ Arrays.toString(array));
    }
}

