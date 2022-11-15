package DataStructure.Tree.BinarySortTree;

public class BinarySortTree {

    private Node root;

    public Node getRoot() {
        return root;
    }


    /**
     * 要删除的节点
     */
    public Node search(int val){
        if (root == null){
            return null;
        }else {
            return root.search(val);
        }
    }

    /**
     * 查询父节点
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

        //找出最小值
        while (target.left !=null){
            target = target.left;
        }

        //找到最小值节点
        delNode(target.value);
        return target.value;
    }

    /**
     * 删除节点
     */
    public void delNode(int val){
        if (root == null){
            return;
        }else {
            //1.按照需求先去找要删除的节点
            Node target = search(val);
            if (target == null){
                return;
            }

            //1.如果这个二叉排序树只存在一个节点
            if (root.left == null && root.right == null){
                root = null;
                return;
            }

            //2.找到目标节点的父结点
            Node parentNode = searchParent(val);

            //3.如果要删除的节点时叶子节点
            if (target.left == null && target.right == null){
                //判断target是父结点的左子节点还是父结点的右子节点
                if (parentNode.left !=null && parentNode.left.value == val){
                    //表示是左子节点
                    parentNode.left = null;
                }else if (parentNode.right !=null && parentNode.right.value == val){
                    parentNode.right = null;
                }
            }else if (target.left !=null && target.right !=null){
                //删除的是带有左右子树的节点
                int minValue = delRightTreeMinNode(target.right);
                target.value = minValue;

            }else {//删除的只有一颗子树节点
                //如果是左子树
                if (target.left !=null){
                    //父节点不能为空
                    if (parentNode !=null){
                        //如果target是parentNode左子节点
                        if (parentNode.left.value == val){
                            //把目标节点左子节点给父节点左节点
                            parentNode.left = target.left;
                        }else {
                            //如果target是parentNode右子节点
                            parentNode.right = target.left;
                        }

                    }else {

                        root = target.left;
                    }

                }else {//如果删除的节点是右节点

                    if (parentNode !=null){
                        //如果target是parentNode的左子节点
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
     * 添加
     */
    public  void add(Node node){
        if (root == null){
            root = node;
        }else {
            root.add(node);
        }
    }

    /**
     * 中序遍历
     */
    public void infixSelect(){
        if (root !=null){
            root.infixSelect();
        }else {
            System.out.println("二叉排序树为空...");
        }
    }


}