package Algorithms.Link;

public class DlLinkedList {
    private GoodsNode node = new GoodsNode(0, "", 0.0);

    /**
     * 往链表中添加节点
     */
    public void add(GoodsNode goodsNode) {
        GoodsNode temp = node;
        //一直循环找到链的最后一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //在最后一个节点里赋值该节点
        temp.next = goodsNode;
    }

    /**
     * 按照商品编号id值进行添加，从小到大添加进来
     */
    public void addOrder(GoodsNode goodsNode) {
        GoodsNode temp = node;
        boolean flg = false;
        while (true) {
//            是否是最后一个节点
            if (temp.next == null) {
                break;
            }
//            是否到两个节点中间
            if (temp.next.id > goodsNode.id) {
                break;
//                如果插入节点和已有节点id相同
            } else if (temp.next.id == goodsNode.id) {
                flg = true;
                break;
            }
            temp = temp.next;
        }
        if (flg) {
            System.out.println("已经存在该商品，不能添加重复元素");
        } else {
//            进行插入操作
            goodsNode.next = temp.next;
            temp.next = goodsNode;
        }

    }

    /**
     * 插入结点按照id编号插入
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
            }else if (temp.next.id==goodsNode.id){//说明已经
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag){
            System.out.println("不能添加该商品，已经存在了...");
        }else {
            goodsNode.next = temp.next;
            temp.next = goodsNode;
        }
    }

    /**
     * 修改节点
     * 1.先找到链表中的目标节点
     * 2.根据新的数据进行修改
     * 3.根据商品编号进行查找
     */
    public void updateNode(GoodsNode goodsNode){
        if(node.next==null){
            System.out.println("链表为空。。");
            return;
        }
        GoodsNode temp = node.next;
//        标识符，用来标识找到了节点
        Boolean flg = false;
        while (true){
//            链表中最后一个没找到，则结束循环
            if(temp==null){
                break;
            }
//            找到了节点，则结束循环
            if(temp.id == goodsNode.id){
                flg=true;
                break;
            }
            temp = temp.next;
        }
        if(flg){
//            真正的修改节点
            temp.name = goodsNode.name;
            temp.price = goodsNode.price;
        }else {
            System.out.println("在整个链表中未找到目标节点");
        }
    }

    /**
     * 节点删除功能
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
            System.out.println("未找到删除的结点");

        }
    }

    /**
     * 定义查看列表中每一个结点元素
     */
    public void list(){
        if(node.next==null){
            System.out.println("空链表");
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
     * 面试题：
     * 计算单链表的节点个数
     * 不统计头结点
     */
    public int getLength(){
        if(node.next==null){
            System.out.println("空链表");
            return 0;
        }
        GoodsNode temp = node.next;
        int length = 0;
        while (temp!=null){
//            结点个数递增
            length++;
            temp = temp.next;
        }
        return length;
    }
}
