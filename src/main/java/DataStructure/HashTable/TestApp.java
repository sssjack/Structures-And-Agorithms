package DataStructure.HashTable;

public class TestApp {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);


        /**
         * 添加学生节点
         */
        Student student1 = new Student(1, "张三");
        Student student2 = new Student(2, "李四");
        Student student3 = new Student(3, "王五");
        Student student4 = new Student(4, "周六");
        Student student5 = new Student(5, "小七");
        hashTable.add(student1);
        hashTable.add(student2);
        hashTable.add(student3);
        hashTable.add(student4);
        hashTable.add(student5);

        hashTable.list();

        hashTable.findByStudentId(4);


    }
}
