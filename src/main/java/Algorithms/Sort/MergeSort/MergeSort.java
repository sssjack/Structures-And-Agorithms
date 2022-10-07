package Algorithms.Sort.MergeSort;

import java.util.Arrays;

/**
 * 归并排序算法排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 4, 7, 1, 2, 0, 8, 3, 5};
        //临时数组
        int[] temp = new int[array.length];

        sort(array, 0, array.length - 1, temp);

        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            /**
             * 求中间值
             */
            int mid = (left + right) / 2;
            /**
             * 向左分解
             */
            sort(array, left, mid, temp);
            /**
             * 向右边分解
             */
            sort(array, mid + 1, right, temp);
            /**
             * 合并元素
             */
            sum(array, left, right, mid, temp);


        }
    }

    /**
     * 合并元素
     *
     * @param array
     * @param left
     * @param right
     * @param mid
     * @param temp
     */
    public static void sum(int[] array, int left, int right, int mid, int[] temp) {

        int i = left;
        int j = mid + 1;

        /**
         * 指向临时数组的下标
         */
        int t = 0;

        /**
         * 开始循环比较左右两遍数组元素
         */
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t] = array[i];
                t++;
                i++;
            } else {
                temp[t] = array[j];
                t++;
                j++;
            }
        }

        /**
         * 把剩余的元素直接存放在临时数组中
         */
        while (i <= mid) {
            temp[t] = array[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = array[j];
            t++;
            j++;
        }

        /**
         * 临时数组中的元素拷贝到原数组中
         */
        int tempIndex = left;
        int k = 0;
        while (tempIndex <= right) {
            array[tempIndex] = temp[k];
            k++;
            tempIndex++;

        }
    }
}
