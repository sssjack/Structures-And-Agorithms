package controller.sparseArray;

public class SparseArray {
    public static void main(String[] args) {
        /**
         * 1.ģ������������ݣ�ʹ�ö�ά����
         */
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][4] = 2;
        array[3][5] = 6;
        array[7][8] = 7;
        array[4][2] = 3;
        array[5][4] = 4;
        array[6][2] = 5;

        //��ӡ���̲鿴Ч��
        for (int[] row : array) {
            for (int val : row) {
                System.out.printf("%d\t", val);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        /**
         * �����ϵĶ�ά�����е���Ч����ѹ����ϡ��������ȥ
         */
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0) {
                    sum++;
                }
            }
        }
//        System.out.println("��Ч���ݵĸ���"+sum);
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11; //��
        sparseArray[0][1] = 11; //��
        sparseArray[0][2] = sum; //��Ч���ݵĸ���

//        ����Ч���ݴ洢��ϡ��������ȥ
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
//                �ж��Ƿ�����Ч����
                if (array[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                }
            }
        }
        /**
         * ��ӡϡ������
         */
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d%d%d\t", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        /**
         * ��ϡ������תΪԭʼ��ά����
         */
        int[][] oldArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i=1;i<=count;i++){
            oldArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }


        /**
         * �鿴ԭʼ��λ��������
         */
        for(int[]row:oldArray){
            for(int val:row){
                System.out.printf("%d\t",val);
            }
            System.out.println();
        }
        /**
         * ��ϡ������תΪ����
         */
        System.out.println("---------------------------------------------");

        SparseArrayDto head = new SparseArrayDto();
        SparseArrayDto linkedList = new SparseArrayDto();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0) {
                    linkedList.setRow(i);
                    linkedList.setColumn(j);
                    linkedList.setData(array[i][j]);

                    SparseArrayDto temp = head;
                    while (true){
                        if(temp.getNext() == null){
                            break;
                        }
                        //temp.next��Ϊ�գ��Ͱ�temp.next��ֵ����һ�����temp
                        temp = temp.getNext();
                    }
                    temp.setNext(linkedList);
                    linkedList = new SparseArrayDto();
                }
            }
        }
        System.out.println(head);
    }
}
