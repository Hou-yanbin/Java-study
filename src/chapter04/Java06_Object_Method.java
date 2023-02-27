package chapter04;

public class Java06_Object_Method {
    public static void main(String[] args) {

        // TODO 面向对象 - 方法
        // 类的行为称之为方法。
        // TODO 基本的语法为：void 方法名（）{ 方法的逻辑代码 }
        // 既然方法是对象的行为，那么行为就会有结果，而结果可能会对其他对象有影响
        // TODO 扩展语法： 返回值类型[void] 方法名（）{ 方法的逻辑代码 }
        //  方法就是行为，所以会有结果，如果想要结果给其他人使用，那么需要在方法中返回这个结果。
        //       void关键字表示无需返回，也就是方法的结果没有人使用。
        //  如果想要结果给其他人使用，那么需要在方法中返回结果，并将void改成返回值的类型。
        //  方法的结果需要采用return关键字进行返回。
        User06 user = new User06();
        boolean registerResult = user.register();
        if ( registerResult ) {
            System.out.println("注册成功，请登录");
            boolean loginResult = user.login();
            if (loginResult) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
        } else {
            System.out.println("注册不成功，请重新注册");
        }
    }
}
class User06 {

    boolean register() {
        System.out.println("注册软件系统");
        // 成功 true
        return false;
        // 失败 false
    }
    boolean login() {
        System.out.println("登录软件系统");
        return true;
    }
}

