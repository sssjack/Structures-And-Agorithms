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
     * ��ѯҪɾ���Ľ��
     */
    public Node search(int value){
        if (value == this.value){
            return this;
        }else if (value<this.value){//���С�ڵ�ǰ��㣬�����������ݹ��ѯ

            //������������Ϊ��
            if (this.left == null){
                return null;
            }
            return this.left.search(value);
        }else {//������ڵ�ǰ��㣬�����������ݹ��ѯ
            if (this.right == null){
                return null;
            }
            return this.right.search(value);
        }

    }

    /**
     * ��ѯҪɾ�����ĸ����
     */
    public Node searchParent(int val){
        if ((this.left != null && this.left.value == val) || (this.right !=null && this.right.value == val)){
            return this;
        }else {
            //�����ѯ��ֵС�ڵ�ǰ���ֵ�����ҵ�ǰ������ӽ�㲻Ϊ��
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
     * ��ӽڵ�
     */
    public void add(Node node){
        if (node == null){
            return;
        }

        //�жϴ���Ľڵ�ֵ�뵱ǰ�ڵ�ֵ��ϵ
        if (node.value<this.value){
            if (this.left == null){
                this.left = node;
            }else {
                //��ǰ�ڵ��������ݹ�
                this.left.add(node);
            }

        }else {//��ӵĽ��ֵ���ڵ�ǰ���ֵ
            if (this.right == null){
                this.right = node;
            }else {
                this.right.add(node);
            }

        }
    }

    /**
     * �������
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