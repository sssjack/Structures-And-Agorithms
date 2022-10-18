package DataStructure.HashTable;

public class HashTable {
    private StudentLinkedList[] studentLinkedLists;
    private int size;
    public HashTable(int size){
        this.size = size;
        studentLinkedLists = new StudentLinkedList[size];
        /**
         * ������i����������
         */
        for(int i=0;i<size;i++){
            studentLinkedLists[i] = new StudentLinkedList();

        }
    }

    /**
     * ��ϣ����
     * @param sid
     * @return
     */
    public int hashCodes(int sid){
        return sid%size;
    }

    /**
     * ���ѧԱ
     */
    public void add(Student student){
//        ������������±�
        int hashCodes = hashCodes(student.id);
        /**
         * ��ӵ�ָ��������
         */
        studentLinkedLists[hashCodes].add(student);
    }

    /**
     * �鿴��ϣ���е�Ԫ��
     */
    public void list(){
        for(int i=0;i<size;i++){
            studentLinkedLists[i].list(i);
        }
    }

    /**
     * ����ѧ����Ų�ѯ
     */
    public void findByStudentId(int sid){
        int hashVal = hashCodes(sid);
        Student students = studentLinkedLists[hashVal].findById(sid);
        if(students!=null){
            System.out.printf("�ڵ�%d���������ҵ���ѧԱ����ǣ�%d\n",(hashVal),sid);
        }else {
            System.out.println("����hash����δ�ҵ�ѧԱ");
        }

    }


}
