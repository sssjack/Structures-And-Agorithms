package DataStructure.Tree;

public class BinaryTree {

    private Node root;

    public void setRoot(Node node){
        this.root = node;

    }

    public void preSelect(){
        if(this.root!=null){
            this.root.preSelect();
        }else {
            System.out.println("空二叉树，无法遍历");
        }
    }

    public void infixSelect(){
        if(this.root!=null){
            this.root.infixSelect();
        }else {
            System.out.println("空二叉树，无法遍历");
        }
    }
    public void postSelect(){
        if(this.root!=null){
            this.root.postSelect();
        }else {
            System.out.println("空二叉树，无法遍历");
        }
    }
}
