package Base.OOPHomework.Homework01;

public class HomeWork03 {
    public static void main(String[] args) {
        Tercher tercher01 = new Professor("smith",30,"正教授",30000);
        System.out.println(((Professor)tercher01).introduce());
        tercher01 = new fuProfessor("amy",29,"副主任",25000);
        System.out.println(((fuProfessor)tercher01).introduce());
        tercher01 = new lecturer("jack",24,"英语老师",15000);
        System.out.println(((lecturer)tercher01).introduce());

    }
}

class Tercher{
    private String name;
    private int age;

    public Tercher(String name, int age) {
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

    public String introduce(){
        return "姓名="+getName()+" 年龄="+getAge();
    }

}


class Professor extends Tercher{
    private String post;
    private double salary;

    public Professor(String name, int age, String post, double salary) {
        super(name, age);
        this.post = post;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary* 1.3;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(){
        return super.introduce()+" 职称="+getPost()+" 工资="+getSalary();
    }
}

class fuProfessor extends Tercher{
    private String post;
    private double salary;

    public fuProfessor(String name, int age, String post, double salary) {
        super(name, age);
        this.post = post;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary* 1.2;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(){
        return super.introduce()+" 职称="+getPost()+" 工资="+getSalary();
    }
}

class lecturer extends Tercher{
    private String post;
    private double salary;

    public lecturer(String name, int age, String post, double salary) {
        super(name, age);
        this.post = post;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary* 1.1;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(){
        return super.introduce()+" 职称="+getPost()+" 工资="+getSalary();
    }
}