import java.util.Arrays;

public class test1 {
    /**
     * 关于String的==和eequals的比较测试
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{2,4,11,3};

        System.out.println(Arrays.toString(array));


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode l3 = l1;
        ListNode l4 = l2;
        int i=0;
        int j=0;
        while (l3.next!=null){
            i++;
            l3=l3.next;
        }
        while (l4.next!=null){
            i++;
            l4=l4.next;
        }
        /**
         * 1.判断能否相加
         * 2.相加判断是否大于10
         */
        if(i>j){
            int l = 0;
            for(int k=0;k<i;k++){
                if (l3.val+l4.val+l >=10){
                    listNode.val = l3.val+l4.val+l - 10;
                    l = 1;
                }else {
                    listNode.val = l3.val+l4.val+l;
                    l = 0;
                }
                l3 =l3.next;
                listNode = listNode.next;
            }
        }


        return null;
    }


}