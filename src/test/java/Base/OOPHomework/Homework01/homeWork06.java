package Base.OOPHomework.Homework01;

public class homeWork06 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(1000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(500);
        System.out.println(checkingAccount.getBalance());

    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //存款
    public void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount +1);
    }
}

//class SavingAccount extends BankAccount{
//
//}
