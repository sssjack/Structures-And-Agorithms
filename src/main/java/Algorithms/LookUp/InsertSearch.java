package Algorithms.LookUp;

/**
 * ��ֵ����
 */
public class InsertSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int l = 0;
        int r = array.length-1;

        int searchVal = 8;

        System.out.println(select(array,l,r,searchVal));

    }
    public static int select(int[] array,int left,int right,int searchVal){
        /**
         * ��ֹ����Խ��
         */
        if(left>right||searchVal<array[0]||searchVal>array[array.length-1]){
            return -1;
        }

        int mid = left+(right-left)*(searchVal-array[left])/(array[right]-array[left]);
        int midValue = array[mid];
        if(searchVal>midValue){
            return select(array,mid+1,right,searchVal);
        }else if(searchVal<midValue){
            return select(array,left,mid-1,searchVal);
        }else {
            return mid;
        }
    }
}
