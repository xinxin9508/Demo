package javaStudyDemo;

import java.util.Scanner;

public class switchTest  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c1 = input.next().charAt(0);
        switch (c1){
            case 'a' :
                System.out.println("今天是周一");
                break;
            case 'b' :
                System.out.println("今天是周二");
                break;
            case 'c' :
                System.out.println("今天是周三");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
