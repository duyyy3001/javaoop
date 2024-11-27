package javaoop.lab.introduce;
import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble();
        System.out.printf("%.2f",-b/a);
        sc.close();
    }
}