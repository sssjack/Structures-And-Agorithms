package DataStructure.Tree.HuffmanTree;

import java.util.*;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] array = {13,7,8,29,6,1};

        Node root = createHuffmanTree(array);

        preSelect(root);



    }
    /**
     * �����շ���������
     * @return
     */
    public static Node createHuffmanTree(int[] array){
        /**
         * 1.��������
         * 2.��ÿһ��Ԫ�ع�����һ�����Node
         * 3.��Node����һ��������
         */
        List<Node> nodes = new ArrayList<Node>();
        for (int i : array) {
            nodes.add(new Node(i));
        }

        /**
         * ѭ��������
         */
        while (nodes.size()>1){
            //��С�����������
            Collections.sort(nodes);

            System.out.println("���������ݣ�"+nodes);

            //ȡ���������Ȩֵ��С�����ζ�����
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            //����һ���µĶ�����
            Node root = new Node(leftNode.value+rightNode.value);
            root.left = leftNode;
            root.right = rightNode;


            nodes.remove(leftNode);
            nodes.remove(rightNode);

            //��root���뵽nodes������
            nodes.add(root);


        }
        return nodes.get(0);

    }

    /**
     * ǰ������
     */
    public static void preSelect(Node root){
        if (root !=null){
            root.preSelect();
        }else {
            System.out.println("��ǰ�ǿ�����������...");
        }
    }
}
