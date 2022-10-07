package Algorithms.Sort.MergeSort;

import java.util.Arrays;

/**
 * �鲢�����㷨����
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 4, 7, 1, 2, 0, 8, 3, 5};
        //��ʱ����
        int[] temp = new int[array.length];

        sort(array, 0, array.length - 1, temp);

        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            /**
             * ���м�ֵ
             */
            int mid = (left + right) / 2;
            /**
             * ����ֽ�
             */
            sort(array, left, mid, temp);
            /**
             * ���ұ߷ֽ�
             */
            sort(array, mid + 1, right, temp);
            /**
             * �ϲ�Ԫ��
             */
            sum(array, left, right, mid, temp);


        }
    }

    /**
     * �ϲ�Ԫ��
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
         * ָ����ʱ������±�
         */
        int t = 0;

        /**
         * ��ʼѭ���Ƚ�������������Ԫ��
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
         * ��ʣ���Ԫ��ֱ�Ӵ������ʱ������
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
         * ��ʱ�����е�Ԫ�ؿ�����ԭ������
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
