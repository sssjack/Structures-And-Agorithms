package controller.sparseArray;

public class SparseArray {
    public static void main(String[] args) {
        /**
         * 1.模拟出来棋盘数据，使用二维数组
         */
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][4] = 2;
        array[3][5] = 6;
        array[7][8] = 7;
        array[4][2] = 3;
        array[5][4] = 4;
        array[6][2] = 5;

        //打印棋盘查看效果
        for (int[] row : array) {
            for (int val : row) {
                System.out.printf("%d\t", val);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        /**
         * 把如上的二维数组中的有效数据压缩至稀疏数组中去
         */
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0) {
                    sum++;
                }
            }
        }
//        System.out.println("有效数据的个数"+sum);
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11; //行
        sparseArray[0][1] = 11; //列
        sparseArray[0][2] = sum; //有效数据的个数

//        把有效数据存储到稀疏数组中去
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
//                判断是否是有效数据
                if (array[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                }
            }
        }
        /**
         * 打印稀疏数组
         */
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d%d%d\t", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        /**
         * 把稀疏数组转为原始二维数组
         */
        int[][] oldArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i=1;i<=count;i++){
            oldArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }


        /**
         * 查看原始二位数据棋盘
         */
        for(int[]row:oldArray){
            for(int val:row){
                System.out.printf("%d\t",val);
            }
            System.out.println();
        }
        /**
         * 把稀疏数组转为链表
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
                        //temp.next不为空，就把temp.next赋值给下一个结点temp
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
