package Base.OOPHomework.Homework01;

public class homeWork04 {
    public static void main(String[] args) {
        Staff worker01 = new Manage("smaith",800,23,1.2);
        System.out.println(((Manage)worker01).StaffInfo());
        worker01 = new Worker("jack",500,23,1);
        System.out.println(((Worker)worker01).StaffInfo());
    }
}


class Staff {
    private String name;
    private double SingleSalary;
    private int day;
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Staff(String name, double singleSalary, int day, double grade) {
        this.name = name;
        SingleSalary = singleSalary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleSalary() {
        return SingleSalary;
    }

    public void setSingleSalary(double singleSalary) {
        SingleSalary = singleSalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String StaffInfo() {
        return "姓名=" + name + " 单日工资=" + SingleSalary + " 工作天数=" + day;
    }
}

class Manage extends Staff {

    public Manage(String name, double singleSalary, int day, double grade) {
        super(name, singleSalary, day, grade);
    }

    public double sumSalary() {
        return super.getDay() * super.getSingleSalary() * super.getGrade();
    }

    @Override
    public String StaffInfo() {
        return super.StaffInfo() + " 总工资=" + sumSalary();
    }
}

class Worker extends Staff {

    public Worker(String name, double singleSalary, int day, double grade) {
        super(name, singleSalary, day, grade);
    }

    public double sumSalary() {
        return super.getDay() * super.getSingleSalary() * super.getGrade();
    }

    @Override
    public String StaffInfo() {
        return super.StaffInfo() + " 总工资=" + sumSalary();
    }
}