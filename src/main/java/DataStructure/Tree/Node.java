package DataStructure.Tree;

public class Node {
    private int no;
    private String name;
    private Node left;
    private Node right;

    /**
     *
     */
    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    /**
     * ����ǰ�����
     */
    public void preSelect() {
        //��������ڵ�
        System.out.println(this);
        if (this.left != null) {
            this.left.preSelect();
        }
        if (this.right != null) {
            this.right.preSelect();
        }
    }


    /**
     * �������
     */
    public void infixSelect() {
        //��ڵ�
        if (this.left != null) {
            this.left.infixSelect();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.infixSelect();
        }
    }


    /**
     * �������
     */
    public void postSelect() {
        if (this.left != null) {
            this.left.postSelect();
        }
        if (this.right != null) {
            this.right.postSelect();
        }
        System.out.println(this);

    }

    /**
     * ǰ���������
     */
    public Node preSearch(int no) {
        //�����Ƿ��ǵ�ǰ�ڵ�
        if (this.no == no) {
            return this;
        }
        //��ѯ���ӽڵ�
        Node lNode = null;
        if (this.left != null) {
            lNode = this.left.preSearch(no);
        }
        if (lNode != null) {
            return lNode;
        }

        //��ѯ��ǰ�ڵ�����ӽڵ㣬�����Ϊ�գ�������ݹ�ǰ�����
        if (this.right != null) {
            lNode = this.right.preSearch(no);
        }
        return lNode;

    }

    /**
     * �����������
     */
    public Node infixSearch(int no) {
        Node node = null;
        if (this.left != null) {
            node = this.left.infixSearch(no);
        }
        if (node != null) {
            return node;
        }

        //�Աȵ�ǰ�ڵ�
        if (this.no == no) {
            return this;
        }
        //�������ӽڵ�
        if (this.right != null) {
            node = this.right.infixSearch(no);
        }
        return node;


    }

    /**
     * �����������
     */
    public Node postSearch(int no){
        Node node = null;
        if (this.left != null) {
            node = this.left.postSearch(no);
        }

        if (node != null) {
            return node;
        }

        if (this.right != null) {
            node = this.right.postSearch(no);
        }
        if(node!=null){
            return node;
        }
        //�Աȵ�ǰ�ڵ�
        if (this.no == no) {
            return this;
        }

        return node;
    }

    /**
     * ɾ���ڵ��������
     * 1.ɾ���Ľڵ���Ҷ�ӽڵ�
     * 2.ɾ��������������Ҷ�ӽڵ�
     */
    public void delNode(int no){
        /**
         * 1.�����ǰ�ڵ���ڵ㲻Ϊ�գ�����ڵ����Ҫɾ���Ľڵ㣬this��left=null
         * 2.�����ǰ�ڵ��ҽڵ㲻Ϊ�գ����ҽڵ����Ҫɾ���Ľڵ㣬this��right=right
         * 3.�����һ���͵ڶ���û��ִ�У���ô��Ҫ�����������еݹ�ɾ��
         * 4.���������û��ִ�У��������������еݹ�ɾ����
         */
        if(this.left!=null&&this.left.no ==no){
            this.left = null;
            return;
        }
        if(this.right!=null&&this.right.no ==no){
            this.right = null;
            return;
        }

        /**
         * �����������еݹ�ɾ��
         */
        if(this.left!=null){
            this.left.delNode(no);
        }


        /**
         * �����������еݹ�ɾ��
         */
        if(this.right!=null){
            this.right.delNode(no);
        }


    }
}
