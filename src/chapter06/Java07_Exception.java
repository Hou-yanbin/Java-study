package chapter06;

public class Java07_Exception {
    public static void main(String[] args) throws Exception {

        // TODO 异常
        // 可以创建异常对象，并提供异常信息
        // 可以主动抛出异常，使用关键字throw
        // 如果方法抛出异常，那么可以使用throws关键字明确方法会抛出异常
        int i = 10;
        int j = 0;
        test(i, j);

    }
    public static void test( int i, int j ) throws Exception {
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw new Exception("除数为0");
        }

    }

}
