package Algorithms.Algorithm;

public class TestStack {
    public static void main(String[] args) {
        String str = "4+3+2*3-1";
        /**
         * 1.遍历字符串，获取每一个字符
         * 2.判断是一个字符还是个数字
         * 3.把数字放在数字栈中，把运算符放在运算符栈中
         * 4.运算符栈：如果是一个空栈，直接入栈，如果已经存在其他运算符，则需要对比运算符优先级。
         * 新进来的运算符如果小于等于原栈中的运算符，则需要把原运算符弹栈，数字栈中数字进行弹栈，
         * 进行运算，运算后的结果，重新放入数字栈，新运算符入栈。
         * 如果新的运算符，优先级大于原符号栈中的运算符，那么新的符号直接入栈。
         */

        ArrayStack numStack = new ArrayStack(10);
        ArrayStack symbolStack = new ArrayStack(10);
        /**
         * 获取字符串的长度
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
             * 是否是一个运算符
             */
            if (symbolStack.isOper(c)) {
                /**
                 * 如果不是一个空栈
                 */
                if (!symbolStack.isEmpty()) {
//                  比较运算符的优先级
                    if (symbolStack.priority(c) < symbolStack.priority(symbolStack.peek())) {
                        /**
                         * 1.去符号栈中获取栈顶符号
                         * 2.去数字栈中获取两个数字
                         */
                        temp1 = numStack.pop();
                        temp2 = numStack.pop();
                        symbolChar = symbolStack.pop();
                        int calculate = numStack.calculate(temp1, temp2, symbolChar);
//                        把计算结果放入数字栈中
                        numStack.push(calculate);
//                        把当前结果压入符号栈
                        symbolStack.push(c);
                    } else {
                        symbolStack.push(c);
                    }
                } else {
//                    如果是空符号栈，将运算符直接压栈
                    symbolStack.push(c);
                }
            } else {
//                比如33+44
                values += c;
//                如果是最后一位
                if (i == length - 1) {
                    numStack.push(Integer.valueOf(values));
                } else {
//                    如果不是最后一位，需要判断数字的个数进行拼接
                    char c1 = str.substring(i + 1, i + 2).charAt(0);
                    if (symbolStack.isOper(c1)) {
                        numStack.push(Integer.valueOf(values));
//                        放入之后values要清空
                        values = "";
                    }
                }
            }
        }
        while (true) {
//            如果栈中已经为空则不需要计算
            if (symbolStack.isEmpty()) {
                break;
            }

            temp1 = numStack.pop();
            temp2 = numStack.pop();
            symbolChar = symbolStack.pop();
//            将两个数据进行计算
            result = numStack.calculate(temp1, temp2, symbolChar);
//            将结果再次压入到栈中，最后只剩一个数据
            numStack.push(result);
        }
        int res = numStack.pop();
        System.out.println("结果是"+res);

    }

}
