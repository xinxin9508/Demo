package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork11 {
    public static void main(String[] args) {

    }
}

class Employee{

    String name;
    String gender;
    int age;
    String position;
    double source;


    public Employee(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, double source){
        this.position = position;
        this.source = source;
    }
    public Employee(String name, String gender, int age, String position, double source){
        this(name, gender, age);
        this.position = position;
        this.source = source;
    }

}
