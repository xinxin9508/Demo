package javaStudyDemo;

import java.util.Scanner;

public class ForObject {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.name = "小白";
//        cat1.age = 10;
//        cat1.color = "白色";
//        System.out.println(cat1.name+cat1.age+cat1.color);
//        Car car1;
//        car1 = new Car();
//        car1.name = "大众";
//        car1.price = 10.5;
//        car1.color = "黑色";
//        Car car2 = car1;
//        System.out.println(car2.name+car2.price+car2.color);
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数");
        int i = input.nextInt();
        Person p1 = new Person();
//        p1.speak();
        int num1 = p1.cal01();
        int num2 = p1.cal02(i);
        p1.getsum(num1,num2);
        cal03();
    }

    public static void cal03(){
        int i = 0;
        for (int j = 1; j <= 2000; j++) {
            i = j + i;
        }
        System.out.println(i);
    }


}
class Cat{
    String name;
    int age;
    String color;
}

class Car{
    String name;
    double price;
    String color;
}
class Person{
    String name;
    int age;
    /*
    成员方法
    public 表示公共的
    void 表示没有返回值
    speak() speak方法名 () 表示没有参数
    {} 方法体
     */
    public void speak(){
        System.out.println("我是一个好人");
    }
    public int cal01(){
        int i = 0;
        for (int j = 1; j <= 1000; j++) {
            i = j + i;
        }
        System.out.println(i);
        return i;
    }
    /*
        int 表示会返回一个int类型的值
        return 返回
     */
    public int cal02(int i){
        int res = 0;
        for (int j = 1; j <= i; j++) {
            res +=j;
        }
        System.out.println("结果为"+res);
        return res;
    }
    public void getsum(int num1,int num2){
        System.out.println("和为"+(num1+num2));
    }
}
