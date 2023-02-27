package chapter02;

public class Java03_Datatype_3 {
    public static void main(String[] args) {

        // TODO byte和char的关系

        // char(16 bit) -> byte(8 bit)

        // asc码
        // gb2112 gbk
        // shift_jis

        // Java : Unicode
        //  asc码字符 ： 一个字节就是一个字符
        //  其他编码字符 ： 3个字节是一个字符
        String s = "中国a";
        String 姓名 = "中国a";

        // 获取字节的数量
        System.out.println(s.getBytes().length);
        // 获取字符的数量
        System.out.println(s.toCharArray().length);


    }
}
