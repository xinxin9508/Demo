package javaStudyDemo;

import java.util.Scanner;

public class Method02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("请输入一个数字");
        int a = input.nextInt();
        Tools t = new Tools();
//        if (t.m1(a)){
//            System.out.println(a+"这个数字为奇数");
//        }else {
//            System.out.println(a+"这个数字为偶数");
//        }
        t.print1(a,4,'#');
    }
}
class Tools{
    public boolean m1(int num1){
//        double b = num1%2;
//        if (b == 0) {
//            return true;
//        }else {
//            return false;
//        }
        //三元运算符
        return num1 % 2 != 0 ? true:false;
//        return num1%2 != 0;
    }

    public void print1(int num1,int num2,char c){
        for (int i = 0; i < num1; i++) {
//            print2(num2);
            for (int j = 0; j < num2; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void  print2(int num2){
        for (int i = 0; i < num2; i++) {
            System.out.print("#");
        }
    }
}