package Algorithms.Sort.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 冒泡排序
 */
public class TestApp {
    public static void main(String[] args) {
        int[] arrays = new int[]{4,5,6,3,2,1};
        /**
         * for循环控制行数
         */
        for(int i =0;i<arrays.length-1;i++){
            /**
             * 控制比较次数
             */
            for(int j =0;j<arrays.length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int temp = 0;//类似空桶
                    temp = arrays[j];//蓝色的水倒入空桶
                    arrays[j] = arrays[j+1];//橘色的水导入蓝色空桶
                    arrays[j+1] = temp;//蓝水导入橘色空桶中
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
