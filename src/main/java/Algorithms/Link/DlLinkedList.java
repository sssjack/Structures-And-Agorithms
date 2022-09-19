package Algorithms.Link;

public class DlLinkedList {
    private GoodsNode node = new GoodsNode(0, "", 0.0);

    /**
     * ����������ӽڵ�
     */
    public void add(GoodsNode goodsNode) {
        GoodsNode temp = node;
        //һֱѭ���ҵ��������һ���ڵ�
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //�����һ���ڵ��︳ֵ�ýڵ�
        temp.next = goodsNode;
    }

    /**
     * ������Ʒ���idֵ������ӣ���С������ӽ���
     */
    public void addOrder(GoodsNode goodsNode) {
        GoodsNode temp = node;
        boolean flg = false;
        while (true) {
//            �Ƿ������һ���ڵ�
            if (temp.next == null) {
                break;
            }
//            �Ƿ������ڵ��м�
            if (temp.next.id > goodsNode.id) {
                break;
//                �������ڵ�����нڵ�id��ͬ
            } else if (temp.next.id == goodsNode.id) {
                flg = true;
                break;
            }
            temp = temp.next;
        }
        if (flg) {
            System.out.println("�Ѿ����ڸ���Ʒ����������ظ�Ԫ��");
        } else {
//            ���в������
            goodsNode.next = temp.next;
            temp.next = goodsNode;
        }

    }

    /**
     * �����㰴��id��Ų���
     */
    public void addByOrder(GoodsNode goodsNode){
        GoodsNode temp = node;
        boolean flag = false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.id>goodsNode.id){
                break;
            }else if (temp.next.id==goodsNode.id){//˵���Ѿ�
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag){
            System.out.println("������Ӹ���Ʒ���Ѿ�������...");
        }else {
            goodsNode.next = temp.next;
            temp.next = goodsNode;
        }
    }

    /**
     * �޸Ľڵ�
     * 1.���ҵ������е�Ŀ��ڵ�
     * 2.�����µ����ݽ����޸�
     * 3.������Ʒ��Ž��в���
     */
    public void updateNode(GoodsNode goodsNode){
        if(node.next==null){
            System.out.println("����Ϊ�ա���");
            return;
        }
        GoodsNode temp = node.next;
//        ��ʶ����������ʶ�ҵ��˽ڵ�
        Boolean flg = false;
        while (true){
//            ���������һ��û�ҵ��������ѭ��
            if(temp==null){
                break;
            }
//            �ҵ��˽ڵ㣬�����ѭ��
            if(temp.id == goodsNode.id){
                flg=true;
                break;
            }
            temp = temp.next;
        }
        if(flg){
//            �������޸Ľڵ�
            temp.name = goodsNode.name;
            temp.price = goodsNode.price;
        }else {
            System.out.println("������������δ�ҵ�Ŀ��ڵ�");
        }
    }

    /**
     * �ڵ�ɾ������
     */
    public void delNode(int id){
        GoodsNode temp = node;
        boolean flg = false;
        while (true){
            if(temp.next==null){
                break;
            }
            if(temp.next.id == id){
                flg = true;
                break;
            }
            temp = temp.next;
        }
        if(flg){
            temp.next = temp.next.next;
        }else {
            System.out.println("δ�ҵ�ɾ���Ľ��");

        }
    }

    /**
     * ����鿴�б���ÿһ�����Ԫ��
     */
    public void list(){
        if(node.next==null){
            System.out.println("������");
            return;
        }

        GoodsNode temp = node.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    /**
     * �����⣺
     * ���㵥����Ľڵ����
     * ��ͳ��ͷ���
     */
    public int getLength(){
        if(node.next==null){
            System.out.println("������");
            return 0;
        }
        GoodsNode temp = node.next;
        int length = 0;
        while (temp!=null){
//            ����������
            length++;
            temp = temp.next;
        }
        return length;
    }
}
