package DataStructure.Tree.HuffmanTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] array = {13,7,8,29,6,1};


    }

    /**
     * ������ת�շ�����
     */
    public static Node createHuffmanTree(int[] array){
        /**
         * 1.��������
         * 2.��ÿһ��Ԫ�ع���һ���ڵ�Node
         * 3.��Node���뵽�����У��������źõģ���С����
         */
        List<Node> nodes = new ArrayList<Node>();
        for(int i:array){
//            ��Ԫ��תΪNode����
            nodes.add(new Node(i));
        }
        return null;
    }
}
