public class test1 {
    public static void main(String[] args) {
        String a = new String("ab"); // a Ϊһ������
        String b = new String("ab"); // b Ϊ��һ������,���������һ��
        String aa = "ab"; // ���ڳ�������
        String bb = "ab"; // �ӳ������в���
        if (aa == bb) // true
            System.out.println("aa==bb");
        if (a == b) // false����ͬһ����
            System.out.println("a==b");
        if (a.equals(b)) // true
            System.out.println("aEQb");
        if (42 == 42.0) { // true
            System.out.println("true");
        }
    }
}