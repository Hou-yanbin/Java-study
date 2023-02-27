package chapter04;

public class Java07_Object_Method_Param_1 {
    public static void main(String[] args) {

        // TODO 面向对象 - 方法 - 参数
        // Java种方法参数的传递为值传递
        // 基本数据类型：数值
        // 引用数据类型：引用地址
//        String s = "abc";
//        test(s);
//        System.out.println(s);// abc10
        User user = new User();
        user.name = "zhangsan";
        test(user);
        System.out.println(user.name);

    }
//    public static void test(int i) {
//        i = i + 10;
//    }
//    public static void test(String s) {
//        s = s + 10;
//    }
    public static void test(User user) {
        user.name = "lisi";
    }
}
class User {
    String name;
}

