package Algorithms.Link;


/**
 * 模拟一个链（双链表）
 *
 */
public class BookNode {
    public int id;
    public String name;
    public double price;

//    该节点下一个节点，直接后继
    public BookNode next;
//    该节点上一个节点，直接前继
    public BookNode pre;

    public BookNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodsNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
