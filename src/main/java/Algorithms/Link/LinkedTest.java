package Algorithms.Link;

public class LinkedTest {
    public static void main(String[] args) {

//        DualLinkedList dualLinkedList = new DualLinkedList();
//
//        BookNode bookNode1 = new BookNode(1,"��¥��",66.00);
//        BookNode bookNode2 = new BookNode(2,"���μ�",56.00);
//        BookNode bookNode3 = new BookNode(3,"ˮ䰴�",55.00);
//        BookNode bookNode4 = new BookNode(4,"��������",75.00);
//
////        dualLinkedList.addLast(bookNode1);
////        dualLinkedList.addLast(bookNode2);
////        dualLinkedList.addLast(bookNode3);
////        dualLinkedList.addLast(bookNode4);
//        dualLinkedList.addOrder(bookNode3);
//        dualLinkedList.addOrder(bookNode2);
//        dualLinkedList.addOrder(bookNode4);
//        dualLinkedList.addOrder(bookNode1);
//ϡ������
//        dualLinkedList.list();
//
////        dualLinkedList.delNode(1);
////        dualLinkedList.updateNode(new BookNode(3,"�����",69.00));
//
//        System.out.println("");

        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.showBoy();
        circleSingleLinkedList.countBoy(1,2,5);


    }
}
