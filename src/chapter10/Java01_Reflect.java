//package chapter10;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
//
//public class Java01_Reflect {
//    public static void main(String[] args) throws Exception {
//        // TODO 反射
//
//        // 多态
//        User user = new Child();
//        user.test1();
//        //user.test2();
//
//        // 类对象
//        Class<? extends User> aClass = user.getClass();
//
//        // TODO 获取类的名称
//        System.out.println(aClass.getName()); // 获取类的完整名称（包含包名）
//        System.out.println(aClass.getSimpleName()); // 获取类的名称
//        System.out.println(aClass.getPackageName()); // 获取类的包的名称
//
//        // TODO 获取类的父类
//        Class<?> superclass = aClass.getSuperclass();
//        System.out.println(superclass);
//
//        // TODO 获取类的接口
//        Class<?>[] interfaces = aClass.getInterfaces();
//        System.out.println(interfaces.length);
//
//        // TODO 获取类的属性
//        Field f = aClass.getField("xxxxx"); // public
//        Field f1 = aClass.getDeclaredField("xxxxx"); // 所有权限
//
//        Field[] fields = aClass.getFields();// public
//        Field[] declaredFields = aClass.getDeclaredFields(); // 所有权限
//
//        // TODO 获取类的方法
//        Method method = aClass.getMethod("test2");// public
//        Method xxxx = aClass.getDeclaredMethod("xxxx"); // 所有权限
//
//        Method[] methods = aClass.getMethods();// public
//        Method[] declaredMethods = aClass.getDeclaredMethods(); // 所有权限
//
//        // TODO 构造方法
//        Constructor<? extends User> constructor = aClass.getConstructor();
//        Constructor<?>[] constructors = aClass.getConstructors();
//        aClass.getDeclaredConstructor();
//
//        // TODO 获取权限(修饰符) ：多个修饰符会融合成一个int值
//        int modifiers = aClass.getModifiers();
//        boolean aPrivate = Modifier.isPrivate(modifiers);
//    }
//}
//class User {
//    public void test1() {
//        System.out.println("test1...");
//    }
//}
//class Child extends User {
//    public void test2() {
//        System.out.println("test2...");
//    }
//}