package chapter02;

public class Java02_Identifier {
    public static void main(String[] args) {

        // TODO 标识符
        // 所谓得标识符，其实就是用于标记数据得符号，变量名就是标识符
        // 主要用于起名
        String name = "zhangsan";

        // TODO 标识符得命名规则
        // 1. 拉丁字母
        //    有意义得英文单词
        String username = "lisi";
        String xingming = "wangwu";
        // wx, qq
        // 2. 符号
        // @ # %
        // Java语法中只能使用美元$符号和下划线作为标识符，其他符号称之为特殊符号，不能作为标识符
        // 空格也属于特殊符号，所以也不能作为标识符使用
        String user_name = "zhangsan";
        String user$name = "zhangsan";
        //String user@name = "zhangsan";
        //String user#name = "zhangsan";
        //String user name = "zhangsan";

        // 3. 数字
        // 阿拉伯数字 0 ~ 9也可以作为标识符使用
        String name1 = "zhangsan";
        String name_1 = "zhangsan";
        // 如果标识符以数字开头，那么会被识别为数字，那么就不能作为标识符使用了。
        //String 1name = "zhangsan";

        // 4. 标识符得重复问题(区分大小写)
        // 在同一个大括号内，标识符不能重复
        // Java中标识符是区分大小写得。
        String Name = "lisi";

        // 5. 预先定义好得标识符名称（关键字，保留字）
        // 所有得关键字和保留字都是采用小写，所以如果采用大写是没有问题。
        String Static = "zhangsan";

        // 6. 多个单词拼接在一起(驼峰标识)
        String userName = "zhangsan";

        // 7 . 标识符得长度没有限制

    }
}
