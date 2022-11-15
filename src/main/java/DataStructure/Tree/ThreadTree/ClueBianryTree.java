package DataStructure.Tree.ThreadTree;

public class ClueBianryTree {
    private HeroNode root;
    //当前节点的前驱节点指针
    public HeroNode pre = null;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    /**
     * 调用这个方法等于把非线索化二叉树转为线索化二叉树
     */
    public void clueNode() {
        this.clueNode(root);
    }

    /**
     * 普通二叉树转线索二叉树
     */
    public void clueNode(HeroNode node) {
        //判断是否可以线索化当前节点
        if (node == null) {
            return;
        }
        //先线索化左子树
        clueNode(node.getLeft());
        //处理当前节点前驱
        if (node.getLeft() == null) {
            node.setLeft(pre);
            node.setNoLeft(1);
        }

        //处理当前节点的后继
        if (pre != null && pre.getRight() == null) {
            pre.setRight(node);
            pre.setNoRight(1);
        }
        //保证处理完一个节点后，就需要让当前节点成为下一个节点的前驱
        pre = node;

        clueNode(node.getRight());
    }

    /**
     * 遍历线索化的二叉树
     */
    public void clueList() {
        //定义临时遍历，临时存储当前结点，从root开始
        HeroNode node = root;

        while (node !=null){

            while (node.getNoLeft() == 0){
                node = node.getLeft();
            }

            //打印当前节点
            System.out.println(node);
            //当前结点右指针指向的是后继结点
            while (node.getNoRight() == 1){
                //获取当前节点后继节点
                node = node.getRight();
                System.out.println(node);
            }

            node = node.getRight();
        }
    }
}
