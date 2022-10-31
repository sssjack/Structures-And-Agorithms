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
            System.out.println("�ն��������޷�����");
        }
    }

    public void infixSelect(){
        if(this.root!=null){
            this.root.infixSelect();
        }else {
            System.out.println("�ն��������޷�����");
        }
    }
    public void postSelect(){
        if(this.root!=null){
            this.root.postSelect();
        }else {
            System.out.println("�ն��������޷�����");
        }
    }
    /**
     * ���ݽڵ��ŵ�ǰ���ѯ
     */

    public Node preNode(int no){
        if(root!=null){
            return root.preSearch(no);
        }else {
            System.out.println("�ն��������޷�����");
            return null;
        }
    }

    /**
     * ���ݽڵ��ŵ������ѯ
     */
    public Node infixNode(int no){
        if(root!=null){
            return root.infixSearch(no);
        }else {
            System.out.println("�ն��������޷�����");
            return null;
        }
    }

    /**
     * ���ݽڵ��ŵĺ����ѯ
     */
    public Node postNode(int no){
        if(root!=null){
            return root.postSearch(no);
        }else {
            System.out.println("�ն��������޷�����");
            return null;
        }
    }

    /**
     * ɾ���ڵ�
     */
    public void delNode(int no){
        if(root!=null){
            if(root.getNo()==no){
                root = null;
            }else {
                root.delNode(no);
            }
        }else {
            System.out.println("�ն��������޷�ɾ��");
        }
    }
}
