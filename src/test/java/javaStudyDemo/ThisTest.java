package javaStudyDemo;

public class ThisTest {
    public static void main(String[] args) {
        PersonT t1 = new PersonT("jack",10);
        PersonT t2 = new PersonT("jac",10);
//        TestPerson test = new TestPerson();
//        boolean b = test.compareTo(t1,t2);
//        System.out.println(b);
        System.out.println("比较结果" + t1.compareTo(t2));
    }
}
class PersonT{
    String name;
    int age;

    public PersonT(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(PersonT p){
        return this.name == p.name && this.age == p.age;

    }
}
class TestPerson{

    public boolean compareTo(PersonT t1, PersonT t2){
        return t1.name == t2.name && t1.age == t2.age;
    }
}