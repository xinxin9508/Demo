package javaStudyDemo;

import java.util.Scanner;

public class ForTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String pwd = "";
        int chance = 3;
        for (int i = 1; i < 4; i++) {
            System.out.println("请输入账号");
            name = input.next();
            System.out.println("请输入密码");
            pwd = input.next();
            if (name.equals("丁真") && pwd.equals("666")) {
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("输入错误请重新输入，还有"+chance+"次机会");
            }
        }
    }

