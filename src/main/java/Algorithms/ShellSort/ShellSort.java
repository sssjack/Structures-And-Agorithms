package Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {7,3,2,5,9,4,8,1,6};
         shellSort(array); //交换法
        shellSort2(array);//移动法
    }

    /**
     * 交换方式
     * @param arrays
     */
    public static void shellSort(int[] arrays){
        int temp = 0;
        int count = 0;

        for (int gap = arrays.length/2;gap>0;gap/=2){
            for (int i=gap;i<arrays.length;i++){
                for (int j=i-gap;j>=0;j-=gap){
                    if (arrays[j]>arrays[j+gap]){
                        temp=arrays[j];
                        arrays[j] = arrays[j+gap];
                        arrays[j+gap] = temp;
                    }
                }
            }
            System.out.println("第"+(++count)+"轮  =  "+ Arrays.toString(arrays));
        }
    }

    /**
     * 移位法
     */
    public static void shellSort2(int[] arrays){
        for (int gap=arrays.length/2;gap>0;gap/=2){
            for (int i=gap;i<arrays.length;i++){
                int j=i;
                int temp = arrays[j];
                if (arrays[j]<arrays[j-gap]){
                    while (j-gap>=0 && temp<arrays[j-gap]){
                        //移动
                        arrays[j] = arrays[j-gap];
                        j-=gap;
                    }
                    arrays[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrays));
    }
}