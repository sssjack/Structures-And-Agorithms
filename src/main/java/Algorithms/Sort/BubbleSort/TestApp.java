package Algorithms.Sort.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ð������
 */
public class TestApp {
    public static void main(String[] args) {
        int[] arrays = new int[]{4,5,6,3,2,1};
        /**
         * forѭ����������
         */
        for(int i =0;i<arrays.length-1;i++){
            /**
             * ���ƱȽϴ���
             */
            for(int j =0;j<arrays.length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int temp = 0;//���ƿ�Ͱ
                    temp = arrays[j];//��ɫ��ˮ�����Ͱ
                    arrays[j] = arrays[j+1];//��ɫ��ˮ������ɫ��Ͱ
                    arrays[j+1] = temp;//��ˮ������ɫ��Ͱ��
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
