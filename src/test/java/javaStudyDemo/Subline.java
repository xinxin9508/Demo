package javaStudyDemo;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Subline {
    /**
     * 1.数组的动态初始化
     * 数组的定义 数据类型[] 数组名 = new 数据类型[大小]
     */

    static double[] hens = {1.1,55.2,633.96,2.4};

    public static void main(String[] args) {
        System.out.println("=======数组长度="+hens.length);
        double sum =0;
        //hens.length 数组的长度
        for (int i = 0; i < hens.length; i++) {
            sum += hens[i];
        }
        System.out.println("总体重为"+sum);
        System.out.println("平均体重为"+sum/hens.length);
    }
    @Test
    public static void subLine(){
        double[] line = new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < line.length; i++) {
            System.out.println("请输入");
            line[i] = input.nextDouble();
        }
        for (int i = 0; i < line.length; i++) {
            System.out.println("第"+i+"个数字为"+line[i]);
        }
    }
}
