package Base.OOPHomework.Homework01;

public class Person01 {
    private String name;
    private String sex;
    private int age;

    public Person01(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return "\n"+getName();
    }

    public String info(){
        return "姓名="+getName()+"\n性别="+getSex()+"\n年龄="+getAge();
    }

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
