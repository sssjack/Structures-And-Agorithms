package DataStructure.Tree.ArrayBinaryTree;

/**
 * Ë³Ðò´æ´¢¶þ²æÊ÷
 */
public class ArrayBinaryTree {
    private int[] arrays;

    public ArrayBinaryTree(int[] arrays) {
        this.arrays = arrays;
    }


    public void preSelect(int index){
        if(this.arrays==null||arrays.length==0){
            System.out.println("´æ´¢Êý×éÎª¿Õ");
        }
        /**
         * Ïò×óµÝ¹é
         */
        if((index*2+1)<arrays.length){
            preSelect(index*2+1);
        }
        /**
         * ÏòÓÒµÝ¹é
         */
        if((index*2+2)<arrays.length){
            preSelect(index*2+2);
        }
    }
}


