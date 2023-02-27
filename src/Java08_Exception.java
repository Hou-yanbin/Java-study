public class Java08_Exception {
    public static void main(String[] args) {
        String account = "admin";
        String password = "admin";
//      String account = "zhangsan";//Exception in thread "main" AccountException: �˺��쳣������
//      String password = "123123";//Exception in thread "main" PasswordException: �����쳣������

        try {
            login(account,password);
        } catch (AccountException accountException){
            System.out.println("�˻��쳣,�޸�account�޸�Ϊadmin");
            account = "admin";
        } catch (PasswordException passwordException){
            System.out.println("�����쳣,�޸�password�޸�Ϊadmin");
            password = "admin";
        } catch (loginException loginException){
            System.out.println("������½���⣬��Ҫȷ�ϣ�");
        }
        finally {
            System.out.println("�˺�������ɣ�");
        }
    }
//    public static void login(String account,String password){
//        if (account != "admin"){
//            throw new AccountException("�˺��쳣������");
//        }
//        if (password != "admin"){
//            throw new PasswordException("�����쳣������");
//        }
//        System.out.println("��½�ɹ���");
//    }

    //��дRuntimeExceptionʱ��д��Ҫ����login�����쳣���ͣ���
    public static void login(String account,String password) throws AccountException,PasswordException{
        if (account != "admin"){
            throw new AccountException("�˺��쳣������");
        }
        if (password != "admin"){
            throw new PasswordException("�����쳣������");
        }
        System.out.println("��½�ɹ���");
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
//login��ص��쳣
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