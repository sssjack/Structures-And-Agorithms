package Algorithms.Link;

public class CircleSingleLinkedList {

    private Boy first = new Boy(-1);

    /**
     * 构成环形列表
     */
    public void addBoy(int nums) {
        if (nums < 1) {
            System.out.println("数据不正确");
            return;
        }
        Boy temp = null;
        for (int i =1; i <= nums; i++) {
            Boy boy = new Boy(i);
            /**
             * 判断是否是第一个小孩
             */
            if (i == 1) {
                first = boy;
                first.setNext(first);
                temp = first;
            } else {
                temp.setNext(boy);
                boy.setNext(first);
                temp = boy;
            }
        }
    }

//    //加入小孩节点，构建成环形链表
//    public void addBoy(int nums){
//        //判断数据真实性，nums做数据校验
//        if (nums < 1 ){
//            System.out.println("nums的值不正确");
//            return;
//        }
//        Boy curBoy = null;//辅助指针，帮助构建环形链表
//        //使用for循环来创建环形链表
//        for (int i = 1;i <= nums;i ++){
//            //根据编号，创建小孩节点
//            Boy boy = new Boy(i);
//            //如果是第一个小孩
//            if (i == 1){
//                first = boy;
//                first.setNext(first);//构成环状
//                curBoy = first;//让curBoy指向第一个小孩
//            }else {
//                curBoy.setNext(boy);//前面的指向新来的小孩
//                boy.setNext(first);//新添加的小孩指向开头，构成环形
//                curBoy = boy;//后移
//            }
//        }
//    }


    /**
     * 查看环形链表的节点
     */
    public void showBoy() {
        if (first == null) {
            System.out.println("链表为空");
            return;
        }
        Boy boy = first;
        while (true) {
            System.out.printf("小孩子的编号%d\n", boy.getNo());
            if (boy.getNext() == first) {
                break;
            }
            boy = boy.getNext();
        }
    }

    /**
     * 当调用该方法输入第几个小孩开始数数，数几次，环形列表一共几个小孩
     *
     * @param startNo
     * @param countNum
     * @param nums
     */
    public void countBoy(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入有错误。。。");
            return;
        }
        /**
         * 定义辅助指针，指向环形单链表中的最后一个节点
         */
        Boy helper = first;
        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        /**
         * 寻找起始位置
         */
        for(int j =0;j<startNo-1;j++){
            first = first.getNext();
            helper = helper.getNext();
        }

        /**
         * 当小孩进行报数时，数到m的孩子进行出列，让first和helper移动m-1即可，找到了出列孩子
         */
        while (true){
            if(helper == first){
                break;
            }
            for(int j=0;j<countNum-1;j++){
                first= first.getNext();
                helper =helper.getNext();
            }
            System.out.printf("小孩子%d 出列\n",first.getNo());
            first= first.getNext();
            helper.setNext(first);
            System.out.printf("最后出圈的小孩子编号%d\n",first.getNo());

        }
    }
}
