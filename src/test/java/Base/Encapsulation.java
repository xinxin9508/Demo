package Base;
//封装

/**
 * 1.属性私有化
 * 2.使用set和get方法调用
 */

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("顾鑫宇");
        person.setAge(30);
        person.setSalary(9000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 6 && name.length() >= 2) {
            this.name = name;
        } else {
            System.out.println("你设置的名字过长，给一个默认名字");
            this.name = "jack";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 120 && age >= 1) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，给一个默认的年龄");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "员工信息： name=" + name + " age=" + age + " salary=" + salary;
    }
}