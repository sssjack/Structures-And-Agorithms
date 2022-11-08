package Algorithms.Sort.BasicSort;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * ��������
 */
public class BasicSort {
    public static void main(String[] args) {
        int [] arrays = new int[]{53,542,3,63,14,214,154,748,616};


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss:SS");
        System.out.println("��ʼǰ��"+simpleDateFormat.format(new Date()));

        sort(arrays);

        System.out.println("������"+simpleDateFormat.format(new Date()));

    }


    /**
     * 1.��ȡ�������Ϊ����
     * @param arrays
     */
    public static void sort(int[] arrays){

        /**
         * ��ȡ���λ
         */
        int max = 0;
        for(int i = 0;i<arrays.length;i++){
            if(arrays[i]>max){
                max = arrays[i];
            }
        }

        /**
         * ��ȡ�ַ������ȣ���int����תΪ�ַ�������
         */
        int maxlength = (max+"").length();


        /**
         * �����ά���飬��СΪ10����ʾ10��Ͱ��ÿ��Ͱ��һ������
         * []
         */
        int[][] bucket = new int[10][arrays.length];

        /**
         * ��������
         */
        int[] bucketElementCount = new int[10];

        /**
         * ѭ����ȡ��������
         */
        for(int j=0;j<arrays.length;j++){
            int locationElement = arrays[j]%10;
            /**
             * ����Ͱ��
             */
            bucket[locationElement][bucketElementCount[locationElement]] = arrays[j];
            bucketElementCount[locationElement]++;
        }

        /**
         * ����ÿһ��Ͱ����Ԫ�ش����ԭ������
         */
        int index=0;
        for(int k=0;k<bucketElementCount.length;k++){
            if(bucketElementCount[k]!=0){
                for(int l = 0;l<bucketElementCount[k];l++){
                    arrays[index++] = bucket[k][l];
                }
            }
            bucketElementCount[k] = 0;
        }
        System.out.println(Arrays.toString(arrays));

        /**
         * ��Ը�λ�����бȽ�
         */


        for (int j=0;j<arrays.length;j++){
            int locationElement = arrays[j]/1%10;
            bucket[locationElement][bucketElementCount[locationElement]] = arrays[j]; bucketElementCount[locationElement]++; }
        /**
         * ȡ����������Ͱ��˳�򣬷���ԭ������
         */
        int indx = 0;
        for(int k = 0;k<bucketElementCount.length;k++){
            if(bucketElementCount[k]!=0){
                for(int l = 0;l<bucketElementCount[k];l++){
                    arrays[indx++] = bucket[k][l];
                }
            }
            bucketElementCount[k] = 0;
        }

        /**
         * �ж�10λ��
         */
        for(int j = 0;j<arrays.length;j++){
            int locationElement = arrays[j]/10%10;
            bucket[locationElement][bucketElementCount[locationElement]] = arrays[j];
            bucketElementCount[locationElement]++;
        }

        /**
         * ȡ����������Ͱ��˳�򣬷���ԭ������
         */
        indx = 0;
        for(int k = 0;k<bucketElementCount.length;k++){
            if(bucketElementCount[k]!=0){
                for(int l = 0;l<bucketElementCount[k];l++){
                    arrays[indx++] = bucket[k][l];
                }
            }
            bucketElementCount[k] = 0;
        }

        /**
         * ȡ��ȡ��λ���Ƚ�
         */
        for(int j = 0;j<arrays.length;j++){
            int locationElement = arrays[j]/100%10;
            bucket[locationElement][bucketElementCount[locationElement]] = arrays[j];
            bucketElementCount[locationElement]++;
        }

        /**
         * ȡ����������Ͱ��˳�򣬷���ԭ������
         */
        indx = 0;
        for(int k = 0;k<bucketElementCount.length;k++){
            if(bucketElementCount[k]!=0){
                for(int l = 0;l<bucketElementCount[k];l++){
                    arrays[indx++] = bucket[k][l];
                }
            }
            bucketElementCount[k] = 0;
        }

        System.out.println("����������˳��"+Arrays.toString(arrays));







    }
}
