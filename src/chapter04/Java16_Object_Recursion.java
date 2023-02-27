package chapter04;

public class Java16_Object_Recursion {
    public static void main(String[] args) {

        // TODO 面向对象 - 递归
        // 所谓的递归：方法调用自身，称之为递归方法
        // 1 + 3 + 5 + 7 + 9... + 19
//        int result = computeAP( 10 );
//        System.out.println(result);

        // 阶乘 ： 5! => (4,3,2,1) => 5 * 4 * 3 * 2 * 1
        //       0的阶乘为1.
        // 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘。
        int result = computeFactorial(50000);
        System.out.println(result);

        // 1. 递归方法应该有跳出的逻辑：StackOverflowError
        // 2. 调用自身时，传递的参数需要有规律
        //  345345 + 4543534 + 32423 + 43423 + 32423
    }
    public static int computeFactorial(int num) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num + computeFactorial(num - 1);
        }
    }
    public static int computeAP(int num) {
        num = num % 2 == 0 ? num - 1 : num;
        if ( num == 1 ) {
            return 1;
        } else {
            return num + computeAP(num - 2);
        }
    }

}
