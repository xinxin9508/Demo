package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork07 {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", "白色", 10);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.print("狗的名字=" + name + "\t");
        System.out.print("狗的颜色=" + color + "\t");
        System.out.print("狗的年龄=" + age + "\t");
    }
}