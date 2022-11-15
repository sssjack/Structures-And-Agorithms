package DataStructure.Tree.HuffmanTree;

import java.util.*;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] array = {13,7,8,29,6,1};

        Node root = createHuffmanTree(array);

        preSelect(root);



    }
    /**
     * 创建赫夫曼树方法
     * @return
     */
    public static Node createHuffmanTree(int[] array){
        /**
         * 1.遍历数组
         * 2.讲每一个元素构建成一个结点Node
         * 3.讲Node放入一个集合中
         */
        List<Node> nodes = new ArrayList<Node>();
        for (int i : array) {
            nodes.add(new Node(i));
        }

        /**
         * 循环处理结点
         */
        while (nodes.size()>1){
            //从小到大进行排序
            Collections.sort(nodes);

            System.out.println("集合中数据："+nodes);

            //取出来根结点权值最小的两课二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            //构建一课新的二叉树
            Node root = new Node(leftNode.value+rightNode.value);
            root.left = leftNode;
            root.right = rightNode;


            nodes.remove(leftNode);
            nodes.remove(rightNode);

            //将root加入到nodes集合中
            nodes.add(root);


        }
        return nodes.get(0);

    }

    /**
     * 前序设置
     */
    public static void preSelect(Node root){
        if (root !=null){
            root.preSelect();
        }else {
            System.out.println("当前是空树，无数据...");
        }
    }
}
