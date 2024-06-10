package javaStudyDemo;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("gxy",18);
        Student student = new Student("ggg",18,123, 9508);
        System.out.println(student.say());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public String say() {
        return "name=" + name + "age=" + age;
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student() {

    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + "id=" + id + "score=" + score;
    }
}