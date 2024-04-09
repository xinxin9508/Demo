package javaStudyDemo;

public class gouzaoqi {
    public static void main(String[] args) {
        PersonTest p1 = new PersonTest();
        System.out.println("第一个构造器 name=" + p1.name + "age= " + p1.age);
        PersonTest p2 = new PersonTest("join",20);
        System.out.println("第二个构造器 name=" + p2.name + "age= " + p2.age);
    }
}
class PersonTest{
    int age;
    String name;
    public PersonTest(){
        age = 18;
    }
    public PersonTest(String Pname,int Page){
        age = Page;
        name = Pname;
    }
}
