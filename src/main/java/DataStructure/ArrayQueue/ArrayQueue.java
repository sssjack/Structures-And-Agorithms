package DataStructure.ArrayQueue;

/**
 * 数组实现队列插入
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
     * 判断当前的队列是否已满
     */
    public boolean isFull(){
        return rearPoint == maxSize -1;
    }
    /**
     * 判断是否是空队列
     */
    public boolean isEmpty(){
        return frontPoint == rearPoint;
    }

    /**
     * 添加元素进入队列
     */
    public void add(int n){
        if(isFull()){
            return;
        }
        rearPoint++;
        array[rearPoint] = n;
    }

    /**
     * 获取队列元素并且删除该元素，出队列
     */
    public int get(){
        if(isEmpty()){
            throw new RuntimeException("空队列");
        }
        frontPoint++;
        return array[frontPoint] ;
    }

    /**
     * 查看队列中的元素
     */
    public void findQueue(){
        if(isEmpty()){
            throw new RuntimeException("空队列");
        }
        for(int i =0;i<array.length;i++){
            System.out.printf("array[%d]=%d",i,array[i]);
            System.out.println();
        }
    }

    /**
     * 查看头部
     */
    public int frontQueue(){
        if(isEmpty()){
            throw new RuntimeException("空队列");
        }
        return array[frontPoint+1];
    }
}
