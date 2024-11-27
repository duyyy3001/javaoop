package javaoop.lab.account;

public class SavingAccount extends Account {
    protected double interest;
    protected int term;
    public SavingAccount() {
        interest=0.0f;
        term=0;
    }
    public SavingAccount(String accountNo, String ownerName, double amount, String accountType, double interest, int term) {
        super(accountNo, ownerName, amount, accountType);
        this.interest=interest;
        this.term=term;
    }
    public void calculateInterest() {
        amount=amount*interest*term;
    }
    public void deposit(double a) {
        amount+=a;
    }
    public void withdraw(double a) {
        amount-=a;
    }
}