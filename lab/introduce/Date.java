package javaoop.lab.introduce;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String day="";
        if (month<1||month>12) day="INVALID";
        else if (month==2) day="28";
        else if (month==4||month==6||month==9||month==11) day="30";
        else day="31";
        System.out.println(day);
        sc.close();
    }
}
