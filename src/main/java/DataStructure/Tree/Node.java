package DataStructure.Tree;

public class Node {
    private int no;
    private String name;
    private Node left;
    private Node right;

    /**
     *
     */
    public Node(int no,String name){
        this.no=no;
        this.name=name;
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
     * 定义前序遍历
     */
    public void preSelect(){
        //先输出父节点
        System.out.println(this);
        if(this.left !=null){
            this.left.preSelect();
        }
        if(this.right !=null){
            this.right.preSelect();
        }
    }


    /**
     * 中序遍历
     */
    public void infixSelect(){
        //左节点
        if(this.left!=null){
            this.left.infixSelect();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixSelect();
        }
    }


    /**
     * 后序遍历
     */
    public void postSelect(){
        if(this.left!=null){
            this.left.postSelect();
        }
        if(this.right!=null){
            this.right.postSelect();
        }
        System.out.println(this);

    }
}
