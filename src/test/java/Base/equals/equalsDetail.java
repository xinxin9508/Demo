package Base.equals;

public class equalsDetail {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);
        Person jack1 = new Person("jack", 18);
        System.out.println(jack.equals(jack1));
    }
}

class Person{
    public String name;
    public int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            return ((Person) obj).name.equals(this.name) && ((Person) obj).age == this.age;
        }
        return false;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}