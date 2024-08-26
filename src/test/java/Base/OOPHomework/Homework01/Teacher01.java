package Base.OOPHomework.Homework01;

public class Teacher01 extends Person01 {
    private int work_age;

    public Teacher01(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public String teach() {
        return "我承诺，我会认真教学";
    }

    @Override
    public String play() {
        return super.play() + "爱玩象棋";
    }

    @Override
    public String info() {
        System.out.println("------------------------");
        return super.info() + "\n工龄=" + getWork_age() +"\n"+this.teach()+this.play();
    }
}
