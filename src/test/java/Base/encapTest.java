package Base;

public class encapTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jjjjjjjjjj");
        account.setBalance(1);
        account.setPassword("111");
        System.out.println(account.info());
        System.out.println(account.getPassword());
    }
}

class Account {
    public String name;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("你输入的名字不正确");
            this.name = "smith";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额错误");
            this.balance = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("你输入的密码有误");
            this.password = "888888";
        }
    }

    public String info() {
        return "账户信息： name=" + name + " balance=" + balance;
    }
}
