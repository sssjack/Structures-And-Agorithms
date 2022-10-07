package Algorithms.LookUp;

/**
 * ���ֲ��ҷ�
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{10,11,12,13,14,15,16,17};
        int target = 18;
        int search = search(array, target);
        System.out.println(search);

    }

    public static int search(int[] array,int target){
        int min = 0;
        int max = array.length -1;
        while(min<=max){
            //���ƽ������λ��
            int mid = (min+max)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid]<target){
                min = mid+1;
            }
            if(array[mid]>target){
                max = mid-1;
            }
        }
        return -1;
    }
}

