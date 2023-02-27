package chapter05;

public class Java05_Object_Datatype {
    public static void main(String[] args) throws Exception {

        // TODO 常见类和对象
        // byte short int long
        // float double
        // char
        // boolean
        // TODO 包装类
//        Byte b = null;
//        Short s = null;
//        Integer i = null;
//        Long lon = null;
//        Float f = null;
//        Double d = null;
//        Character c = null;
//        Boolean bln = null;
        int i = 10;
        //Integer i1 = new Integer(i);
        // TODO 将基本数据类型转换为包装类型
        // 自动装箱
        //Integer i1 = Integer.valueOf(i);
        Integer i1 = i;

        // 自动拆箱
        //int i2 = i1.intValue();
        int i2 = i1;

    }
}
