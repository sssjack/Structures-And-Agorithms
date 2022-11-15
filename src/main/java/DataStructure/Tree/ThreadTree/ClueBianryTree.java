package DataStructure.Tree.ThreadTree;

public class ClueBianryTree {
    private HeroNode root;
    //��ǰ�ڵ��ǰ���ڵ�ָ��
    public HeroNode pre = null;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    /**
     * ��������������ڰѷ�������������תΪ������������
     */
    public void clueNode() {
        this.clueNode(root);
    }

    /**
     * ��ͨ������ת����������
     */
    public void clueNode(HeroNode node) {
        //�ж��Ƿ������������ǰ�ڵ�
        if (node == null) {
            return;
        }
        //��������������
        clueNode(node.getLeft());
        //����ǰ�ڵ�ǰ��
        if (node.getLeft() == null) {
            node.setLeft(pre);
            node.setNoLeft(1);
        }

        //����ǰ�ڵ�ĺ��
        if (pre != null && pre.getRight() == null) {
            pre.setRight(node);
            pre.setNoRight(1);
        }
        //��֤������һ���ڵ�󣬾���Ҫ�õ�ǰ�ڵ��Ϊ��һ���ڵ��ǰ��
        pre = node;

        clueNode(node.getRight());
    }

    /**
     * �����������Ķ�����
     */
    public void clueList() {
        //������ʱ��������ʱ�洢��ǰ��㣬��root��ʼ
        HeroNode node = root;

        while (node !=null){

            while (node.getNoLeft() == 0){
                node = node.getLeft();
            }

            //��ӡ��ǰ�ڵ�
            System.out.println(node);
            //��ǰ�����ָ��ָ����Ǻ�̽��
            while (node.getNoRight() == 1){
                //��ȡ��ǰ�ڵ��̽ڵ�
                node = node.getRight();
                System.out.println(node);
            }

            node = node.getRight();
        }
    }
}
