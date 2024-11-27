package javaoop.lab.atm;

import java.util.Scanner;

public class ATM {
    public static void withdraw(Account ac) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your withdraw value:");
        double a=sc.nextDouble();
        if (a<ac.getAmount()) {
            System.out.println("Your account does not have enough money!");
            return;
        }
        ac.withdraw(a);
    }
    public static void deposit(Account ac) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your deposit value:");
        double a=sc.nextDouble();
        ac.deposit(a);
    }
    public static String viewAmount(Account ac) {
        return "Your amount is: "+ac.getAmount();
    }
    public static void transferMoney(Account ac1, Account ac2) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your value to transfer:");
        double a=sc.nextDouble();
        ac1.withdraw(a);
        ac2.deposit(a);
        System.out.println("Transfer successfully!");
    }
    public static void main(String[] args) {
        Account ac1=new Account(),ac2=new Account();
        ac1.nhap(); ac2.nhap();
        System.out.println(ATM.viewAmount(ac1));
        System.out.println(ATM.viewAmount(ac2));
        ATM.deposit(ac2);
        ATM.transferMoney(ac1, ac2);
        System.out.println(ATM.viewAmount(ac1));
        System.out.println(ATM.viewAmount(ac2));
    }
}
