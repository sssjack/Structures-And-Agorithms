package DataStructure.Tree;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(1,"������");
        Node node2 = new Node(2,"�ĺ");
        Node node3 = new Node(3,"����");
        Node node4 = new Node(4,"����");
        Node node5 = new Node(5,"�ݼ�");
        Node node6 = new Node(6,"���Ѿ�");
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node3.setLeft(node5);
        node3.setRight(node6);

        binaryTree.setRoot(root);


        binaryTree.preSelect();
        System.out.println("-----------------------------------------");
        binaryTree.infixSelect();
        System.out.println("-----------------------------------------");
        binaryTree.postSelect();

    }
}
