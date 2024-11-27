package javaoop.lab.account;

import java.util.Scanner;

public abstract class Account {
    protected String accountNo, ownerName, accountType;
    protected double amount;
    public Account () {
        accountNo=ownerName=accountType="";
        amount=-1.0f;
    }
    public Account (String accountNo, String onwnerName, double amount, String accountType) {
        this.accountNo=accountNo;
        this.ownerName=onwnerName;
        this.amount=amount;
        this.accountType=accountType;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so tai khoan:");
        accountNo=sc.nextLine();
        System.out.print("Nhap ten:");
        ownerName=sc.nextLine();
        System.out.print("Nhap so du:");
        amount=sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap loai tai khoan:");
        accountType=sc.nextLine();
    }
    public void setAccountNo(String a) {
        accountNo=a;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setOwnerName(String a) {
        ownerName=a;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setAmount(double a) {
        amount=a;
    }
    public double getAmount() {
        return amount;
    }
    public void setAccountType(String a) {
        accountType=a;
    }
    public String getAccountType() {
        return accountType;
    }
    public abstract void deposit(double a);
    public abstract void withdraw(double a); 
    public String toString() {
        return accountNo+" "+ownerName+" "+amount+" "+accountType;
    }
}
