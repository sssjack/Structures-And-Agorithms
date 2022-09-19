package Algorithms.Link;

public class CircleSingleLinkedList {

    private Boy first = new Boy(-1);

    /**
     * ���ɻ����б�
     */
    public void addBoy(int nums) {
        if (nums < 1) {
            System.out.println("���ݲ���ȷ");
            return;
        }
        Boy temp = null;
        for (int i =1; i <= nums; i++) {
            Boy boy = new Boy(i);
            /**
             * �ж��Ƿ��ǵ�һ��С��
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

//    //����С���ڵ㣬�����ɻ�������
//    public void addBoy(int nums){
//        //�ж�������ʵ�ԣ�nums������У��
//        if (nums < 1 ){
//            System.out.println("nums��ֵ����ȷ");
//            return;
//        }
//        Boy curBoy = null;//����ָ�룬����������������
//        //ʹ��forѭ����������������
//        for (int i = 1;i <= nums;i ++){
//            //���ݱ�ţ�����С���ڵ�
//            Boy boy = new Boy(i);
//            //����ǵ�һ��С��
//            if (i == 1){
//                first = boy;
//                first.setNext(first);//���ɻ�״
//                curBoy = first;//��curBoyָ���һ��С��
//            }else {
//                curBoy.setNext(boy);//ǰ���ָ��������С��
//                boy.setNext(first);//����ӵ�С��ָ��ͷ�����ɻ���
//                curBoy = boy;//����
//            }
//        }
//    }


    /**
     * �鿴��������Ľڵ�
     */
    public void showBoy() {
        if (first == null) {
            System.out.println("����Ϊ��");
            return;
        }
        Boy boy = first;
        while (true) {
            System.out.printf("С���ӵı��%d\n", boy.getNo());
            if (boy.getNext() == first) {
                break;
            }
            boy = boy.getNext();
        }
    }

    /**
     * �����ø÷�������ڼ���С����ʼ�����������Σ������б�һ������С��
     *
     * @param startNo
     * @param countNum
     * @param nums
     */
    public void countBoy(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("���������д��󡣡���");
            return;
        }
        /**
         * ���帨��ָ�룬ָ���ε������е����һ���ڵ�
         */
        Boy helper = first;
        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        /**
         * Ѱ����ʼλ��
         */
        for(int j =0;j<startNo-1;j++){
            first = first.getNext();
            helper = helper.getNext();
        }

        /**
         * ��С�����б���ʱ������m�ĺ��ӽ��г��У���first��helper�ƶ�m-1���ɣ��ҵ��˳��к���
         */
        while (true){
            if(helper == first){
                break;
            }
            for(int j=0;j<countNum-1;j++){
                first= first.getNext();
                helper =helper.getNext();
            }
            System.out.printf("С����%d ����\n",first.getNo());
            first= first.getNext();
            helper.setNext(first);
            System.out.printf("����Ȧ��С���ӱ��%d\n",first.getNo());

        }
    }
}
