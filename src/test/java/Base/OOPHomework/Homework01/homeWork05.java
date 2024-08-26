package Base.OOPHomework.Homework01;

public class homeWork05 {
    public static void main(String[] args) {
        staff01 worker01 = new Work(3000,12);
        System.out.println(worker01.salaryInfo());

    }
}

class staff01{
    private double salary;
    private int days;

    public staff01(double salary,int days) {
        this.salary = salary;
        this.days = days;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String salaryInfo(){
        return " 工资="+getSalary()*getDays();
    }
}

class Work extends staff01{
    public Work(double salary,int days) {
        super(salary,days);
    }

    @Override
    public String salaryInfo() {
        return "工人"+super.salaryInfo();
    }
}

class Peasant extends staff01{
    public Peasant(double salary,int days) {
        super(salary,days);
    }

    @Override
    public String salaryInfo() {
        return "农民"+super.salaryInfo();
    }
}
class Teacher extends staff01{
    private double Lesson;

    public Teacher(double salary, int days,double Lesson) {
        super(salary, days);
        this.Lesson = Lesson;
    }

    public double getLesson() {
        return Lesson;
    }

    public void setLesson(double lesson) {
        Lesson = lesson;
    }

    @Override
    public String salaryInfo() {
        return "教师"+super.salaryInfo()+super.getDays()*getLesson();
    }
}
class Scientist extends staff01{
    private double bouns;

    public Scientist(double salary, int days, double bouns) {
        super(salary, days);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public String salaryInfo() {
        return "科学家"+super.salaryInfo()+getBouns();
    }
}
class Waiter extends staff01{
    public Waiter(double salary,int days) {
        super(salary,days);
    }

    @Override
    public String salaryInfo() {
        return "服务生"+super.salaryInfo();
    }
}