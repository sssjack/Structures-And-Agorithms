package Algorithms.InsertSort;

import java.util.Arrays;

/**
 * ��������
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 3, 4, 7, 1, 8};
        for (int i = 1; i < array.length; i++) {//������ȡÿһ��Ԫ��
            for (int j = i; j >= 1; j--) {//�ȽϵĴ���
                if(array[j]<array[j-1]){//�Ƿ�С��ǰ���Ԫ��
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else {
                    break;
                }

            }
        }
        System.out.println("�����Ľ����"+ Arrays.toString(array));
    }
}

