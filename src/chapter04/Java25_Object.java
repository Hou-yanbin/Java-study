package chapter04;

public class Java25_Object {
    public static void main(String[] args) {

        // TODO 面向对象
        // 1. 主要用于编写逻辑
        // 2. 主要用于建立数据模型(Bean)
        // TODO Bean类得设计规范：Bean规范
        // 1. 类要求必须含有无参，公共得构造方法
        // 2. 属性必须私有化，然后提供公共得，set，get方法
        User25 user = new User25();
        user.setAccount("admin");
        user.setPassword("admin") ;
        System.out.println(login(user));
    }
    public static boolean login( User25 user ) {
        if ( user.getAccount().equals("admin") && user.getPassword().equals("admin") ) {
            return true;
        } else {
            return false;
        }
    }
}
class User25 {
    private String account;
    private String password;

    public void setAccount( String account ) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return account;
    }

}
