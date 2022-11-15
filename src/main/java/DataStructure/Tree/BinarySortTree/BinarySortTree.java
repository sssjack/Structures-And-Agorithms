package DataStructure.Tree.BinarySortTree;

public class BinarySortTree {

    private Node root;

    public Node getRoot() {
        return root;
    }


    /**
     * Ҫɾ���Ľڵ�
     */
    public Node search(int val){
        if (root == null){
            return null;
        }else {
            return root.search(val);
        }
    }

    /**
     * ��ѯ���ڵ�
     */
    public Node searchParent(int val){
        if (root == null){
            System.out.println("root is null");
            return null;
        }else {
            System.out.println("root not null");
            return root.searchParent(val);
        }
    }

    /**
     *
     */
    public int delRightTreeMinNode(Node node){
        Node target = node;

        //�ҳ���Сֵ
        while (target.left !=null){
            target = target.left;
        }

        //�ҵ���Сֵ�ڵ�
        delNode(target.value);
        return target.value;
    }

    /**
     * ɾ���ڵ�
     */
    public void delNode(int val){
        if (root == null){
            return;
        }else {
            //1.����������ȥ��Ҫɾ���Ľڵ�
            Node target = search(val);
            if (target == null){
                return;
            }

            //1.����������������ֻ����һ���ڵ�
            if (root.left == null && root.right == null){
                root = null;
                return;
            }

            //2.�ҵ�Ŀ��ڵ�ĸ����
            Node parentNode = searchParent(val);

            //3.���Ҫɾ���Ľڵ�ʱҶ�ӽڵ�
            if (target.left == null && target.right == null){
                //�ж�target�Ǹ��������ӽڵ㻹�Ǹ��������ӽڵ�
                if (parentNode.left !=null && parentNode.left.value == val){
                    //��ʾ�����ӽڵ�
                    parentNode.left = null;
                }else if (parentNode.right !=null && parentNode.right.value == val){
                    parentNode.right = null;
                }
            }else if (target.left !=null && target.right !=null){
                //ɾ�����Ǵ������������Ľڵ�
                int minValue = delRightTreeMinNode(target.right);
                target.value = minValue;

            }else {//ɾ����ֻ��һ�������ڵ�
                //�����������
                if (target.left !=null){
                    //���ڵ㲻��Ϊ��
                    if (parentNode !=null){
                        //���target��parentNode���ӽڵ�
                        if (parentNode.left.value == val){
                            //��Ŀ��ڵ����ӽڵ�����ڵ���ڵ�
                            parentNode.left = target.left;
                        }else {
                            //���target��parentNode���ӽڵ�
                            parentNode.right = target.left;
                        }

                    }else {

                        root = target.left;
                    }

                }else {//���ɾ���Ľڵ����ҽڵ�

                    if (parentNode !=null){
                        //���target��parentNode�����ӽڵ�
                        if (parentNode.left.value == val){
                            parentNode.left = target.right;
                        }else {
                            parentNode.right = target.right;
                        }
                    }else {
                        root = target.right;
                    }

                }

            }


        }
    }

    /**
     * ���
     */
    public  void add(Node node){
        if (root == null){
            root = node;
        }else {
            root.add(node);
        }
    }

    /**
     * �������
     */
    public void infixSelect(){
        if (root !=null){
            root.infixSelect();
        }else {
            System.out.println("����������Ϊ��...");
        }
    }


}