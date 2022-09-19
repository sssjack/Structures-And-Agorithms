package Algorithms.Algorithm;

public class TestStack {
    public static void main(String[] args) {
        String str = "4+3+2*3-1";
        /**
         * 1.�����ַ�������ȡÿһ���ַ�
         * 2.�ж���һ���ַ����Ǹ�����
         * 3.�����ַ�������ջ�У�����������������ջ��
         * 4.�����ջ�������һ����ջ��ֱ����ջ������Ѿ��������������������Ҫ�Ա���������ȼ���
         * �½�������������С�ڵ���ԭջ�е������������Ҫ��ԭ�������ջ������ջ�����ֽ��е�ջ��
         * �������㣬�����Ľ�������·�������ջ�����������ջ��
         * ����µ�����������ȼ�����ԭ����ջ�е����������ô�µķ���ֱ����ջ��
         */

        ArrayStack numStack = new ArrayStack(10);
        ArrayStack symbolStack = new ArrayStack(10);
        /**
         * ��ȡ�ַ����ĳ���
         */
        int temp1 = 0;
        int temp2 = 0;
        int symbolChar = 0;
        int result = 0;
        int length = str.length();
        String values = "";
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            /**
             * �Ƿ���һ�������
             */
            if (symbolStack.isOper(c)) {
                /**
                 * �������һ����ջ
                 */
                if (!symbolStack.isEmpty()) {
//                  �Ƚ�����������ȼ�
                    if (symbolStack.priority(c) < symbolStack.priority(symbolStack.peek())) {
                        /**
                         * 1.ȥ����ջ�л�ȡջ������
                         * 2.ȥ����ջ�л�ȡ��������
                         */
                        temp1 = numStack.pop();
                        temp2 = numStack.pop();
                        symbolChar = symbolStack.pop();
                        int calculate = numStack.calculate(temp1, temp2, symbolChar);
//                        �Ѽ�������������ջ��
                        numStack.push(calculate);
//                        �ѵ�ǰ���ѹ�����ջ
                        symbolStack.push(c);
                    } else {
                        symbolStack.push(c);
                    }
                } else {
//                    ����ǿշ���ջ���������ֱ��ѹջ
                    symbolStack.push(c);
                }
            } else {
//                ����33+44
                values += c;
//                ��������һλ
                if (i == length - 1) {
                    numStack.push(Integer.valueOf(values));
                } else {
//                    ����������һλ����Ҫ�ж����ֵĸ�������ƴ��
                    char c1 = str.substring(i + 1, i + 2).charAt(0);
                    if (symbolStack.isOper(c1)) {
                        numStack.push(Integer.valueOf(values));
//                        ����֮��valuesҪ���
                        values = "";
                    }
                }
            }
        }
        while (true) {
//            ���ջ���Ѿ�Ϊ������Ҫ����
            if (symbolStack.isEmpty()) {
                break;
            }

            temp1 = numStack.pop();
            temp2 = numStack.pop();
            symbolChar = symbolStack.pop();
//            ���������ݽ��м���
            result = numStack.calculate(temp1, temp2, symbolChar);
//            ������ٴ�ѹ�뵽ջ�У����ֻʣһ������
            numStack.push(result);
        }
        int res = numStack.pop();
        System.out.println("�����"+res);

    }

}
