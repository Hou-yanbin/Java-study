import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO �쳣
        /*

         �쳣�����﷨��

         TODO try :����
         TODO catch :  ��׽
            ��׽����쳣��ʱ����Ҫ�Ȳ�׽��ΧС���쳣��Ȼ���ٲ�׽��Χ����쳣
         TODO finally : ����

         try {
             ���ܻ�����쳣�Ĵ���
             ��������쳣����ôJVM�Ὣ�쳣���з�װ���γ�һ��������쳣�࣬Ȼ������쳣�׳�
             ���е��쳣���󶼿��Ա��׳�
         } catch ( �׳����쳣���� ��������(һ����e��ʾ) ) {
             �쳣�Ľ������
         } catch () {

         } finally {
            ����ִ�еĴ����߼�
         }


         */
        int i = 0;
        int j = 0;

        try {
            j = 10 / i;
        } catch (ArithmeticException e) {
            //e.getMessage() // �������Ϣ
            //e.getCause() //�����ԭ��
            //e.printStackTrace(); //����Ķ�ջ��Ϣ
            i = 10;
            j = 10 / i;
        } finally {
            System.out.println("����ִ�еĴ���");
        }

        System.out.println(j);
    }
}


