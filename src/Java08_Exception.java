public class Java08_Exception {
    public static void main(String[] args) {
        String account = "admin";
        String password = "admin";
//      String account = "zhangsan";//Exception in thread "main" AccountException: 账号异常！！！
//      String password = "123123";//Exception in thread "main" PasswordException: 密码异常！！！

        try {
            login(account,password);
        } catch (AccountException accountException){
            System.out.println("账户异常,修改account修改为admin");
            account = "admin";
        } catch (PasswordException passwordException){
            System.out.println("密码异常,修改password修改为admin");
            password = "admin";
        } catch (loginException loginException){
            System.out.println("其他登陆问题，需要确认！");
        }
        finally {
            System.out.println("账号流程完成！");
        }
    }
//    public static void login(String account,String password){
//        if (account != "admin"){
//            throw new AccountException("账号异常！！！");
//        }
//        if (password != "admin"){
//            throw new PasswordException("密码异常！！！");
//        }
//        System.out.println("登陆成功！");
//    }

    //不写RuntimeException时的写法要告诉login方法异常类型！！
    public static void login(String account,String password) throws AccountException,PasswordException{
        if (account != "admin"){
            throw new AccountException("账号异常！！！");
        }
        if (password != "admin"){
            throw new PasswordException("密码异常！！！");
        }
        System.out.println("登陆成功！");
    }
}
class AccountException extends loginException{
    public AccountException(String message){
        super(message);
    }
}
class PasswordException extends loginException{
    public PasswordException(String message){
        super(message);
    }
}
//login相关的异常
//class loginException extends RuntimeException{
//    public loginException(String message){
//        super(message);
//    }
//}

class loginException extends Exception{
    public loginException(String message){
        super(message);
    }
}