package chapter04;
public class Java17_Object_Access_1 {
    public static void main(String[] args) {

        // TODO 面向对象 - 访问权限
        Person17 person = new Person17();

        // private : 同类
        // default ： 同类，同包（路径）
        // protected：同类，同包（路径），子类
        // public ：公共的
        // 所谓的访问权限，其实就是访问属性，方法的权力和限制。
        // 谁访问？Java17_Object_Access_1 -> super -> java.lang.Object
        // 访问谁的？Person17 -> super -> java.lang.Object(clone)
//        person.clone();
    }

}
class Person17 {

    void test() throws Exception {
        clone();
    }
}

