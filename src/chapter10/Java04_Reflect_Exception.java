package chapter10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Java04_Reflect_Exception {
    public static void main(String[] args) throws Exception {

        // TODO 反射 - 练习
        // 员工的登录功能，

        // 1. ClassNotFoundException, 类找不到异常
        // 2. NoSuchMethodException, 没有方法的异常
        // 3. IllegalArgumentException, 参数异常
        // 4. NoSuchFieldException, 没有顺序的异常
        // 5. IllegalAccessException, 访问权限异常
        // 6. InvocationTargetException, 调用目标异常

        // 构造方法对象
        //Class empClass = Emp.class;
        //Class<? extends Emp> empClass = new Emp().getClass();
        Class<?> empClass = Class.forName("chapter10.Emp");

        Constructor declaredConstructor = empClass.getDeclaredConstructor();
        // 构建对象
        Object emp = declaredConstructor.newInstance();

        // 获取对象的属性
        Field account = empClass.getField("account");
        Field password = empClass.getField("password");

        // 给属性赋值
        account.set(emp, "admin");
        password.set(emp, "admin");

        // 获取登录方法
        Method login = empClass.getMethod("login");

        // 调用方法
        Object result = login.invoke(emp);

        System.out.println(result);
    }
}
// 员工
class Emp4 {
    public String account;
    public String password;

    public boolean login() {
        if ( "admin".equals(account) && "admin".equals(password) ) {
            return true;
        } else {
            return false;
        }
    }
}
