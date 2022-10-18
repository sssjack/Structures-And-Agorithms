package DataStructure.HashTable;

public class StudentLinkedList {

    private Student head;

    /**
     * 添加节点
     * 1.如果添加是第一个学生对象，则直接
     */
    public void add(Student newStudent){
        if(head == null){
            head = newStudent;
            return;
        }
        Student temp = head;
        while (true){
            if(temp.next == null){
                break;
            }
//            继续往后查找
            temp = temp.next;
        }
//        添加了新节点
        temp.next = newStudent;
    }

    /**
     * 查看节点
     * @param no
     */

    public void list(int no){
        if(head == null){
            System.out.println("第"+no+"链表是空");
            return;
        }
        Student temp = head;
        while (true){
            System.out.printf("id=%d  name=%s\t",temp.id,temp.name);
            if(temp.next == null){
                break;
            }
//            继续往后查找
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * 根据编号查询节点
     */
    public Student findById(int id){
        if(head == null){
            System.out.println("链表是空");
            return null;
        }
        Student temp = head;
        while (true){
            if(temp.id ==id){
                break;
            }
            if(temp.next ==null){
                temp = null;
                break;
            }
            temp = temp.next;

        }
        return temp;
    }

}
