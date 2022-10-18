package DataStructure.Link;

public class DualLinkedList {
    private BookNode head = new BookNode(0, "", 0.0);

    /**
     * ��ӽ�β�µĽ��
     *
     * @param newNode
     */
    public void addLast(BookNode newNode) {
        BookNode temp = head;
        while (true) {
//            ��ʾ˫�������ǿ�����
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        /**
         * ��Ҫ���µĽڵ����һ���ڵ�
         * ��°���һ���ڵ�ָ����һ���ڵ�
         */
        temp.next = newNode;
        newNode.pre = temp;
    }

    /**
     * �޸Ľڵ�
     * ������˫��������ÿһ���ڵ��id���޸ĵ�id�Աȣ�����Աȳɹ������޸ĸýڵ�
     * ���û�гɹ�����˵��˫��������δ�ҵ��ýڵ�
     */
    public void updateNode(BookNode node) {
//        �Ƿ��ǿ�����
        if (head.next == null) {
            System.out.println("Ϊ������....");
            return;
        }
        BookNode temp = head.next;
        boolean flg = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.id == node.id) {
                flg = true;
                break;
            }
            temp = temp.next;

        }
        if (flg) {
            temp.name = node.name;
            temp.price = node.price;
        } else {
            System.out.println("δ�ҵ�Ҫ�޸ĵĽڵ㡣������");
        }
    }


    /**
     * ˫������ɾ��
     */
    public void delNode(int id) {
        if (head.next == null) {
            return;
        }
        BookNode temp = head.next;
        boolean flg = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.id == id) {
                flg = true;
                break;
            }

            temp = temp.next;
        }
        if (flg) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        }else {
            System.out.println("δ�ҵ��ý��...");
        }
    }



    /**
     * ����м�����Ұ�˳���µĽڵ�
     *
     * @param newNode
     */
    public void addOrder(BookNode newNode) {
        BookNode temp = head;
        boolean flag = false;
        while (true) {
//            ��ʾ˫�������ǿ�����
            if (temp.next == null) {
                break;
            }
            if(temp.next.id==newNode.id){
                flag = true;
                break;
            }else if(temp.next.id>newNode.id){
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("�����ظ�����");
        }else {
            if(temp.next!=null){
                temp.next.pre = newNode;
                newNode.next= temp.next;
            }
            temp.next = newNode;
            newNode.pre = temp;
        }
    }

    /**
     * �鿴��������
     */
    public void list(){
        if(head.next==null){
            System.out.println("������");
            return;
        }
        BookNode temp = head.next;
        while (true) {
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
