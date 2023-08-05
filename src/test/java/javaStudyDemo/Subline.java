package javaStudyDemo;

public class Subline {
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
}
