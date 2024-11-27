package javaoop.lab.introduce;

import java.util.Scanner;
import java.lang.Math;

public class Equation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        double delta=b*b-4*c*a;
        if (delta<0) System.out.println("No result");
        else if (delta==0) System.out.printf("%.2f",-b/2/a);
        else {
            System.out.print((b-Math.sqrt(delta))/2/a);
            System.out.print(" ");
            System.out.print((-b-Math.sqrt(delta))/2/a);
        }
        sc.close();
    }
}
