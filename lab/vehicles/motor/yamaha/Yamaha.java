package javaoop.lab.vehicles.motor.yamaha;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Yamaha {
    public static void main(String[] args) {
        System.out.print("1. Input\n2. Display\n3. Sort\n4. Search\n5. Thoat\nChon 1 chuc nang: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do {
            Jupiter[] a=new Jupiter[3];
            Serius[] b=new Serius[3];
            if (n==1) {
                for (int i=0;i<3;i++) {
                    sc.nextLine();
                    a[i]=new Jupiter();
                    a[i].inputInfor();
                }
                for (int i=0;i<3;i++) {
                    sc.nextLine();
                    b[i]=new Serius();
                    b[i].inputInfor();
                }
            }
            else if (n==2) {
                Arrays.sort(a,new Comparator<Jupiter>() {
                    public int compare(Jupiter a1,Jupiter a2) {
                        if (a1.getWarranty()<a2.getWarranty()) return 1;
                        return 0;
                    }
                });
            }
        } while(n>0&&n<=5);
        sc.close();
    }
}
