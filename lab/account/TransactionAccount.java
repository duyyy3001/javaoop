package javaoop.lab.account;

public class TransactionAccount extends Account {
    public void deposit(double a) {
        amount+=a;
    }
    public void withdraw(double a) {
        amount-=a;
    }
}
