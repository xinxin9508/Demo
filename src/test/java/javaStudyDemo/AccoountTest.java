package javaStudyDemo;

public class AccoountTest {
    public static void main(String[] args) {
        setAndget setAndget = new setAndget();
        setAndget.set();
//        setAndget.get();


    }
}

class setAndget {
    public void set() {
        Account account = new Account();
        account.setName("gxy");
        account.setMima("123456");
        account.setYue(21);
        account.setInfo();
    }

//    public void get() {
//        String mima = account.getMima();
//        String name = account.getName();
//        double yue = account.getYue();
//        System.out.println("名字= " + name + "余额= " + yue + "密码= " + mima);
//    }
}
