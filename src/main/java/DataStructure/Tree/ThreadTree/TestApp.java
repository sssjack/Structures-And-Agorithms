package DataStructure.Tree.ThreadTree;

public class TestApp {

    public static void main(String[] args) {
        HeroNode node = new HeroNode(1, "����");
        HeroNode node2 = new HeroNode(3, "����");
        HeroNode node3 = new HeroNode(6, "�ܲ�");
        HeroNode node4 = new HeroNode(8, "����");
        HeroNode node5 = new HeroNode(10, "����");
        HeroNode node6 = new HeroNode(14, "�ŷ�");
        node.setLeft(node2);
        node.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        ClueBianryTree clueBianryTree = new ClueBianryTree();
        clueBianryTree.setRoot(node);

        /**
         * ����ͨ������ת��Ϊ����������
         */
        clueBianryTree.clueNode();

        //��ȡ10��ǰ���ͺ��
        HeroNode left = node5.getLeft();
        HeroNode right = node5.getRight();
        System.out.println("10�Žڵ�ǰ���ǣ�" + left.getNo() + ",����ǣ�" + right.getNo());

        //���������������������������ѯ
        clueBianryTree.clueList();

    }
}
