package Base.Poly.Persons;

public class Tercher extends Person {
    private int salary;

    public Tercher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " 薪水=" + salary;
    }

    public String teach(){
        return getName() + "正在教书...";
    }
}
