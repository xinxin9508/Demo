package javaStudyDemo;

public class Account {
    private String name;
    private double yue;
    private String mima;

    public Account() {
    }

    public Account(String name, double yue, String mima) {
        setName(name);
        setYue(yue);
        setMima(mima);
    }

    public String getName() {
        return this.name;
    }

    public double getYue() {
        return this.yue;
    }

    public String getMima() {
        return this.mima;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("输入的名字不符合");
            this.name = "无名";
        }
    }

    public void setYue(double yue) {
        if (yue <= 20) {
            this.yue = 0;
            System.out.println("输入的余额有误");
        } else {
            this.yue = yue;
        }
    }

    public void setMima(String mima) {
        if (mima.length() != 6) {
            System.out.println("输入的密码有误");
            this.mima = "944714";
        } else {
            this.mima = mima;
        }
    }
    public void setInfo(){
        System.out.println("名字= " + name + "余额= " + yue + "密码= " + mima);
    }
}
