
package javaStudyDemo;

import org.testng.annotations.Test;

import java.util.Scanner;

public class IfStudy{
    public Scanner input = new Scanner(System.in);

    @Test
    public static void IfTest01(){
        double a = 10.8;
        double b = 19.2;
        if (a > 10.0 && b < 20.0) {
            System.out.println("a+b="+(a+b));
        }else {
            System.out.println("不符合");
        }
    }

    @Test
    public void Iftest02(){
        int a = 10;
        int b = 25;
        int c = a+b;
        if (c%3 == 0) {
            if (c%5==0){
                System.out.println("可以被3和5整除");
            }else {
                System.out.println("不能被5整除");
            }
        }else {
            System.out.println("不能被3整除");
        }
    }

    @Test
    public void IfTest03(){
        System.out.println("请输入年份");
        int year = input.nextInt();
        if ((year%4 ==0 && year%100 != 100) || year%400 ==0) {
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
    @Test
    public void IfTest04(){
        System.out.println("请输入保国同志的信用分");
        int a = input.nextInt();
        if (a == 100) {
            System.out.println("信用极好");
        }else if (a >80 && a <= 99){
            System.out.println("信用优秀");
        } else if (a >= 60 && a<=80) {
            System.out.println("信用一般");
        }else {
            System.out.println("信用不及格");
        }
    }


}
