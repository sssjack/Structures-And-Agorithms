package DataStructure.Tree.HuffmanTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] array = {13,7,8,29,6,1};


    }

    /**
     * 把数列转赫夫曼树
     */
    public static Node createHuffmanTree(int[] array){
        /**
         * 1.遍历数组
         * 2.将每一个元素构成一个节点Node
         * 3.将Node放入到集合中，并且是排好的，从小到大
         */
        List<Node> nodes = new ArrayList<Node>();
        for(int i:array){
//            将元素转为Node对象
            nodes.add(new Node(i));
        }
        return null;
    }
}
