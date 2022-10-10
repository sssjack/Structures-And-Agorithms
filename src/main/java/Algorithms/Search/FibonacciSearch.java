package Algorithms.Search;

import java.util.Arrays;
/**
 * 斐波那契查找
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
         * 找分割点
         */
        while (height > f[k] - 1) {
            k++;
        }
        /**
         * 因为fib[k]值可能大于arrays的长度，因此我们需要使用Arrays类构造一个新的数组temp，并且指向它。没有值的地方
         * 使用0填充
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
