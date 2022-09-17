package controller.Algorithm;

public class ArrayStack {
//    ջ�Ĵ�С
    private int maxStack;
//    ģ��ջ
    private int[] stack;
//    ջ������λ�ã�Ĭ��Ϊ-1
    private int top =-1;
//
    public ArrayStack(int maxStack){
        this.maxStack=maxStack;
        stack = new int[maxStack];
    }

    /**
     * 1.ѹջ
     * 2.��ջ
     * 3.�ж��Ƿ��ǿ�ֵ
     * 4.�Ƿ�����ջ״̬
     */

    /*
    *�ж��Ƿ�����ջ
    */
    public Boolean isFull(){
        return this.top==this.maxStack-1;
    }
    /*
     *�ж��Ƿ�����ջ
     */
    public Boolean isEmpty(){
        return this.top==-1;
    }

    /*
     *ѹջ
     */
    public void push(int val){
//        �Ƿ��Ѿ�ռ��
        if(isFull()){
            throw new RuntimeException("��ջ����");
        }
        top++;
        stack[top]=val;
    }

    /*
     *��ջ
     */
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("��ջ");
        }
        int value = stack[top];
        top--;
        return value;
    }

    /*
    *�鿴ջ������Ԫ��
    */
    public void list(){
        if(isEmpty()){
            throw new RuntimeException("��ջ,δ�ҵ�����");
        }
        for (int i=0;i<stack.length;i++){
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

    /**
     * ջ��Ԫ�ش��ڵĸ���
     * @return ջ��Ԫ�ش��ڵĸ���
     */
    public int length(){
        return this.top+1;
    }

    /**
     * �ж��Ƿ���һ������� + - * /
     * @return ջ��Ԫ�ش��ڵĸ���
     */
    public boolean isOper(char v){
        return v=='+'||v=='-'||v=='*'||v=='/';
    }
    /**
     * �ж���������ȼ��������ֱ�ʾ���ȼ���С������Խ�����ȼ�Խ��
     */
    public int priority(int oper){
        if(oper=='*'||oper=='/'){
            return 1;
        } else if(oper=='+'||oper=='-'){
            return 0;
        }else {
            return -1;
        }
    }

    /**
     * ��ȡջ������
     */
    public int peek(){
        return this.stack[top];
    }

    /**
     * ��ȡջ������
     */
    public int stackLength(){
        return this.stack.length;
    }
    /**
     * ���������������Ľ��
     */
    public int calculate(int num1,int num2,int oper){
        //������
        int result = 0;
        switch (oper){
            case '+':
                result= num1+num2;
                break;
            case '-':
                result= num2-num1;
                break;
            case '*':
                result= num2*num1;
                break;
            case '/':
                result= num2/num1;
                break;
        }
        return result;
    }


}
