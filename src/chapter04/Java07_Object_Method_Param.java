package chapter04;

public class Java07_Object_Method_Param {
    public static void main(String[] args) {

        // TODO 面向对象 - 方法 - 参数
        // 从外部获取数据控制方法的内容逻辑实现的语法操作，我们称之为参数。也叫方法参数。
        // 方法的参数语法类似于变量：类型 名称，但是需要在方法后面的小括号中使用
        // 参数可以有多个，如果有多个，那么使用逗号隔开。
        // 如果方法声明了参数，那么调用时必须传递参数，否则发生错误。
        // TODO 扩展语法： 返回值类型[void] 方法名（参数类型 参数名）

        // 如果参数有多个的话，那么在传值的时候需要注意：
        // 1. 个数不能缺失
        // 2. 类型必须匹配
        // 3. 顺序必须匹配
        // 将方法后面的小括号中的所有参数称之为参数列表

        // 如果参数的类型(含义)相同，但是个数不确定的场合，JVM提供了可变参数 ： 参数的长度可变
        // 参数类型...参数名
        // 传值的个数也可以是变化的。

//        User07 user = new User07();
//        user.sayHello("zhangsan", 30);
//        user.sayHello(40, "lisi");
        User07 user = new User07();
        user.printUser(30);
        user.printUser(40, "zhangsan");
        user.printUser(50, "zhangsan", "lisi", "wangwu");

        // 如果参数列表中含有不同含义的多个参数，那么可变参数必须放置在最后，否则出现错误
    }
}
class User07 {

//    void sayHello( String name, int age ) {
//        System.out.println("Hello "+name);
//    }
    void printUser( int age, String... name  ) {
        System.out.println(name);
    }
}

