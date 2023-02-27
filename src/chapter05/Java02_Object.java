package chapter05;

public class Java02_Object {
    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组
//        User1 user1 = new User1();
//        User1 user2 = new User1();
//        User1 user3 = new User1();
//        User1 user4 = new User1();
//
//        user1.test();
//        user2.test();
//        user3.test();
//        user4.test();

        // 0, 1, 2, 3
        User1[] users = new User1[5];
        for ( int i = 0; i < users.length; i++ ) {
            users[i] = new User1();
        }
        for ( int i = 0; i < users.length; i++ ) {
            users[i].test();
        }


        // TODO 数组的声明方式：类型[] 变量；
        // TODO 数组的创建：new 类型[容量]；
        String[] names = new String[3];
        // 给数组的小格子添加数据，添加的方式为 ：数组变量[索引] = 数据
        // 添加数据和访问数据时，索引是不能超过指定的范围的（0 ~ length-1）
        // 如果重复给相同的索引添加数据，那么等同于修改数据
        names[0] = "zhangsan";
        names[0] = "zhaoliu";
        names[1] = "lisi";
        names[2] = "wangwu";
        //names[3] = "zhaoliu";

        // 查询(访问)数据，访问的方式为 ：数组变量[索引]
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
        System.out.println("***************************************");
        for ( int i = 0; i < 3; i++ ) {
            System.out.println(names[i]);
        }
    }
}
class User1 {

    public void test() {
        System.out.println("test...");
    }
}
