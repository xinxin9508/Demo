package javaStudyDemo;

import java.util.Scanner;

public class UntilStudy_ScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = input.next();
        System.out.println("输入年龄");
        int age = input.nextInt();
        System.out.println("输入薪水");
        double sel = input.nextDouble();
        System.out.println("姓名："+name+"年龄"+age+"薪水："+sel);
    }
}
