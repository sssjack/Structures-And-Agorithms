package DataStructure.Tree.ArrayBinaryTree;

/**
 * ˳��洢������
 */
public class ArrayBinaryTree {
    private int[] arrays;

    public ArrayBinaryTree(int[] arrays) {
        this.arrays = arrays;
    }


    public void preSelect(int index){
        if(this.arrays==null||arrays.length==0){
            System.out.println("�洢����Ϊ��");
        }
        /**
         * ����ݹ�
         */
        if((index*2+1)<arrays.length){
            preSelect(index*2+1);
        }
        /**
         * ���ҵݹ�
         */
        if((index*2+2)<arrays.length){
            preSelect(index*2+2);
        }
    }
}


