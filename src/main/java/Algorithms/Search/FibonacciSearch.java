package Algorithms.Search;

import java.util.Arrays;
/**
 * 쳲���������
 */
public class FibonacciSearch {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        System.out.println(select(array, 13));
    }

    /**
     * f[k] = (f[k-1])+(f[k-2])
     *
     * @return
     */
    public static int[] f() {
        int[] f = new int[20];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;


    }


    /**
     * mid = low+F(k-1)-1
     *
     * @param array
     * @param key
     * @return
     */
    public static int select(int[] array, int key) {
        int low = 0;
        int height = array.length - 1;
        int k = 0;
        int mid = 0;
        int[] f = f();
        /**
         * �ҷָ��
         */
        while (height > f[k] - 1) {
            k++;
        }
        /**
         * ��Ϊfib[k]ֵ���ܴ���arrays�ĳ��ȣ����������Ҫʹ��Arrays�๹��һ���µ�����temp������ָ������û��ֵ�ĵط�
         * ʹ��0���
         */
        int[] temp = Arrays.copyOf(array, f[k]);
        for (int i = height + 1; i < temp.length; i++) {
            temp[i] = array[height];
        }
        while (low <= height) {
            mid = low + f[k - 1] - 1;
            if (key < temp[mid]) {
                k--;
            } else if (key > temp[mid]) {
                low = mid + 1;
                k -= 2;
            } else {
                if (mid <= height) {
                    return mid;

                } else {
                    return height;
                }
            }
        }
        return -1;
    }
}
