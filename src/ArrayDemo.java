import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //1.ʹ��Scanner����¼��
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ѧ������: ");
        int number = scanner.nextInt();

        //2.�������飬�洢ѧ���ɼ�����̬��ʼ��
        int[] score = new int[number];

        //3.��Ԫ�ظ�ֵ
        System.out.println("������"+number+"��ѧ���ɼ���");
        for (int i = 0; i <score.length ; i++) {
            score[i]=scanner.nextInt();
        }

        //4,��ȡ��������ֵ
        int maxScore = 0;
        for (int i = 0; i <score.length ; i++) {
            if (score[i]>maxScore){
                maxScore=score[i];
            }
        }

        //5.����ÿ��ѧ���ɼ�����߷ֵĲ�ֵ���õ�ÿ��ѧ���ĵȼ���������ȼ��ͳɼ�
        char level;
        for(int i = 0;i < score.length;i++) {
            if (maxScore - score[i] <= 10) {
                level = 'A';
            } else if (maxScore - score[i] <= 20) {
                level = 'B';
            } else if (maxScore - score[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student " + (i+1) + " score is " + score[i] + ",grade is " + level);
        }
    }
}
