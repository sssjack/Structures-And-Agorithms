package controller.Algorithm;

public class TestApp {
    public static void main(String[] args) {

    /**
     * ��������
     * ���ģ�aba racecar ��ǰ����Ӻ���ǰ���ض���һ����
     * ����ͨ������������ģ��ջ���ж�һ���ַ����Ƿ��ǻ�������
     */
        System.out.println(detecation("aba"));
//        detecation("aba");
    }

    public static boolean detecation(String val){
        /**
         * ��ʼ��ջ����
         */
        ArrayStack arrayStack = new ArrayStack(10);

        /**
         * ��ȡ�ַ�������
         */
        int length = val.length();
//        ���ַ���������λ�ȡ�ַ�ѹջ��������
        for(int i = 0;i<length;i++){
            arrayStack.push(val.charAt(i)) ;
        }
        /**
         * ��ȡ
         */
        String newVal = "";
        int length1 = arrayStack.length();

        for(int i = 0;i<length1;i++){
//            �Ƿ���һ����ջ
            if(!arrayStack.isEmpty()){
                char pop = (char)arrayStack.pop();
                newVal= newVal+pop;
            }
        }
        if(val.equals(newVal)){
            return true;
        }
        return false;

    }
}
