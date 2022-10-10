package Algorithms.Search;

/**
 * 查找算法--线性查找
 */
public class LinearSearch {
    public static void main(String[] args) {
        /**
         * 查询该数组下是否存在该
         */
        int[] array = {7,3,2,5,9,4,8,1,6};
        int show = show(array, 9);
        System.out.println(show);
    }

    public static int show(int[] array,int target){
        for(int i=0;i<array.length;i++){
            if(array[i] ==target){
                return i;
            }
        }
        return -1;
    }

}

