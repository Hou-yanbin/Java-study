package chapter06;

public class Java01_Exception {
    public static void main(String[] args) {

        // TODO 错误
        // 1. 类型转换错误
//        String s = "123";
//        Integer i = (Integer)s;

        // 2. java.lang.StackOverflowError
        //    递归
        // Error : 错误
        //test();

        // 3. java.lang.NullPointerException
        // 异常 ： Exception
        // TODO 异常的分类
        // 3.1 可以通过代码恢复正常逻辑的异常,称之为运行期异常。（RuntimeException）
        // 3.2 不可以通过代码恢复正常逻辑的异常,称之为编译期期异常(Exception)
        User user = null;
        System.out.println(user.toString());
    }
    public static void test() {
        test();
    }
}
class User {

}
