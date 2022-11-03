package DataStructure.Tree.ThreadTree;

public class HeroNode {
    private int no;
    private String name;

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

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public int getNoLeft() {
        return noLeft;
    }

    public void setNoLeft(int noLeft) {
        this.noLeft = noLeft;
    }

    public int getNoRight() {
        return noRight;
    }

    public void setNoRight(int noRight) {
        this.noRight = noRight;
    }

    private HeroNode left;
    private HeroNode right;
    /**
     * �����0����ʾָ�������������1��ʾָ��ǰ��
     */
    private int noLeft;
    /**
     * �����0����ʾָ�������������1��ʾָ��ǰ��
     */
    private int noRight;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ThreadTree{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * ɾ���ڵ�
     * <p>
     * ɾ���Ŀ����Ǹ�Ҷ�ӽڵ㣬Ҳ�����Ǹ���Ҷ�ӽڵ�
     */
    public void delNode(int no) {
        /**
         * 1.�����ǰ��ڵ㲻Ϊ�գ��������ӽڵ�������Ҫɾ���ģ�this.left=null;
         * 2.�����ǰ�ҽڵ㲻Ϊ�գ��������ӽڵ�������Ҫɾ���ģ�this.right=null;
         *
         * 3.1��2��û��ִ�У��������ݹ�
         * 4.���û�ҵ������ҵݹ�
         */
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }

        /**
         * �жϣ���ֹ�쳣
         */
        if (this.left != null) {
            this.left.delNode(no);
        }
        if (this.right != null) {
            this.right.delNode(no);
        }


    }

    /**
     * ǰ���������
     */
    public void preSelect() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preSelect();
        }
        if (this.right != null) {
            this.right.preSelect();
        }
    }

    /**
     * ���ݱ��ǰ�����
     */
    public HeroNode preSelect(int no) {
        if (this.no == no) {
            return this;
        }
        HeroNode temp = null;
        /**
         * ����ݹ�
         */
        if(this.left!=null){
            temp = this.left.preSelect(no);
        }
        if(temp!=null){
            return temp;
        }

        /**
         * ���ҵݹ�
         */
        if(this.right!=null){
            temp = this.right.preSelect(no);
        }
        return temp;


    }
}
