package chapter04;

public class Java15_Object_1 {
    public static void main(String[] args) {

        // TODO 面向对象 - 重写
        //CCC ccc = new CCC();
        //DDD ddd = new DDD();
        CCC ddd = new DDD();
        // 一个对象能使用什么方法，取决于引用变量的类型
        // 一个对象能使用什么属性，取决于引用变量的类型
        // 一个对象的方法具体的使用(直接，间接)是需要看具体的对象的
        // 一个对象的属性具体的使用是不需要看具体的对象的，属性在哪里声明在哪里使用
        // 我的理解是重写中，子类有同方法的调用子类,没有的话调用父类中的。。(例如：先在子类找sum(),没有的话再去父类中找sum(),
        //  然后先在子类找getI()，没有的话再去父类中找getI())
        System.out.println(ddd.sum());

    }
}
class CCC {
    int i = 10;
    int sum() {
        return getI() + 10;
    }
    int getI() {
        return i;
    }
}
class DDD extends CCC {
    int i = 20;
//    int sum() {
//        return i + 20;
//    }
    int getI() {
        return i;
    }
}