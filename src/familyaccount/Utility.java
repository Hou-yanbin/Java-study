package familyaccount;

import java.util.Scanner;
/**
 Utility�����ࣺ
 ����ͬ�Ĺ��ܷ�װΪ���������ǿ���ֱ��ͨ�����÷���ʹ�����Ĺ��ܣ������迼�Ǿ���Ĺ���ʵ��ϸ�ڡ�
 */
public class Utility {
    private static Scanner scanner= new Scanner(System.in);
    /**
     ���ڽ���˵���ѡ�񡣸÷�����ȡ���̣�����û����롯1��-��4���е������ַ����򷽷����ء�����ֵΪ�û������ַ���
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("ѡ��������������룺");
            } else break;
        }
        return c;
    }

    /**
     ���������֧���������롣�÷����Ӽ��̶�ȡһ��������4λ���ȵ���������������Ϊ�����ķ���ֵ��
     */
    public static int readNumber() {
        int n;
        for (;;){
            String str =readKeyBoard(7);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("���������������������룺 ");
            }
        }
        return n;//û�д��ݲ��������ǿ����з���ֵ���������ݷ��ء�
    }

    /**
     ���������֧��˵��(��ע)�����롣�÷����Ӽ��̶�ȡһ��������8λ���ȵ��ַ�������������Ϊ�����ķ���ֵ��
     */
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }

    /**
     ����ȷ��ѡ������롣�÷����Ӽ��̶�ȡ��Y����N������������Ϊ�����ķ���ֵ��
     */
    public static char readConfirmSelection() {
        char c;
        for (;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y'||c == 'N'){
                break;
            }else {
                System.out.println("ѡ��������������룺");
            }
        }
        return c;
    }

    /*
    ��ȡ����������ַ����������ж�
     */
    private static String readKeyBoard(int limit){
        String words = "";
        while (scanner.hasNext()){
            words =scanner.nextLine();
            if (words.length()<1||words.length()>limit){
                System.out.println("���볤�ȣ�������" + limit + "���������������룺");
                continue;
            }
            break;
        }
    return words;
    }

}
