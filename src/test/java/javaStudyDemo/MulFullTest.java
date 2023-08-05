package javaStudyDemo;

import java.util.Scanner;

public class MulFullTest {
    public static void main(String[] args) {
        int passNum = 0;
        double toatal = 0;
        Scanner input = new Scanner(System.in);
        for (int j = 1; j <= 3; j++) {
            double sum = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("请输入第" + j + "个班级第" + i + "个学生的成绩");
                double sorce = input.nextDouble();
                if (sorce >= 60) {
                    passNum++;
                }
                sum += sorce;
                System.out.println("成绩为" + sorce);
            }
            System.out.println("该班级总分为" + sum + "平均分为" + (sum / 5));
            toatal += sum;
        }
        System.out.println("班级总平均分为"+toatal/15);
        System.out.println("总共有"+passNum+"个及格");
    }
}
