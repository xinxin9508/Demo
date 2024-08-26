package Base.OOPHomework.Homework01;

public class Student extends Person01 {

    private int stu_id;

    public Student(String name, String sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String study() {
        return "我承诺，我会好好学习";
    }

    @Override
    public String play() {
        return super.play() + "爱玩足球";
    }

    @Override
    public String info() {
        System.out.println("------------------------");
        return super.info() + "\n学号=" + getStu_id() + this.study() + this.play();
    }
}
