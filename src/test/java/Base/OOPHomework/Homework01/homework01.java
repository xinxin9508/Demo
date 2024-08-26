package Base.OOPHomework.Homework01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack", 10, "stu");
        person[1] = new Person("smith", 30, "player");
        person[2] = new Person("amy", 25, "tester");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println("=====================");
        for (int i = 0; i < person.length - 1; i++) {
            Person tmp = null;
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() > person[j + 1].getAge()) {
                    tmp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

    }
}

class Person {
    public String name;
    public int age;
    public String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}