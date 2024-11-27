package javaoop.lab.introduce;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int greatestCommonDivisor (int a, int b) {
        while (b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(greatestCommonDivisor(a,b));
        sc.close();
    }
}
