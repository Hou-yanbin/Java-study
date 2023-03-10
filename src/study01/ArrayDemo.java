package study01;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //1.使用Scanner进行录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数: ");
        int number = scanner.nextInt();

        //2.创建数组，存储学生成绩，动态初始化
        int[] score = new int[number];

        //3.给元素赋值
        System.out.println("请输入"+number+"个学生成绩：");
        for (int i = 0; i <score.length ; i++) {
            score[i]=scanner.nextInt();
        }

        //4,获取数组的最大值
        int maxScore = 0;
        for (int i = 0; i <score.length ; i++) {
            if (score[i]>maxScore){
                maxScore=score[i];
            }
        }

        //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
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
