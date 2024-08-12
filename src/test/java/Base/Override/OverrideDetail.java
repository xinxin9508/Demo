package Base.Override;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * 1.方法重写：子类的参数列表和方法名称需要和父类的相同
 *           子类的返回类型需要和父类的一致或是父类返回类型的子类
 *           子类不能缩小父类的访问权限：public>protected>默认>private
 */
public class OverrideDetail {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
        Student gxy = new Student("顾鑫宇", 30, "944714", 100);
        System.out.println(gxy.say());
    }
}


class Animal{
    public void cry(){
        System.out.println("动物哭....");
    }

    public Object m1(){
        return true;
    }
}

class Dog extends Animal{

    @Override
    public void cry(){
        System.out.println("狗....");
    }

    @Override
    public String m1(){
        return "111";
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String say() {
        return "我的名字是：" + name + " 我的年龄是：" + age;
    }
}

class Student extends Person {
    private String id;
    private int score;

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + " 我的ID：" + " 我的成绩：" + score;
    }
}