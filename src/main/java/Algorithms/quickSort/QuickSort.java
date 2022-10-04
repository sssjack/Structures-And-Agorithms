package Algorithms.quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{2,9,4,7,3,3,6,5};
        sort(arrays,0,arrays.length-1);
        System.out.println(Arrays.toString(arrays));

    }

    public static void sort( int[] arrays,int left,int right){
        int l = left;
        int r = right;
        int pivot = arrays[(left+right)/2];
        int temp = 0;
        while(l<r){
            //��߲��Ҵ����м�ֵ��
            while(arrays[l]<pivot){
                l++;
            }
            //��ѯ�ұ�С���м�ֵ
            while(arrays[r]>pivot){
                r--;
            }

            if(l>=r){
                break;
            }

            temp = arrays[l];
            arrays[l] = arrays[r];
            arrays[r] = temp;

            /**
             * ����������arrays[l] = pivot
             */
            if (arrays[l] == pivot){
                r--;
            }
            if (arrays[r] == pivot){
                l++;
            }
            if (r==l){
                l++;
                r--;
            }
            if (left<r){
                sort(arrays,left,r);
            }
            if(right>l){
                sort(arrays,l,right);
            }


        }

    }
}
