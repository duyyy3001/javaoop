package javaoop.lab.vehicles.vehicle;

import java.util.Scanner;
import JavaOOP.MyLib.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("1. Input\n2. Display\n3. Sort by price\n4. Search by model\n5. Exit\nChoose a function: ");
        Car[] a=new Car[3];
        Truck[] b=new Truck[3];
        do{
            n=sc.nextInt();
            if (n==1) {
                System.out.print("Nhap thong tin cho 3 xe con\n");
                sc.nextLine();
                for (int i=0;i<3;i++) {
                    a[i]=new Car();
                    a[i].input();
                }
                System.out.print("Nhap thong tin cho 3 xe tai\n");
                for (int i=0;i<3;i++) {
                    b[i]=new Truck();
                    b[i].input();
                }
            }
            else if (n==2) {
                System.out.println("Thong tin xe con:");
                for (int i=0;i<3;i++) a[i].display();
                System.out.println("Thong tin xe tai:");
                for (int i=0;i<3;i++) b[i].display();
            }
            else if (n==3) {
                
            }
            else if (n==4) {
                System.out.print("Nhap mau ma can tim: ");
                String str=sc.nextLine();
                boolean check=true;
                for (int i=0;i<3;i++) {
                    if (StringCompare.compare(str, a[i].getModel())) {check=false; a[i].display();}
                }
                for (int i=0;i<3;i++) {
                    if (StringCompare.compare(str, b[i].getModel())) {check=false; b[i].display();}
                }
                if (check) System.out.println("Model nay khong ton tai!");
            }
        } while(n<5);
        sc.close();
    }
}
