package javaoop.lab.introduce;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Math=sc.nextDouble(),Physic=sc.nextDouble(), Chemistry=sc.nextDouble();
        double average=(Math+Physic+Chemistry)/3;
        if (average>=8) System.out.println("A");
        else if (average>=6.5&&average<8) System.out.println("B");
        else if (average>=5&&average<6.5) System.out.println("C");
        else System.out.println("D");
        sc.close();
    }
}
