package javaStudyDemo;

public class MethodParameter02 {
    public static void main(String[] args) {
        Person01 p1 = new Person01();
        p1.name = "jack";
        p1.age  = 20 ;
        copyPerson tool = new copyPerson();
        Person01 p2 = tool.copy(p1);
        System.out.println("p1的名字"+p1.name+"  p1的年龄"+p1.age);
        System.out.println("p2的名字"+p2.name+"  p2的年龄"+p2.age);
    }
}

class Person01{
    String name;
    int age;
}
class copyPerson{
   public Person01 copy(Person01 p){
       Person01 person01 = new Person01();
        person01.name = p.name;
        person01.age = p.age;
        return person01;
   }
}