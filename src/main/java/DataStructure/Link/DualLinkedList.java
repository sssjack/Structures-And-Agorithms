package DataStructure.Link;

public class DualLinkedList {
    private BookNode head = new BookNode(0, "", 0.0);

    /**
     * 添加结尾新的结点
     *
     * @param newNode
     */
    public void addLast(BookNode newNode) {
        BookNode temp = head;
        while (true) {
//            表示双向链表是空数据
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        /**
         * 需要把新的节点给上一个节点
         * 徐奥吧上一个节点指向下一个节点
         */
        temp.next = newNode;
        newNode.pre = temp;
    }

    /**
     * 修改节点
     * 条件：双向链表中每一个节点的id和修改的id对比，如果对比成功，则修改该节点
     * 如果没有成功，则说明双向链表中未找到该节点
     */
    public void updateNode(BookNode node) {
//        是否是空链表
        if (head.next == null) {
            System.out.println("为空链表....");
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
            System.out.println("未找到要修改的节点。。。。");
        }
    }


    /**
     * 双向链表删除
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
            System.out.println("未找到该结点...");
        }
    }



    /**
     * 添加中间插入且按顺序新的节点
     *
     * @param newNode
     */
    public void addOrder(BookNode newNode) {
        BookNode temp = head;
        boolean flag = false;
        while (true) {
//            表示双向链表是空数据
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
            System.out.println("不能重复插入");
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
     * 查看整个链表
     */
    public void list(){
        if(head.next==null){
            System.out.println("空链表");
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
