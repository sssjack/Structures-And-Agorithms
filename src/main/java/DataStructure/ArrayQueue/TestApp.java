package DataStructure.ArrayQueue;

public class TestApp {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.add(5);


        int i = arrayQueue.get();
        int j = arrayQueue.get();
        System.out.println(i);
        System.out.println(j);

        arrayQueue.findQueue();
    }
}
