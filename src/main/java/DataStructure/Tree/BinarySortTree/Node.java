package DataStructure.Tree.BinarySortTree;

public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    /**
     * 查询要删除的结点
     */
    public Node search(int value){
        if (value == this.value){
            return this;
        }else if (value<this.value){//如果小于当前结点，则向左子树递归查询

            //如果左子树结点为空
            if (this.left == null){
                return null;
            }
            return this.left.search(value);
        }else {//如果大于当前结点，则向左子树递归查询
            if (this.right == null){
                return null;
            }
            return this.right.search(value);
        }

    }

    /**
     * 查询要删除结点的父结点
     */
    public Node searchParent(int val){
        if ((this.left != null && this.left.value == val) || (this.right !=null && this.right.value == val)){
            return this;
        }else {
            //如果查询的值小于当前结点值，并且当前结点左子结点不为空
            if (val<this.value && this.left !=null){
                return this.left.searchParent(val);
            }else if (val>=this.value && this.right !=null){
                return this.right.searchParent(val);
            }else {
                return null;
            }
        }
    }

    /**
     * 添加节点
     */
    public void add(Node node){
        if (node == null){
            return;
        }

        //判断传入的节点值与当前节点值关系
        if (node.value<this.value){
            if (this.left == null){
                this.left = node;
            }else {
                //向当前节点左子树递归
                this.left.add(node);
            }

        }else {//添加的结点值大于当前结点值
            if (this.right == null){
                this.right = node;
            }else {
                this.right.add(node);
            }

        }
    }

    /**
     * 中序遍历
     */
    public void infixSelect(){
        if (this.left !=null){
            this.left.infixSelect();
        }
        System.out.println(this);
        if (this.right !=null){
            this.right.infixSelect();
        }
    }
}