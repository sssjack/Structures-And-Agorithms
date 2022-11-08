package DataStructure.Tree.HuffmanTree;

/**
 * 关于赫夫曼树
 */
public class Node implements Comparable<Node>{
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Node node) {

        return this.value-node.value;
    }

    /**
     * 前序遍历
     */
    public void preSelect(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preSelect();
        }
        if(this.right!=null){
            this.right.preSelect();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
