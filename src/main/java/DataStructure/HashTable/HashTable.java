package DataStructure.HashTable;

public class HashTable {
    private StudentLinkedList[] studentLinkedLists;
    private int size;
    public HashTable(int size){
        this.size = size;
        studentLinkedLists = new StudentLinkedList[size];
        /**
         * 数组中i添加链表对象
         */
        for(int i=0;i<size;i++){
            studentLinkedLists[i] = new StudentLinkedList();

        }
    }

    /**
     * 哈希函数
     * @param sid
     * @return
     */
    public int hashCodes(int sid){
        return sid%size;
    }

    /**
     * 添加学员
     */
    public void add(Student student){
//        决定了数组的下表
        int hashCodes = hashCodes(student.id);
        /**
         * 添加到指定链表中
         */
        studentLinkedLists[hashCodes].add(student);
    }

    /**
     * 查看哈希表中的元素
     */
    public void list(){
        for(int i=0;i<size;i++){
            studentLinkedLists[i].list(i);
        }
    }

    /**
     * 根据学生编号查询
     */
    public void findByStudentId(int sid){
        int hashVal = hashCodes(sid);
        Student students = studentLinkedLists[hashVal].findById(sid);
        if(students!=null){
            System.out.printf("在第%d条链表中找到了学员编号是：%d\n",(hashVal),sid);
        }else {
            System.out.println("整个hash表中未找到学员");
        }

    }


}
