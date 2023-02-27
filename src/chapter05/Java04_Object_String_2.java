package chapter05;

public class Java04_Object_String_2 {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象

        // StringBuilder : 构建字符串
        // concat
//        String s = "";
//        for ( int i = 0; i < 100; i++ ) {
//            s = s + i; // 01234....
//        }
//        System.out.println(s);

        // "a" + "b" => "ab"
//        StringBuilder s = new StringBuilder();
//        for ( int i = 0; i < 100; i++ ) {
//            s.append(i);
//        }
//        System.out.println(s.toString());
        StringBuilder s = new StringBuilder();
        s.append("abc");
        System.out.println(s.toString());
        System.out.println(s.length());
        System.out.println(s.reverse()); // 反转字符串
        System.out.println(s.insert(1, "d"));

    }
}
