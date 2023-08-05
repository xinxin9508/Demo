package javaStudyDemo;

public class ForTest {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("9的倍数："+i);
                count++;
                sum += i;
            }
        }
        System.out.println("9的倍数总共有："+count);
        System.out.println("总和为"+sum);
    }
}
