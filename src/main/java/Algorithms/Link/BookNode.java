package Algorithms.Link;


/**
 * ģ��һ������˫����
 *
 */
public class BookNode {
    public int id;
    public String name;
    public double price;

//    �ýڵ���һ���ڵ㣬ֱ�Ӻ��
    public BookNode next;
//    �ýڵ���һ���ڵ㣬ֱ��ǰ��
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
