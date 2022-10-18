package DataStructure.Tree;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(1,"ÀÔ…–œ„");
        Node node2 = new Node(2,"œƒ∫Óê™");
        Node node3 = new Node(3,"ıı≤ı");
        Node node4 = new Node(4,"¬¿≤º");
        Node node5 = new Node(5,"”›ºß");
        Node node6 = new Node(6,"Õı’—æ˝");
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
