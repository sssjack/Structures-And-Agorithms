package DataStructure.ArrayQueue;

/**
 * ����ʵ�ֶ��в���
 */
public class ArrayQueue {

    private int[] array;
    private int maxSize;
    private int frontPoint;
    private int rearPoint;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        frontPoint = -1;
        rearPoint = -1;
    }
    /**
     * �жϵ�ǰ�Ķ����Ƿ�����
     */
    public boolean isFull(){
        return rearPoint == maxSize -1;
    }
    /**
     * �ж��Ƿ��ǿն���
     */
    public boolean isEmpty(){
        return frontPoint == rearPoint;
    }

    /**
     * ���Ԫ�ؽ������
     */
    public void add(int n){
        if(isFull()){
            return;
        }
        rearPoint++;
        array[rearPoint] = n;
    }

    /**
     * ��ȡ����Ԫ�ز���ɾ����Ԫ�أ�������
     */
    public int get(){
        if(isEmpty()){
            throw new RuntimeException("�ն���");
        }
        frontPoint++;
        return array[frontPoint] ;
    }

    /**
     * �鿴�����е�Ԫ��
     */
    public void findQueue(){
        if(isEmpty()){
            throw new RuntimeException("�ն���");
        }
        for(int i =0;i<array.length;i++){
            System.out.printf("array[%d]=%d",i,array[i]);
            System.out.println();
        }
    }

    /**
     * �鿴ͷ��
     */
    public int frontQueue(){
        if(isEmpty()){
            throw new RuntimeException("�ն���");
        }
        return array[frontPoint+1];
    }
}
