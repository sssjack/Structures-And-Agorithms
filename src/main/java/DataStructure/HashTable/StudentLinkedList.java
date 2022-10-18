package DataStructure.HashTable;

public class StudentLinkedList {

    private Student head;

    /**
     * ��ӽڵ�
     * 1.�������ǵ�һ��ѧ��������ֱ��
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
//            �����������
            temp = temp.next;
        }
//        ������½ڵ�
        temp.next = newStudent;
    }

    /**
     * �鿴�ڵ�
     * @param no
     */

    public void list(int no){
        if(head == null){
            System.out.println("��"+no+"�����ǿ�");
            return;
        }
        Student temp = head;
        while (true){
            System.out.printf("id=%d  name=%s\t",temp.id,temp.name);
            if(temp.next == null){
                break;
            }
//            �����������
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * ���ݱ�Ų�ѯ�ڵ�
     */
    public Student findById(int id){
        if(head == null){
            System.out.println("�����ǿ�");
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
